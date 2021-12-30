package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class StraightPowerTime extends CommandBase {
  private DriveBaseSub driveBase;
  private double power;
  private double time;
  private double initialTime;

  /**
   * Runs the drive base straight at a power for a time
   */
  public StraightPowerTime(DriveBaseSub driveBase, double power, double time) {
    this.driveBase = driveBase;
    this.power = power;
    this.time = time;
  }

  @Override
  public void initialize() {
    initialTime = System.currentTimeMillis();
  }

  @Override
  public void execute() {
    driveBase.setPower(power);
  }


  @Override
  public void end(boolean interrupted) {
    driveBase.setPower(0.0);
    driveBase.brake();
  }

  @Override
  public boolean isFinished() {
      if (System.currentTimeMillis() - initialTime < time) {
        return true;
      }
      else {
        return false;
      }
  }

}
