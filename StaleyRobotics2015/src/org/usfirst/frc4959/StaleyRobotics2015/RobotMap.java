package org.usfirst.frc4959.StaleyRobotics2015;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

    public static SpeedController leftTalon;
    public static SpeedController rightTalon;
    public static SpeedController backTalon;
    public static SpeedController frontTalon;
    public static RobotDrive drivetrainRobotDriveForward;
    public static RobotDrive drivetrainRobotDriveSideways;
    public static AnalogPotentiometer elevatorPotentiometer;
    public static SpeedController elevatorelevatorTalon;
    public static Compressor compressor;
    public static DoubleSolenoid solenoid;

    public static void init() {
    	/*
    	 * Battery side is front
    	 * 1 is left
    	 * 2 is right
    	 * 3 is back
    	 * 4 is front
    	 * 
    	 * MOVE RIGHT - left and right off, front inverted, back normal
    	 * MOVE LEFT - left and right off, front normal, left inverted
    	 * MOVE FOWARD - left inverted, right normal, front and back off
    	 * MOVE BACKWARD - left normal, right inverted, front and back off
    	 */
 
    	leftTalon = new Talon(1);
    	rightTalon = new Talon(2);
    	backTalon = new Talon(3);
    	frontTalon = new Talon(4);
    	compressor = new Compressor(0);
    	solenoid = new DoubleSolenoid(0,1);
    	
    	drivetrainRobotDriveForward = new RobotDrive(leftTalon, rightTalon);
    	drivetrainRobotDriveSideways = new RobotDrive(frontTalon, backTalon);
    	
    	drivetrainRobotDriveForward.setInvertedMotor( MotorType.kRearRight, true);
    	drivetrainRobotDriveForward.setInvertedMotor( MotorType.kRearLeft, true);
    	drivetrainRobotDriveSideways.setInvertedMotor( MotorType.kRearRight, false);
    	drivetrainRobotDriveSideways.setInvertedMotor( MotorType.kRearLeft, true);
    	 
    	drivetrainRobotDriveSideways.setSafetyEnabled(true);
    	drivetrainRobotDriveSideways.setExpiration(0.1);
    	drivetrainRobotDriveSideways.setSensitivity(0.5);
    	drivetrainRobotDriveSideways.setMaxOutput(0.3);
    	
    	drivetrainRobotDriveForward.setSafetyEnabled(true);
    	drivetrainRobotDriveForward.setExpiration(0.1);
    	drivetrainRobotDriveForward.setSensitivity(0.5);
    	drivetrainRobotDriveForward.setMaxOutput(0.4);
    }
}
