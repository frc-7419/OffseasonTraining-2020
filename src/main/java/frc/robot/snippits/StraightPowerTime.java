package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class StraightPowerTime extends CommandBase {


  private DriveBaseSub drivebase;
  private double power;
  private double time;
  
  public StraightPowerTime(DriveBaseSub drivebase, double power, double time) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.drivebase = drivebase;
    this.power = power;
    this.time = time;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    drivebase.setLeftMastPower(power);
    drivebase.setLeftFollowPower(power);
    drivebase.setRightMastPower(power);
    drivebase.setRightFollowPower(power);
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
