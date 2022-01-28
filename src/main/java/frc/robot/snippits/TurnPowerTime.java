package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class TurnPowerTime extends CommandBase {
  private DriveBaseSub driveBase;
  private double power;
  private double time;
  private String direction;
  private double initialTime = System.currentTimeMillis();

  public TurnPowerTime(DriveBaseSub driveBase, double power, double time, String direction) {
    this.driveBase = driveBase;
    this.power = power;
    this.time = time;
    this.direction = direction;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(driveBase);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    driveBase.coast();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (direction == "Right") {
      driveBase.setRightPower(-power);
      driveBase.setLeftPower(power);
    }
    else {
      driveBase.setRightPower(power);
      driveBase.setLeftPower(-power);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    driveBase.setPower(0.0);
    driveBase.brake();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    double currentTime = System.currentTimeMillis();
    if (currentTime - initialTime > time) return true;
    else return false;
  }
}
