package frc.robot.subsystems.drivebase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArcadeDrive extends CommandBase {
  
  private DriveBaseSub drive;
  private PaddedXbox xbox;
  private double powercoeff;
  private double rotatecoeff;
  /**
   * Creates a new ArcadeDrive.
   */
  public ArcadeDrive(DriveBaseSub driver, PaddedXbox xbox, double power, double rotate) {
    this.drive = driver;
    this.xbox = xbox;
    this.powercoeff = power;
    this.rotatecoeff = rotate;
    addRequirements(this.drive);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    this.drive.getLeftMast().set(ControlMode.PercentOutput, this.powercoeff * this.xbox.getLeftY() + this.rotatecoeff * this.xbox.getRightX());
    this.drive.getLeftFollow().set(ControlMode.PercentOutput, this.powercoeff * this.xbox.getLeftY() + this.rotatecoeff * this.xbox.getRightX());
    this.drive.getRightMast().set(ControlMode.PercentOutput, this.powercoeff * this.xbox.getLeftY() - this.rotatecoeff * this.xbox.getRightX());
    this.drive.getRightFollow().set(ControlMode.PercentOutput, this.powercoeff * this.xbox.getLeftY() - this.rotatecoeff * this.xbox.getRightX());
  }

  @Override
  public void end(boolean interrupted) {
    this.drive.drivePower(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
  
}
