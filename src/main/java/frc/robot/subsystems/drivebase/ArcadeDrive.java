package frc.robot.subsystems.drivebase;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArcadeDrive extends CommandBase {
  
  private DriveBaseSub driveBaseSub;
  private PaddedXbox paddedXbox;
  private double x;
  private double y;
  
  /**
   * Creates a new ArcadeDrive.
   */
  public ArcadeDrive(DriveBaseSub driveBaseSub, PaddedXbox paddedXbox, double x, double y,) {
    addRequirements(driveBaseSub);
    this.driveBaseSub = driveBaseSub;
    this.paddedXbox = paddedXbox;
    this.x = x;
    this.y = y;
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
