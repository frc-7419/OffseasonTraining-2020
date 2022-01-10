package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class StraightPowerTime extends CommandBase {
  private DriveBaseSub drivebaseSub;
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
    driveBaseSub.coast();
  }

  @Override
  public void execute() {
    driveBaseSub.power()
  }


  @Override
  public void end(boolean interrupted) {
    driveBaseSub.setPower(0);
    driveBaseSub.brake();

  }

  @Override
  public boolean isFinished() {
    if (System.currentTimeMillis() == time){
      return true;
    }
    return false;
  }

}
