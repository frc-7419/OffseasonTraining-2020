package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class TurnPowerTime extends CommandBase {
  private DriveBaseSub driveBaseSub;
  private double power;
  private double time;
  private String direction;
  public TurnPowerTime(DriveBaseSub driveBaseSub, String direction, double time, double power) {
    this.driveBaseSub = driveBaseSub;
    this.power = power;
    this.time = time;
    this.direction = direction;
    // Use addRequirements() here to declare subsystem dependencies.
  }
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    driveBaseSub.coast();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (direction == "RIGHT") {
      this.driveBaseSub.setLeftPower(this.power);
      this.driveBaseSub.setRightPower(-this.power);
    }
    if (direction == "LEFT") {
      this.driveBaseSub.setLeftPower(-this.power);
      this.driveBaseSub.setRightPower(this.power);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    this.driveBaseSub.setLeftPower(0);
    this.driveBaseSub.setRightPower(0);
    this.driveBaseSub.brake();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    if (System.currentTimeMillis() <= this.time) {
      return false;
    }
    return true;

  }
}
