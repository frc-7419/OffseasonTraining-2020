package frc.robot.subsystems.drivebase;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class TankDrive extends CommandBase {
  private DriveBase Sub driveBaseSub;
  private PaddedXbox paddedXbox;
  
  /**
   * Creates a new TankDrive.
   */
  public TankDrive(DriveBaseSub driveBaseSub, PaddedXbox paddedXbox) {
    addRequirements(driveBaseSub);
    this.driveBaseSub = driveBaseSub;
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
