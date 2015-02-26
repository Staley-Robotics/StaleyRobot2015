package org.usfirst.frc4959.StaleyRobotics2015.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Author - Dusitn Klein and Connor
 */
public class AutonomousOneTote extends CommandGroup {
	
    private static final Timer TIMER = new Timer();
    
    public  AutonomousOneTote() {
    	addSequential(new AutoShortDriveForward());
    	addSequential(new CloseArms());
    	addSequential(new Delay());
    	addParallel(new AutoRaiseElevator());
    	addSequential(new AutoDriveBack());
    	addSequential(new OpenArms());
    	addSequential(new AutoShortDriveBack());
    	addSequential(new AutoLowerElevator());
    }
}
