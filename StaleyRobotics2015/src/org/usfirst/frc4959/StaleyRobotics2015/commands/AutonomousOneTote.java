package org.usfirst.frc4959.StaleyRobotics2015.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Author - Dusitn Klein and Connor
 */
public class AutonomousOneTote extends CommandGroup {
	

    
    public  AutonomousOneTote() {
    	addSequential(new AutoShortDriveForward());
    	addSequential(new CloseArms());
    	addSequential(new Delay());
    	addParallel(new AutoRaiseElevator());
    	addSequential(new AutoDriveBack());
    	addSequential(new AutoTurn());
    	addSequential(new OpenArms());
    	addSequential(new AutoLowerElevator());
    	addSequential(new AutoShortDriveBack());
    }
}
