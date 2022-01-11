package frc.robot.subsystems.drivebase;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArcadeDrive extends CommandBase {
  
  
  /**
   * Creates a new ArcadeDrive.
   */
  private DriveBaseSub driveBaseSub;
  private PaddedXbox paddedXbox;
  private double straightCo;
  private double turnCo;
  
  public ArcadeDrive(DriveBaseSub driveBaseSub, PaddedXbox paddedXbox, double straightCo, double turnCo) {
    this.driveBaseSub = driveBaseSub;
    this.paddedXbox = paddedXbox;
    this.straightCo = straightCo;
    this.turnCo = turnCo;
    addRequirements(driveBaseSub);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    double a = paddedXbox.getLeftY() * straightCo;
    double b = paddedXbox.getRightX() * turnCo;

    driveBaseSub.setPower(a+b);
    driveBaseSub.setPower(a-b);
  }

  @Override
  public void end(boolean interrupted) {
    driveBaseSub.setPower(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
  
}
