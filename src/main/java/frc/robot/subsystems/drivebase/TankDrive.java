package frc.robot.subsystems.drivebase;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class TankDrive extends CommandBase {
  
  private DriveBaseSub drive;
  private PaddedXbox xbox;
  /**
   * Creates a new TankDrive.
   */
  public TankDrive(DriveBaseSub drive, PaddedXbox xbox) {
    this.drive = drive;
    this.xbox = xbox;
    addRequirements(drive);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    drive.setPower(xbox.getLeftY());
    drive.setPower(xbox.getRightX());
  }

  @Override
  public void end(boolean interrupted) {
    drive.setPower(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }

}
