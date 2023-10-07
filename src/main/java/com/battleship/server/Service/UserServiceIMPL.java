package com.battleship.server.Service;

import com.battleship.server.DTO.UserDTO;
import com.battleship.server.Entity.User;
import com.battleship.server.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceIMPL implements UserService
{
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO getById(int id) throws Exception {
        if(userRepository.existsById(id))
        {
            User user = userRepository.getReferenceById(id);
            UserDTO userDTO = new UserDTO();
            userDTO.setUsername(user.getUsername());
            userDTO.setPassword(user.getPassword());
            userDTO.setEmail(user.getEmail());
            userDTO.setFirstname(user.getFirstname());
            userDTO.setLastname(user.getLastname());
            userDTO.setIs_admin(user.getIs_admin());
            return userDTO;
        }
        else
        {
            throw new Exception("Data not found");
        }
    }

    @Override
    public Object save(UserDTO userDTO)
    {
        try {
            User user = new User();
            user.setUsername(userDTO.getUsername());
            user.setPassword(userDTO.getPassword());
            user.setEmail(userDTO.getEmail());
            user.setFirstname(userDTO.getFirstname());
            user.setLastname(userDTO.getLastname());
            user.setIs_admin(userDTO.getIs_admin());
            userRepository.save(user);
            return user;
        }
        catch (Exception ex){
            return ex;
        }
    }
}
