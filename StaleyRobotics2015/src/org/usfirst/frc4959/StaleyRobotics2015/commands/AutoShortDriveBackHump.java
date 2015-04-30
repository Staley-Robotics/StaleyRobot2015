package org.usfirst.frc4959.StaleyRobotics2015.commands;

import org.usfirst.frc4959.StaleyRobotics2015.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoShortDriveBackHump extends Command {

RobotDrive robotDrive = RobotMap.drivetrainRobotDriveForward;
    
    private static final Timer TIMER = new Timer();
    
    public AutoShortDriveBackHump() {
        }

    protected void initialize()
        {
        TIMER.start();
        System.out.println("Timer Started");
        }

    protected void execute() {
        robotDrive.tankDrive(1, 0.8);
        }
    
    protected boolean isFinished() {
        while(TIMER.get() < 2.8)
            {
            return false;
            }   
        return true;
        }

    protected void end()
        {
        System.out.println("AutoMove Finished");
        robotDrive.tankDrive(0, 0);
        Timer.delay(0.3);
        robotDrive.stopMotor();
        TIMER.stop();
        TIMER.reset();
        }

    protected void interrupted()
        {
        }
}
