package com.battleship.server.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Placement {

    @Id
    @GeneratedValue
    private int id;

    private int[] aircraftCarrier = new int[5];

    private int[] battleship = new int[4];

    private int[] submarine = new int[3];

    private int[] cruiser = new int[3];

    private int[] destroyer = new int[2];

}
