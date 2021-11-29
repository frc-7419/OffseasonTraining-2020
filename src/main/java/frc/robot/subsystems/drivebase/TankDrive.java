package frc.robot.subsystems.drivebase;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class TankDrive extends CommandBase {
private DriveBaseSub driveBaseSub;
private PaddedXbox paddedXbox;

public TankDrive(DriveBaseSub driveBaseSub, PaddedXbox paddedXbox){
  addRequirements(driveBaseSub);
  this.driveBaseSub = driveBaseSub;
  this.paddedXbox = paddedXbox;
}
  
  /**
   * Creates a new TankDrive.
   */
  public TankDrive() {
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
