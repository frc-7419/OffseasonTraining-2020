package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class StraightPowerTime extends CommandBase {

  private DriveBaseSub driveBaseSub;
  private double power;
  private double time;
  private double difference;
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
    difference = System.currentTimeMillis();
  }

  @Override
  public void execute() {
    driveBaseSub.setPower(power);
  }


  @Override
  public void end(boolean interrupted) {
    driveBaseSub.setPower(0);
    driveBaseSub.brake();
  }

  @Override
  public boolean isFinished() {
      double currentTime = System.currentTimeMillis();
      if(currentTime-difference>=time) {
        return true;
      }
      return false;
  }

}
