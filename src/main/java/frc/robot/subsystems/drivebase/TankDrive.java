package frc.robot.subsystems.drivebase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class TankDrive extends CommandBase {
  
  private DriveBaseSub drive;
  private PaddedXbox xbox;
  /**
   * Creates a new TankDrive.
   */
  public TankDrive(DriveBaseSub driver, PaddedXbox xbox) {
    this.drive = driver;
    this.xbox = xbox;
    addRequirements(this.drive);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    this.drive.getLeftMast().set(ControlMode.PercentOutput, this.xbox.getLeftY());
    this.drive.getLeftFollow().set(ControlMode.PercentOutput, this.xbox.getLeftY());
    this.drive.getRightMast().set(ControlMode.PercentOutput, this.xbox.getRightY());
    this.drive.getRightFollow().set(ControlMode.PercentOutput, this.xbox.getRightY());
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
