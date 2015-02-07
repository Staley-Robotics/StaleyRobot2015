package org.usfirst.frc4959.StaleyRobotics2015;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc4959.StaleyRobotics2015.commands.*;
import org.usfirst.frc4959.StaleyRobotics2015.subsystems.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	Command autonomousCommand;
    Command autonomousCommandOne;
    Command autonomousCommandTwo;

    public static OI oi;
    
    public static Drivetrain driveTrain;
    public static Elevator elevator;;
    public static GripperArms gripperArms;
 
    SendableChooser autonomousModes;
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    
    public void robotInit() {
    	RobotMap.init();
 
        driveTrain = new Drivetrain();
        elevator = new Elevator();
        gripperArms = new GripperArms();
        
        // OI must be constructed after subsystems. If the OI creates Commands 
        //(which it very likely will), subsystems are not guaranteed to be 
        // constructed yet. Thus, their requires() statements may grab null 
        // pointers. Bad news. Don't move it.
        oi = new OI();

        // instantiate the command used for the autonomous period
        autonomousModes = new SendableChooser();
        autonomousModes.addDefault("One tote", new AutonomousOneTote());
        autonomousModes.addObject("One Tote and Recycle Bin", new AutonomousOneToteRecycleBin());
        SmartDashboard.putData("Autonomous Modes", autonomousModes);
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    
    public void disabledInit(){
    }

    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    public void autonomousInit() {
    	autonomousCommand = (Command) autonomousModes.getSelected();
        if (autonomousCommandOne != null) autonomousCommandOne.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommandOne != null) autonomousCommandOne.cancel();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }

    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
