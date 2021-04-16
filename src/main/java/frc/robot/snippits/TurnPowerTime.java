package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class TurnPowerTime extends CommandBase {
  
  private DriveBaseSub drivebase;
  private double power;
  private double time;
  private String direction;

  public TurnPowerTime(DriveBaseSub drivebase, String direction, double power, double time) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.drivebase = drivebase;
    this.power = power;
    this.time = time;
    this.direction = direction;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    drivebase.coast();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (direction.equals("RIGHT")) {
      drivebase.setLeftMastPower(power);
      drivebase.setLeftFollowPower(power);
      drivebase.setRightMastPower(-power);
      drivebase.setRightFollowPower(-power);
    } else {
      drivebase.setLeftMastPower(-power);
      drivebase.setLeftFollowPower(-power);
      drivebase.setRightMastPower(power);
      drivebase.setRightFollowPower(power);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    drivebase.setLeftMastPower(0);
    drivebase.setLeftFollowPower(0);
    drivebase.setRightMastPower(0);
    drivebase.setRightFollowPower(0);
    drivebase.brake();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return System.currentTimeMillis() >= time;
  }
}
