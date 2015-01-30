package org.usfirst.frc4959.StaleyRobotics2015.subsystems;

import org.usfirst.frc4959.StaleyRobotics2015.RobotMap;
import org.usfirst.frc4959.StaleyRobotics2015.commands.*;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 *
 */
public class Elevator extends PIDSubsystem {
	
    AnalogPotentiometer potentiometer = RobotMap.elevatorPotentiometer;
    SpeedController elevatorTalon = RobotMap.elevatorelevatorTalon;

    public Elevator() {
        super("Elevator", 1.0, 0.0, 0.0);
        setAbsoluteTolerance(0.1);
        getPIDController().setContinuous(false);  
        
        LiveWindow.addActuator("Elevator", "PIDSubsystem Controller", getPIDController());
    }
    
    public void initDefaultCommand() {
    }
    
    protected double returnPIDInput() {
        return potentiometer.get();
    }
    
    protected void usePIDOutput(double output) {
        elevatorTalon.pidWrite(output);
    }
}
