package lld.strategyPattern;

import lld.strategyPattern.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategyObj;  // Interface object

    // constructor Injection
    Vehicle(DriveStrategy driveObj) {   // it will take either normal or special obj and call its method in drive class
        this.driveStrategyObj = driveObj;
    }

    public void drive() {
        driveStrategyObj.drive();
    }
}
