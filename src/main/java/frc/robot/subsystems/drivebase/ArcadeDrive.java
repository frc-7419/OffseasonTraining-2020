package frc.robot.subsystems.drivebase;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArcadeDrive extends CommandBase {
  private DriveBaseSub driveBaseSub; 
  private PaddedXbox paddedXbox; 
  private double straightCoefficient;
  private double turnCoefficient;
  /**
   * Creates a new ArcadeDrive.
   */

  public ArcadeDrive(DriveBaseSub driveBaseSub, PaddedXbox paddedXbox, double straightCoefficient, double turnCoefficient) {
    addRequirements(driveBaseSub); 
    this.driveBaseSub = driveBaseSub;
    this.paddedXbox = paddedXbox;

    this.straightCoefficient = straightCoefficient;
    this.turnCoefficient = turnCoefficient;
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() { 
    straightCoefficient = paddedXbox.getLeftY();
    turnCoefficient = paddedXbox.getRightX();

    driveBaseSub.setPower(straightCoefficient+turnCoefficient, straightCoefficient-turnCoefficient);
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
