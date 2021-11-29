package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class StraightPowerTime extends CommandBase {


  /**
   * Runs the drive base straight at a power for a time
   */
  public StraightPowerTime() {
    private DriveBaseSub driveBaseSub;
    private double power;
    private double time;

  public StraightPowerTime(DriveBaseSub driveBaseSub, double power, double time0{
    this.driveBaseSub = driveBaseSub;
    this.power = power;
    this.time = time;
  }
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

    this.driveBase.setPowerLeftMast(0);
    this.driveBase.setPowerRightMast(0);
    this.driveBase.setPowerLeftFollow(0);
    this.driveBase.setPowerRightFollow(0);
  }


  @Override
  public void end(boolean interrupted) {
  }

  @Override
  public boolean isFinished() {
      return false;
      return System.currentTimeMillis() == this.time;
  }

}
