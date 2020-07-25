package frc.robot.subsystems.drivebase;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class TankDrive extends CommandBase {
  
  
  /**
   * Creates a new TankDrive.
   */

  public DriveBaseSub driveBase;
  public PaddedXbox paddedXbox;

  public TankDrive(DriveBaseSub driveBase, PaddedXbox paddedXbox) {
    this.driveBase = driveBase;
    this.paddedXbox = paddedXbox;
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
