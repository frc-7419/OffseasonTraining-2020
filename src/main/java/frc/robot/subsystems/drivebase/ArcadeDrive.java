package frc.robot.subsystems.drivebase;

import com.team7419.PaddedXbox;

import org.opencv.features2d.BOWImgDescriptorExtractor;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArcadeDrive extends CommandBase {
  
  private DriveBaseSub driveBaseSub;
  private PaddedXbox paddedXbox;
  
  /**
   * Creates a new ArcadeDrive.
   */
  public ArcadeDrive(DriveBaseSub driveBaseSub, PaddedXbox paddedXbox, double a, double b) {
    addRequirements(driveBaseSub);
    this.driveBaseSub = driveBaseSub;
    this.paddedXbox = paddedXbox;
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    double a = paddedXbox.getLeftY();
    double b = paddedXbox.getRightX();
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
