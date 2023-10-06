package com.battleship.server.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO
{
    private String username;

    private String password;

    private String email;

    private String firstname;

    private String lastname;

    private String is_admin;
}
