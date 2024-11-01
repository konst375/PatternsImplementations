package org.chirko.creational;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Car {
    protected String carType;
    protected int seats;
    protected String engine;
    protected String gearbox;
    protected String wheelDrive;
}
