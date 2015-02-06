package org.usfirst.frc4959.StaleyRobotics2015.commands;

import org.usfirst.frc4959.StaleyRobotics2015.Robot;
import org.usfirst.frc4959.StaleyRobotics2015.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoShortDriveForward extends Command {
	
	private static final Timer TIMER = new Timer();

    public AutoShortDriveForward() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	TIMER.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	RobotMap.drivetrainRobotDriveForward.tankDrive(0.5, 0.5);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        while (TIMER.get() < .3) {
        	return false;
        }
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	RobotMap.drivetrainRobotDriveForward.stopMotor();
    	TIMER.stop();
    	TIMER.reset();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
