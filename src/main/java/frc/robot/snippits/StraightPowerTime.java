package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class StraightPowerTime extends CommandBase {

  private DriveBaseSub driveBaseSub;
  private double power;
  private double time;
  private String direction;
  
  /**
   * Runs the drive base straight at a power for a time
   */
  public StraightPowerTime(DriveBaseSub driveBaseSub, double power, double time, String direction) {
    this.driveBaseSub = driveBaseSub;
    this.power = power;
    this.time = time;
    this.direction = direction;
  }

  @Override
  public void initialize() {

  }

  @Override
  public void execute() {
  
      driveBaseSub.setRightPower(power);
      driveBaseSub.setLeftPower(power);
 
  }


  @Override
  public void end(boolean interrupted) {
    driveBaseSub.setPower(0);
    driveBaseSub.brake();
  }

  @Override
  public boolean isFinished() {
      if (System.currentTimeMillis() >= time) {
        return true;
      }
      return false;
  }

}
