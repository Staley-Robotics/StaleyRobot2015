package org.usfirst.frc4959.StaleyRobotics2015.commands;

import org.usfirst.frc4959.StaleyRobotics2015.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Author - Dustin Klein
 */
public class RunCompressor extends Command {

    public RunCompressor() {
    	requires(Robot.gripperArms);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.gripperArms.runCompressor();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
