package org.usfirst.frc4959.StaleyRobotics2015;

import org.usfirst.frc4959.StaleyRobotics2015.commands.*;
import org.usfirst.frc4959.StaleyRobotics2015.subsystems.Drivetrain;
import org.usfirst.frc4959.StaleyRobotics2015.subsystems.GripperArms;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;

import org.usfirst.frc4959.StaleyRobotics2015.commands.CloseArms;
import org.usfirst.frc4959.StaleyRobotics2015.commands.OpenArms;
import org.usfirst.frc4959.StaleyRobotics2015.commands.GoToFourToteHeight;
import org.usfirst.frc4959.StaleyRobotics2015.commands.GoToOneToteHeight;
import org.usfirst.frc4959.StaleyRobotics2015.commands.GoToThreeToteHeight;
import org.usfirst.frc4959.StaleyRobotics2015.commands.GoToTwoToteHeight;
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
        
        Button openPiston = new JoystickButton(leftJoystick, 1),
        		closePiston = new JoystickButton(leftJoystick, 2),
        		toteOneHeight = new JoystickButton(leftJoystick, 6),
                toteTwoHeight = new JoystickButton(leftJoystick, 7),
                toteThreeHeight = new JoystickButton(leftJoystick, 10),
                toteFourHeight = new JoystickButton(leftJoystick, 11);
        
        openPiston.whileHeld(new OpenArms());
        closePiston.whileHeld(new CloseArms());
        toteOneHeight.whenPressed(new GoToOneToteHeight());
        toteTwoHeight.whenPressed(new GoToTwoToteHeight());
        toteThreeHeight.whenPressed(new GoToThreeToteHeight());
        toteFourHeight.whenPressed(new GoToFourToteHeight());
        
        // SmartDashboard Widgets
        SmartDashboard.putData(Scheduler.getInstance());
        SmartDashboard.putData("Close Arms", new CloseArms());
        SmartDashboard.putData("Open Arms", new OpenArms());
        SmartDashboard.putData("One Tote Height", new GoToOneToteHeight());
        SmartDashboard.putData("Two Tote Height", new GoToTwoToteHeight());
        SmartDashboard.putData("Three Tote Height", new GoToThreeToteHeight());
        SmartDashboard.putData("Four Tote Height", new GoToFourToteHeight());
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

