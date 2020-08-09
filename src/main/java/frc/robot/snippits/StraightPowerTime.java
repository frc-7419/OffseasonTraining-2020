package frc.robot.snippits;

import java.sql.Time;

import com.ctre.phoenix.motorcontrol.NeutralMode;

//For now--------



import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class StraightPowerTime extends CommandBase {


  /**
   * Runs the drive base straight at a power for a time
   */
  private DriveBaseSub driveBaseSub;
  private double power;
  private double time;
  
  
  public StraightPowerTime(DriveBaseSub driveBaseSub, double power, double time) {
    this.driveBaseSub = driveBaseSub;
    this.power = power;
    this.time = time;

  }

  @Override
  public void initialize() {
  }

  public static long startTime = System.currentTimeMillis();

  @Override
  public void execute() {
    driveBaseSub.setPower(power);    
    System.out.println("Command started at: " + startTime);

  }

  public static long endTime = System.currentTimeMillis();

  @Override
  public void end(boolean interrupted) {
    driveBaseSub.setPower(0);
    driveBaseSub.brake();
    
    System.out.println("Command ended at: " + endTime);
    time = endTime - startTime;
    System.out.println("The command ran for the time: " + time);
  }

  
  @Override
  
  public boolean isFinished() {
    return true; //change to false if you have to
  }


}
