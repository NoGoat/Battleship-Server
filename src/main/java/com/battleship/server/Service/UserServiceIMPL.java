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
    public User getById(int id) throws Exception {
        if(userRepository.existsById(id))
        {
            return userRepository.getReferenceById(id);

        }
        else
        {
            throw new Exception("Data not found");
        }
    }

    @Override
    public Object save(UserDTO userDTO)
    {
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
}
