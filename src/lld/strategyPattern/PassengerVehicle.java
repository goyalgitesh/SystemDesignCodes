package lld.strategyPattern;

import lld.strategyPattern.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {

    PassengerVehicle() { super (new NormalDriveStrategy()); };

}
