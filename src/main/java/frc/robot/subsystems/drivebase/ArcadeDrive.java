package frc.robot.subsystems.drivebase;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArcadeDrive extends CommandBase {
  
  private DriveBaseSub driveBaseSub;
  private PaddedXbox paddedXbox;
  
  /**
   * Creates a new ArcadeDrive.
   */
  public ArcadeDrive(DriveBaseSub driveBaseSub, PaddedXbox paddedXbox, double a, double b) {
    
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
