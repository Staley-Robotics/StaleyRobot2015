
package org.usfirst.frc4959.StaleyRobotics2015.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4959.StaleyRobotics2015.Robot;

/**
 *
 */
public class  ArcadeDrive extends Command {

    public ArcadeDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

        requires(Robot.drivetrain);

    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivetrain.arcadeDrive(Robot.oi.getJoystick1());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivetrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
