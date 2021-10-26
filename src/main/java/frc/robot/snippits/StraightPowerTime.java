package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class StraightPowerTime extends CommandBase {

  private DriveBaseSub drive;
  private double power;
  private double time;
  private long timestamp;
  /**
   * Runs the drive base straight at a power for a time
   */
  public StraightPowerTime(DriveBaseSub driver, double power, double time) {
    this.drive = driver;
    this.power = power;
    this.time = time;
    this.timestamp = System.currentTimeMillis();
    addRequirements(this.drive);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    this.drive.drivePower(this.power);
  }


  @Override
  public void end(boolean interrupted) {
    this.drive.drivePower(0);
    this.drive.brake();
  }

  @Override
  public boolean isFinished() {
      return (System.currentTimeMillis() > this.timestamp + this.time);
  }

}
