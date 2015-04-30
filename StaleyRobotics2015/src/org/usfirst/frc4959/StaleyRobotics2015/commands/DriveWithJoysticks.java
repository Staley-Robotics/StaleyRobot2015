package org.usfirst.frc4959.StaleyRobotics2015.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4959.StaleyRobotics2015.Robot;

/**
 * Author - Dustin Klein
 */

public class  DriveWithJoysticks extends Command {

    public DriveWithJoysticks() {
        requires(Robot.driveTrain);
    }
    
    protected void initialize() {
    }
    
    protected void execute() {
    	Robot.driveTrain.falconDrive(Robot.oi.getRightStickX(), Robot.oi.getRightStickY(), Robot.oi.getLeftStickX());
    }
    
    protected boolean isFinished() {
        return false;
    }
    
    protected void end() {
    	Robot.driveTrain.stop();
    }
    
    protected void interrupted() {
    	end();
    }
}
