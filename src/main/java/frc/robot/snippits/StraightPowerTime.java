package frc.robot.snippits;

import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class StraightPowerTime extends CommandBase {
  private DriveBaseSub dbs;
  private double power;
  private double time;

  /**
   * Runs the drive base straight at a power for a time
   */
  public StraightPowerTime(DriveBaseSub d, double p, double t) {
    this.dbs = d;
    this.power = p;
    this.time = t;
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    dbs.setLeftPower(power);
    dbs.setRightPower(power);
  }


  @Override
  public void end(boolean interrupted) {
    dbs.setLeftPower(0);
    dbs.setRightPower(0);
    dbs.brake();
  }

  @Override
  public boolean isFinished() {
    return System.currentTimeMillis() == this.time;
  }

}
