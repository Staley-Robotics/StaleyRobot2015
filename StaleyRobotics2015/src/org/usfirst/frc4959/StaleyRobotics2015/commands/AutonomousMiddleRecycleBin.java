package org.usfirst.frc4959.StaleyRobotics2015.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Author - Dustin Klein
 */
public class AutonomousMiddleRecycleBin extends CommandGroup {
    
    public  AutonomousMiddleRecycleBin() {
    	addSequential(new ShortRaiseArms());
    	addSequential(new AutoDriveSidewaysLeft());
    }
}
