package com.battleship.server.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Results
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String winner;

    private String loser;

    private Timestamp time;

    private String match_id;
}
