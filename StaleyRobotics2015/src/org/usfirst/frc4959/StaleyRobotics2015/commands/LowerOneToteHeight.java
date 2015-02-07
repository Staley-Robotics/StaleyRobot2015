package org.usfirst.frc4959.StaleyRobotics2015.commands;

import org.usfirst.frc4959.StaleyRobotics2015.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Author - Dustin Klein
 */
public class LowerOneToteHeight extends Command {

    public LowerOneToteHeight() {
    	requires(Robot.elevator);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.elevator.setSetpoint(Robot.elevator.getPosition() - 1);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
