package com.battleship.server.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlacementDTO {

    private int[] aircraftCarrier = new int[5];

    private int[] battleship = new int[4];

    private int[] submarine = new int[3];

    private int[] cruiser = new int[3];

    private int[] destroyer = new int[2];
}
