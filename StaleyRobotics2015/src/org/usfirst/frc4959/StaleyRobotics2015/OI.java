package org.usfirst.frc4959.StaleyRobotics2015;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;

import org.usfirst.frc4959.StaleyRobotics2015.commands.AutoDriveBack;
import org.usfirst.frc4959.StaleyRobotics2015.commands.ClearElevatorHeight;
import org.usfirst.frc4959.StaleyRobotics2015.commands.CloseArms;
import org.usfirst.frc4959.StaleyRobotics2015.commands.LowerOneToteHeight;
import org.usfirst.frc4959.StaleyRobotics2015.commands.OpenArms;
import org.usfirst.frc4959.StaleyRobotics2015.commands.GoToFourToteHeight;
import org.usfirst.frc4959.StaleyRobotics2015.commands.GoToOneToteHeight;
import org.usfirst.frc4959.StaleyRobotics2015.commands.GoToThreeToteHeight;
import org.usfirst.frc4959.StaleyRobotics2015.commands.GoToTwoToteHeight;
import org.usfirst.frc4959.StaleyRobotics2015.commands.OpenSequence;
import org.usfirst.frc4959.StaleyRobotics2015.commands.RaiseOneToteHeight;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

/*This is a random comment im typing as im pretending to code..
//I will be keeping a log Starting today
//2/9/2015 - So far no one knows about my expert coding skills
//Kuran and Brett are currently browsing reddit on my laptop
//God knows what subreddit they're on.
//So far Dustin doesn't know about these comments and hopefully never does
//Dustin is suspicous of my comments
Must hide them, or else he'll call me stupid.

You are stupid dillon.*/

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
        
        Button openArmsSequence = new JoystickButton(leftJoystick, 2),
        		closeArms = new JoystickButton(leftJoystick, 1),
        		
//        		lowerOneToteHeight = new JoystickButton(leftJoystick, 4),
//        		raiseOneToteHeight = new JoystickButton(leftJoystick, 5),
//        		
//        		toteOneHeight = new JoystickButton(leftJoystick, 6),
//                toteTwoHeight = new JoystickButton(leftJoystick, 7),
//                toteThreeHeight = new JoystickButton(leftJoystick, 10),
//                toteFourHeight = new JoystickButton(leftJoystick, 11),
        		clearElevatorHeight = new JoystickButton(leftJoystick, 8);
        
        openArmsSequence.whenPressed(new OpenArms());
        closeArms.whenPressed(new CloseArms());
        
//        toteOneHeight.whenPressed(new GoToOneToteHeight());
//        toteTwoHeight.whenPressed(new GoToTwoToteHeight());
//        toteThreeHeight.whenPressed(new GoToThreeToteHeight());
//        toteFourHeight.whenPressed(new GoToFourToteHeight());
        clearElevatorHeight.whenPressed(new ClearElevatorHeight());
        
//        raiseOneToteHeight.whenPressed(new RaiseOneToteHeight());
//        lowerOneToteHeight.whenPressed(new LowerOneToteHeight());
        
        // SmartDashboard Widgets
        SmartDashboard.putData(Scheduler.getInstance());
        SmartDashboard.putData("Close Arms", new CloseArms());
        SmartDashboard.putData("Open Arms", new OpenArms());
        SmartDashboard.putData("Raise One Tote Height", new RaiseOneToteHeight());
        SmartDashboard.putData("Lower One Tote Height", new LowerOneToteHeight());
        SmartDashboard.putData("One Tote Height", new GoToOneToteHeight());
        SmartDashboard.putData("Two Tote Height", new GoToTwoToteHeight());
        SmartDashboard.putData("Three Tote Height", new GoToThreeToteHeight());
        SmartDashboard.putData("Four Tote Height", new GoToFourToteHeight());
        SmartDashboard.putData("Clear Elevator Height", new ClearElevatorHeight());
        
        SmartDashboard.putData("AutoDriveBack", new AutoDriveBack());
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
	
	public Joystick getRightJoystick(Joystick rightJoystick) {
		return rightJoystick;
	}
}

