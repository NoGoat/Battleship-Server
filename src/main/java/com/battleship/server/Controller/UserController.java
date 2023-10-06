package com.battleship.server.Controller;

import com.battleship.server.DTO.UserDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController
{
    @PostMapping
    public Object saveUser(@RequestBody UserDTO userDTO)
    {
        return (userDTO);
    }
}
