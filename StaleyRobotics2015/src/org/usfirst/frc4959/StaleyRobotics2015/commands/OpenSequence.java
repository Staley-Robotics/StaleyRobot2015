package org.usfirst.frc4959.StaleyRobotics2015.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class OpenSequence extends CommandGroup {
    
    public  OpenSequence() {
    	addSequential(new ShortLowerArms());
    	addSequential(new OpenArms());
    }
}
