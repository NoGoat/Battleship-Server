package com.battleship.server.Service;

import com.battleship.server.DTO.UserDTO;
import com.battleship.server.Entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService
{
    User getById(int id) throws Exception;

    Object save(UserDTO userDTO);
}
