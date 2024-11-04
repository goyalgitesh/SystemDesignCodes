package lld.strategyPattern;

import lld.strategyPattern.strategy.SpecialDriveStrategy;

public class SportsVehicle extends Vehicle {
    SportsVehicle() { super (new SpecialDriveStrategy()); };
}
