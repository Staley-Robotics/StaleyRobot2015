package org.usfirst.frc4959.StaleyRobotics2015.commands;

import org.usfirst.frc4959.StaleyRobotics2015.Robot;
import org.usfirst.frc4959.StaleyRobotics2015.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Author - Dustin Klein
 */
public class RaiseServo extends Command {

    public RaiseServo() {
    }

    protected void initialize() {
    }

    protected void execute() {
//    	RobotMap.cameraServo.setPosition(1);
    	RobotMap.cameraServo.setAngle(180);
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
