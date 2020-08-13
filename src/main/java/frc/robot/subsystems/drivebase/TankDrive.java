package frc.robot.subsystems.drivebase;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class TankDrive extends CommandBase {
  
  private DriveBaseSub drive;
  private PaddedXbox joystick;
  /**
   * Creates a new TankDrive.
   */
  public TankDrive(DriveBaseSub drive, PaddedXbox joystick) {
    this.drive = drive;
    this.joystick = joystick;
    addRequirements(drive);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
  }

  @Override
  public void end(boolean interrupted) {
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
