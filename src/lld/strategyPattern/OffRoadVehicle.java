package lld.strategyPattern;

import lld.strategyPattern.strategy.SpecialDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle() { super (new SpecialDriveStrategy()); };
}
