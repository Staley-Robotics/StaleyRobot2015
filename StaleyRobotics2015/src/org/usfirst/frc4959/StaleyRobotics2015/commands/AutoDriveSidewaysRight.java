package org.usfirst.frc4959.StaleyRobotics2015.commands;

import org.usfirst.frc4959.StaleyRobotics2015.Robot;
import org.usfirst.frc4959.StaleyRobotics2015.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Author - Dustin Klein and Connor
 */
public class AutoDriveSidewaysRight extends Command {
	
	private static final Timer TIMER = new Timer();

    public AutoDriveSidewaysRight() {
    	requires(Robot.driveTrain);
    }

    protected void initialize() {
    	TIMER.start();
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
    	RobotMap.drivetrainRobotDriveSideways.stopMotor();
    	TIMER.stop();
    	TIMER.reset();
    }

    protected void interrupted() {
    }
}
