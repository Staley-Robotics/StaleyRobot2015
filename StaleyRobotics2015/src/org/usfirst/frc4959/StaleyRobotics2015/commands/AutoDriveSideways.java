package org.usfirst.frc4959.StaleyRobotics2015.commands;

import org.usfirst.frc4959.StaleyRobotics2015.Robot;
import org.usfirst.frc4959.StaleyRobotics2015.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Author - Dustin Klein and Connor
 */
public class AutoDriveSideways extends Command {
	
	private static final Timer TIMER = new Timer();

    public AutoDriveSideways() {
    	requires(Robot.driveTrain);
    }

    protected void initialize() {
    	TIMER.start();
    	System.out.println("Timer started.");
    }

    protected void execute() {
    	RobotMap.drivetrainRobotDriveSideways.tankDrive(0.5, 0.5);
    }

    protected boolean isFinished() {
    	while (TIMER.get() < 1.5) {
    		return false;
    	}
    	return true;
    }

    protected void end() {
    	System.out.print("Auto Drive Sideways is Finished");
    	RobotMap.drivetrainRobotDriveSideways.stopMotor();
    	TIMER.stop();
    	TIMER.reset();
    }

    protected void interrupted() {
    }
}
