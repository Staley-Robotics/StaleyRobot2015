package org.usfirst.frc4959.StaleyRobotics2015.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Author - Dusitn Klein and Connor
 */
public class AutonomousOneTote extends CommandGroup {
    
    public  AutonomousOneTote() {
    	addSequential(new CloseArms());
    	addSequential(new RaiseOneToteHeight());
    	addSequential(new AutoDriveSidewaysRight());
    	addSequential(new GoToGroundHeight());
    	addSequential(new OpenArms());
    }
}
