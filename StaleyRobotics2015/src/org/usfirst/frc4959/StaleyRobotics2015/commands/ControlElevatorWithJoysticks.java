package org.usfirst.frc4959.StaleyRobotics2015.commands;

import org.usfirst.frc4959.StaleyRobotics2015.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Author Dustin Klein and Saul A.
 */
public class ControlElevatorWithJoysticks extends Command {

    public ControlElevatorWithJoysticks() {
    	requires(Robot.elevator);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.elevator.elevator(Robot.oi.getLeftJoystickY());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
