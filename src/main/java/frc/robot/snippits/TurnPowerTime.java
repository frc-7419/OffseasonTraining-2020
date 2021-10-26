package frc.robot.snippits;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class TurnPowerTime extends CommandBase {

  private DriveBaseSub drive;
  private double power;
  private double time;
  private String dir;
  private long timestamp;
  
  public TurnPowerTime(DriveBaseSub driver, String direction, double power, double time) {
    this.drive = driver;
    this.power = power;
    this.time = time;
    this.dir = direction;
    this.timestamp = System.currentTimeMillis();
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(this.drive);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    this.drive.coast();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (this.dir.equals("LEFT")) {
      this.drive.getLeftMast().set(ControlMode.PercentOutput, -power);
      this.drive.getLeftFollow().set(ControlMode.PercentOutput, -power);
      this.drive.getRightMast().set(ControlMode.PercentOutput, power);
      this.drive.getRightFollow().set(ControlMode.PercentOutput, power);
    } else if (this.dir.equals("RIGHT")) {
      this.drive.getLeftMast().set(ControlMode.PercentOutput, power);
      this.drive.getLeftFollow().set(ControlMode.PercentOutput, power);
      this.drive.getRightMast().set(ControlMode.PercentOutput, -power);
      this.drive.getRightFollow().set(ControlMode.PercentOutput, -power);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    this.drive.drivePower(0);
    this.drive.brake();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return (System.currentTimeMillis() > this.timestamp + this.time);
  }
}
