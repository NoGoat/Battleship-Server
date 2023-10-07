package com.battleship.server.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResultsDTO {

    private String winner;

    private String loser;

    private Timestamp time;

    private String match_id;
}
