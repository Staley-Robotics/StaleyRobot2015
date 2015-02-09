package org.usfirst.frc4959.StaleyRobotics2015.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Authors - Dillon, Connor
 */
public class AutonomousOneRecycleBin extends CommandGroup {
    
    public  AutonomousOneRecycleBin() {
    	addSequential(new CloseArms());
    	addSequential(new RaiseOneToteHeight());
    	addSequential(new AutoDriveSidewaysLeft());
    	addSequential(new GoToOneToteHeight());
    	addSequential(new OpenArms());
    }
}
