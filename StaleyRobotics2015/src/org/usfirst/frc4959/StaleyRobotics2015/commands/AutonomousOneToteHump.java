package org.usfirst.frc4959.StaleyRobotics2015.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonomousOneToteHump extends CommandGroup {
    
    public  AutonomousOneToteHump() {
    	addSequential(new AutoShortDriveForwardHump());
    	addSequential(new CloseArms());
    	addSequential(new Delay());
    	addParallel(new AutoRaiseElevator());
    	addSequential(new AutoShortDriveBackHump());
    	addSequential(new AutoTurn());
    	addSequential(new OpenArms());
    	addSequential(new AutoLowerElevator());
    	addSequential(new AutoShortDriveBack());
    }
}
