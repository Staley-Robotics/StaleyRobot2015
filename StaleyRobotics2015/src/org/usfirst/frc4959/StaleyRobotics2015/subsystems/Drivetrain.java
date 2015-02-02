package org.usfirst.frc4959.StaleyRobotics2015.subsystems;

import org.usfirst.frc4959.StaleyRobotics2015.Robot;
import org.usfirst.frc4959.StaleyRobotics2015.RobotMap;
import org.usfirst.frc4959.StaleyRobotics2015.commands.*;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.can.CANNotInitializedException;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.communication.UsageReporting;
import edu.wpi.first.wpilibj.communication.FRCNetworkCommunicationsLibrary.tInstances;
import edu.wpi.first.wpilibj.communication.FRCNetworkCommunicationsLibrary.tResourceType;

/**
 * Author - Dustin Klein
 */
public class Drivetrain extends Subsystem {

    SpeedController speedController1 = RobotMap.leftTalon;
    SpeedController speedController2 = RobotMap.rightTalon;
    SpeedController speedController3 = RobotMap.backTalon;
    SpeedController speedController4 = RobotMap.frontTalon;
    
    RobotDrive robotDriveForward = RobotMap.drivetrainRobotDriveForward;
    RobotDrive robotDriveSideways = RobotMap.drivetrainRobotDriveSideways;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        setDefaultCommand(new DriveWithJoysticks());
    }
 
     public void falconDrive(double joystickX, double joystickY, double joystickTwist) {
    	 robotDriveForward.arcadeDrive(joystickY, joystickTwist);
    	 robotDriveSideways.arcadeDrive(0, joystickX);
    }

	public void stop() {
		robotDriveForward.drive(0, 0);
		robotDriveSideways.drive(0, 0);
	}
}

