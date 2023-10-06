package com.battleship.server.Service;

import com.battleship.server.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceIMPL implements UserService
{
    @Autowired
    private UserRepository userRepository;
}
