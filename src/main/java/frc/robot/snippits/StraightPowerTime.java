package frc.robot.snippits;

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
    this.time = power;
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    this.driveBaseSub.setPowerLeftMast(power);
    this.driveBaseSub.setPowerRightMast(power);
    this.driveBaseSub.setPowerLeftFollow(power);
    this.driveBaseSub.setPowerRightFollow(power);
  }

  @Override
  public void end(boolean interrupted) {
    this.driveBaseSub.setPowerLeftMast(0);
    this.driveBaseSub.setPowerRightMast(0);
    this.driveBaseSub.setPowerLeftFollow(0);
    this.driveBaseSub.setPowerRightFollow(0);
    this.driveBaseSub.brake();
  }

  @Override
  public boolean isFinished() {
    return System.currentTimeMillis() == this.time;
  }

}
