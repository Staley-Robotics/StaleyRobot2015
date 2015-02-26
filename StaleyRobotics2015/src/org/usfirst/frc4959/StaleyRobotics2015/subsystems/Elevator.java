package org.usfirst.frc4959.StaleyRobotics2015.subsystems;

import org.usfirst.frc4959.StaleyRobotics2015.Robot;
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
   
    public static double oneToteHeight = 3.425,
    		twoToteHeight = 2.378,
    		threeToteHeight = 1.577,
    		fourToteHeight = 0.85,
    		recycleBinHeight = 2.9;
    
    public Elevator() {
        super("Elevator", -1.7, 0.0, 0.0);
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
    
    public void elevator(double leftJoystickY) {
    	elevatorTalon.set(-leftJoystickY * 0.75);
    }
}
