package org.usfirst.frc4959.StaleyRobotics2015.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Author - Blake Croston
 */
public class AutonomousOneToteRecycleBin extends CommandGroup {
    
    public  AutonomousOneToteRecycleBin() {
    	addSequential(new CloseArms());
    	addSequential(new RaiseOneToteHeight());
    	addSequential(new AutoShortDriveForward());
    	addSequential(new OpenArms());
    	addSequential(new GoToOneToteHeight());
    	addSequential(new CloseArms());
    	addSequential(new RaiseOneToteHeight());
    	addSequential(new AutoDriveSidewaysLeft());
    	addSequential(new GoToOneToteHeight());
    	addSequential(new OpenArms());
    }
}
