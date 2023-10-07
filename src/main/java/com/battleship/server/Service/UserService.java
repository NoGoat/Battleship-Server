package com.battleship.server.Service;

import com.battleship.server.DTO.UserDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService
{
    UserDTO getById(int id) throws Exception;

    Object save(UserDTO userDTO);
}
