package com.company;

public class Main {

    public static void main(String[] args) {
        double gravity = -9.810; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;
        finalPosition = (gravity* fallingTime*fallingTime*0.5)+(initialVelocity*fallingTime) + initialPosition ;

        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");
    }
}
