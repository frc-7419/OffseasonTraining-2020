package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class StraightPowerTime extends CommandBase {


  /**
   * Runs the drive base straight at a power for a time
   */

  private DriveBaseSub driveBase;
  private double power;
  private double time;

  public StraightPowerTime(DriveBaseSub driveBase, double power, double time) {
    this.driveBase = driveBase;
    this.power = power;
    this.time = time;
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    this.driveBase.setPowerLeftMast(this.power);
    this.driveBase.setPowerRightMast(this.power);
    this.driveBase.setPowerLeftFollow(this.power);
    this.driveBase.setPowerRightFollow(this.power);
  }


  @Override
  public void end(boolean interrupted) {
    this.driveBase.setPowerLeftMast(0);
    this.driveBase.setPowerRightMast(0);
    this.driveBase.setPowerLeftFollow(0);
    this.driveBase.setPowerRightFollow(0);
    this.driveBase.brake();
  }

  @Override
  public boolean isFinished() {
    return System.currentTimeMillis() == this.time;
  }

}
