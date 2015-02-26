package org.usfirst.frc4959.StaleyRobotics2015.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Delay extends Command {
	
    private static final Timer TIMER = new Timer();

    public Delay() {
    }

    protected void initialize() {
    	TIMER.start();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        while (TIMER.get() < 1) {
        	return false;
        }
        return true;
    }

    protected void end() {
    	TIMER.stop();
    	TIMER.reset();
    }

    protected void interrupted() {
    }
}
