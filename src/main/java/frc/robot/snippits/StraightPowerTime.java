package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class StraightPowerTime extends CommandBase {

private DriveBaseSub driveBaseSub;
private double power;
private double time;

  /**
   * Runs the drive base straight at a power for a time
   */
  public StraightPowerTime(DriveBaseSub driveBaseSub, double power, double time) {
    this.driveBaseSub = driveBaseSub;
    this.power = power;
    this.time = time;
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    driveBaseSub.setPowerLeftFollow(power);
    driveBaseSub.setPowerLeftMast(power);
    driveBaseSub.setPowerRightFollow(power);
    driveBaseSub.setPowerRightMast(power);
  }


  @Override
  public void end(boolean interrupted) {
    driveBaseSub.setPowerLeftFollow(0);
    driveBaseSub.setPowerLeftMast(0);
    driveBaseSub.setPowerRightFollow(0);
    driveBaseSub.setPowerRightMast(0);
    driveBaseSub.brake();
  }

  @Override
  public boolean isFinished() {
    if (System.currentTimeMillis() == time) {
      return true;
    }
    else {
      return false;
    }

  }

}
