package com.battleship.server.Controller;

import com.battleship.server.DTO.UserDTO;
import com.battleship.server.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController
{

    @Autowired
    private UserService userService;

    @PostMapping
    public Object saveUser(@RequestBody UserDTO userDTO)
    {
        return userService.save(userDTO);
    }

    @GetMapping("/{id}")
    private Object getUser(@PathVariable("id") int id)
    {
        try
        {
            return userService.getById(id);
        }
        catch (Exception ex)
        {
            return ex;
        }
    }
}
