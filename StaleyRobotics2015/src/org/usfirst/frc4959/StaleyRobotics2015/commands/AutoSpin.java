package org.usfirst.frc4959.StaleyRobotics2015.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc4959.StaleyRobotics2015.Robot;
import org.usfirst.frc4959.StaleyRobotics2015.RobotMap;

/**
 * Author - Brett Rowald
 */
public class AutoSpin extends Command {
	
	private static final Timer TIMER = new Timer();

    public AutoSpin() {
    	
    	requires(Robot.driveTrain);
    	
    }

    protected void initialize() {
    	
    	TIMER.start();
    }

    protected void execute() {
    	
    	RobotMap.drivetrainRobotDriveSideways.arcadeDrive(0, .3);
    }

    protected boolean isFinished() {
    	while (TIMER.get() < 0.5) {
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
