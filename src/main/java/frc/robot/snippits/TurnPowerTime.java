package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class TurnPowerTime extends CommandBase {
  private DriveBaseSub dbs;
  private double power;
  private double time;
  private String direction;

  public TurnPowerTime(DriveBaseSub d, double p, double t, String di) {
    this.dbs = d;
    this.power = p;
    this.time = t;
    this.direction = di;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    this.dbs.coast();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (direction == "RIGHT"){
      dbs.setLeftPower(power);
      dbs.setRightPower(-power);
    } 
    else if (direction == "LEFT"){
      dbs.setLeftPower(-power);
      dbs.setRightPower(power);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    dbs.setPower(0);
    this.dbs.brake();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    if (System.currentTimeMillis() >= time) {
      return true;
    }
    return false;
  }
}
