package org.usfirst.frc4959.StaleyRobotics2015.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc4959.StaleyRobotics2015.RobotMap;
import org.usfirst.frc4959.StaleyRobotics2015.commands.*;

import edu.wpi.first.wpilibj.*;

/**
 * Author - Dustin Klein, Chuck Testa
 */
public class GripperArms extends Subsystem {
    
	Compressor compressor = new Compressor(0);
	DoubleSolenoid solenoid = new DoubleSolenoid(0,1);
	Servo servo = RobotMap.cameraServo;
	
    public void initDefaultCommand() {
    	setDefaultCommand(new RunCompressor());
    }
    
    public void open() {
    	solenoid.set(DoubleSolenoid.Value.kForward);
    }
    
    public void close() {
    	solenoid.set(DoubleSolenoid.Value.kReverse);
    }
    
    public void runCompressor() {
    	compressor.setClosedLoopControl(true);
    }
}

