package org.usfirst.frc4959.StaleyRobotics2015.commands;

import org.usfirst.frc4959.StaleyRobotics2015.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ClearElevatorHeight extends Command {

    public ClearElevatorHeight() {
    	requires(Robot.elevator);
    }

    protected void initialize() {
    }

	protected void execute() {
		Robot.elevator.disable();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
