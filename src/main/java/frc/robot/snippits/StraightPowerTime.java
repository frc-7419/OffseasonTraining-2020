package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class StraightPowerTime extends CommandBase {

  private DriveBaseSub driveBaseSub;
  private double power; // double because power is double
  private double time; // double
  private double initialTime;
  private double currentTime;
  

  /**
   * Runs the drive base straight at a power for a time
   */
  public StraightPowerTime(DriveBaseSub driveBaseSub, double power, int time) {
    this.driveBaseSub = driveBaseSub;
    this.power = power;
    this.time = time;
  }

  @Override
  public void initialize() {
    initialTime = System.currentTimeMillis();
  }

  @Override
  public void execute() {
    driveBaseSub.setPower(power);
    currentTime = System.currentTimeMillis() - initialTime;
  }

  @Override
  public void end(boolean interrupted) {
    driveBaseSub.setPower(0); // stops
    driveBaseSub.brake(); // brake
  }

  @Override
  public boolean isFinished() {
    
    // if currentTime < total time, then keep moving until currentTime >= total time
    if (currentTime >= time) {
      return true;
    }
    return false;

  }

}
