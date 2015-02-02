package org.usfirst.frc4959.StaleyRobotics2015;

import org.usfirst.frc4959.StaleyRobotics2015.commands.*;
import org.usfirst.frc4959.StaleyRobotics2015.subsystems.Drivetrain;
import org.usfirst.frc4959.StaleyRobotics2015.subsystems.GripperArms;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());

    
    public Joystick rightJoystick;
    public Joystick leftJoystick;
    
    public OI() {
        rightJoystick = new Joystick(0);
        leftJoystick = new Joystick(1);
        
        Button button1 = new JoystickButton(rightJoystick, 1),
        		button2 = new JoystickButton(rightJoystick, 2);

        button1.whileHeld(new OpenArms());
        button2.whileHeld(new CloseArms());    
    }

	public double getRightJoystickY() {
		return rightJoystick.getY();
	}

	public double getRightJoystickX() {
		return rightJoystick.getX();
	}
	
	public double getRightJoystickTwist() {
		return rightJoystick.getTwist();
	}
	
	public double getLeftJoystickY() {
		return leftJoystick.getY();
	}
}

