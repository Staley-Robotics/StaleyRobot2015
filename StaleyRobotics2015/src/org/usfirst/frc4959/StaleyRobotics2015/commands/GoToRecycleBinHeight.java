package org.usfirst.frc4959.StaleyRobotics2015.commands;

import org.usfirst.frc4959.StaleyRobotics2015.Robot;
import org.usfirst.frc4959.StaleyRobotics2015.subsystems.Elevator;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Authors - Dustin Klein, Connor, Dillon
 */
public class GoToRecycleBinHeight extends Command {

    public GoToRecycleBinHeight() {
    	requires(Robot.elevator);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.elevator.setSetpoint(Elevator.recycleBinHeight);
    }

    protected boolean isFinished() {
    	return Math.abs(Robot.elevator.getSetpoint() - Robot.elevator.getPosition()) < 0.1;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
