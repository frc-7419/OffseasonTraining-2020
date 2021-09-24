package frc.robot.subsystems.drivebase;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArcadeDrive extends CommandBase {
  
  
  /**
   * Creates a new ArcadeDrive.
   */
  private DriveBaseSub driveBaseSub;
  private PaddedXbox xbox;
  private double a;
  private double b;

  public ArcadeDrive(DriveBaseSub driveBaseSub, PaddedXbox xbox, double a, double b) {
    this.driveBaseSub = driveBaseSub;
    this.xbox = xbox;
    this.a = a;
    this.b = b;
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
