package org.usfirst.frc4959.StaleyRobotics2015.commands;

import org.usfirst.frc4959.StaleyRobotics2015.Robot;
import org.usfirst.frc4959.StaleyRobotics2015.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoRaiseElevator extends Command {

private static final Timer TIMER = new Timer();
    
    public AutoRaiseElevator() {
    	requires(Robot.elevator);
        }

    protected void initialize()
        {
        TIMER.start();
        System.out.println("Timer Started");
        }

    protected void execute() {
        	RobotMap.elevatorTalon.set(0.5);
        }
    
    protected boolean isFinished() {
        while(TIMER.get() < 2)
            {
            return false;
            }   
        return true;
        }

    protected void end()
        {
        System.out.println("AutoMove Finished");
        RobotMap.elevatorTalon.set(0);
        Timer.delay(0.3);
        TIMER.stop();
        TIMER.reset();
        }

    protected void interrupted()
        {
        }
}
