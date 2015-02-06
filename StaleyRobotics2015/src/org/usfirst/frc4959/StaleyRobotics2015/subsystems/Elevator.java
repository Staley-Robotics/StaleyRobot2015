package org.usfirst.frc4959.StaleyRobotics2015.subsystems;

import org.usfirst.frc4959.StaleyRobotics2015.RobotMap;
import org.usfirst.frc4959.StaleyRobotics2015.commands.*;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * Author - Cameron Hensel (Head Programmer)
 */
public class Elevator extends PIDSubsystem {
	
    AnalogPotentiometer potentiometer = RobotMap.elevatorPotentiometer;
    SpeedController elevatorTalon = RobotMap.elevatorTalon;
    
    public static double groundHeight = .3,
    		oneToteHeight = 1,
    		twoToteHeight = 2,
    		threeToteHeight = 3,
    		fourToteHeight = 4,
    		recycleBinHeight = 2.2;
    
    public Elevator() {
        super("Elevator", 1.0, 0.0, 0.0);
        setAbsoluteTolerance(0.1);
        getPIDController().setContinuous(false);  
        
        LiveWindow.addActuator("Elevator", "PIDSubsystem Controller", getPIDController());
    }
    
    public void initDefaultCommand() {
    	setDefaultCommand(new ControlElevatorWithJoysticks());
    }
    
    protected double returnPIDInput() {
        return potentiometer.pidGet();
    }
    
    protected void usePIDOutput(double output) {
        elevatorTalon.pidWrite(output);
    }
    
//    public void raiseElevator(double leftJoystickY) {
//    	while (potentiometer.pidGet() < 4.86) {
//        	elevatorTalon.set(0.5);
//    	}
//    }
//    
//    public void lowerElevator(double leftJoystickY) {
//    	while (potentiometer.pidGet() > .01) {
//    		elevatorTalon.set(-0.5);	
//    	}
//    }
    public void elevator(double leftJoystickY) {
    	if (leftJoystickY > 0.5) {
    		elevatorTalon.set(-0.25);
    	} else if (leftJoystickY < -0.5) {
    		elevatorTalon.set(0.2);
    	} else {
    		elevatorTalon.set(0.0);
    	}
    }
    
    public double getPosition() {
    	return potentiometer.pidGet();
    }
}
