package org.usfirst.frc4959.StaleyRobotics2015.commands;

import org.usfirst.frc4959.StaleyRobotics2015.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Author - Dustin Klein
 */
public class CloseArms extends Command {

    public CloseArms() {
    	requires(Robot.gripperArms);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.gripperArms.close();
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
