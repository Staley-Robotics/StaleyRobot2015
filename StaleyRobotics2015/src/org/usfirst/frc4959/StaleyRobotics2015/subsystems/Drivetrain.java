package org.usfirst.frc4959.StaleyRobotics2015.subsystems;

import org.usfirst.frc4959.StaleyRobotics2015.RobotMap;
import org.usfirst.frc4959.StaleyRobotics2015.commands.*;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Author - Dustin Klein
 * 
 * 
 * 
 * Lowly Builder - Blake Croston 
 */
public class Drivetrain extends Subsystem {

    SpeedController speedController1 = RobotMap.leftTalon;
    SpeedController speedController2 = RobotMap.rightTalon;
    SpeedController speedController3 = RobotMap.backTalon;
    SpeedController speedController4 = RobotMap.frontTalon;
    
    RobotDrive robotDriveForward = RobotMap.drivetrainRobotDriveForward;
    RobotDrive robotDriveSideways = RobotMap.drivetrainRobotDriveSideways;

    public void initDefaultCommand() {
        setDefaultCommand(new DriveWithJoysticks());
    }
 
     public void falconDrive(double joystickX, double joystickY, double joystickTwist) {
    	 robotDriveForward.arcadeDrive(joystickY, joystickTwist * 0.90);
    	 robotDriveSideways.arcadeDrive(0, joystickX);
    }

	public void stop() {
		robotDriveForward.drive(0, 0);
		robotDriveSideways.drive(0, 0);
	}
	
	public void forward(double speed) {
		robotDriveForward.arcadeDrive(speed, 0);
	}
	
	public void sideways (double speed) {
		robotDriveSideways.arcadeDrive(speed, 0);
	}
}

