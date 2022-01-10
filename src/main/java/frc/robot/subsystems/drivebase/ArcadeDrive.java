package frc.robot.subsystems.drivebase;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArcadeDrive extends CommandBase {
  
  private DriveBaseSub driveBaseSub;
  private PaddedXbox paddedXbox;
  private double straightCoef;
  private double turnCoef;

  /**
   * Creates a new ArcadeDrive.
   */
  public ArcadeDrive(DriveBaseSub driveBaseSub, PaddedXbox paddedXbox, double straightCoef, double turnCoef) {
    addRequirements(driveBaseSub);
    this.driveBaseSub = driveBaseSub;
    this.paddedXbox = paddedXbox;
    this.straightCoef = straightCoef;
    this.turnCoef = turnCoef;
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    double a = paddedXbox.getLeftY() * straightCoef;
    double b = paddedXbox.getRightX() * turnCoef;

    driveBaseSub.setLeftPower(a+b);
    driveBaseSub.setRightPower(a-b);


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
