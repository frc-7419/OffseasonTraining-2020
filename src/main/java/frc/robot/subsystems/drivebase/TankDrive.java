package frc.robot.subsystems.drivebase;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class TankDrive extends CommandBase {

  private DriveBaseSub driveBaseSub;
  private PaddedXbox paddedXbox;
  
  
  /**
   * Creates a new TankDrive.
   */
  public TankDrive(DriveBaseSub driveBaseSub, PaddedXbox paddedXbox) {
    this.driveBaseSub = driveBaseSub;
    this.paddedXbox = paddedXbox;
    addRequirements(driveBaseSub);


  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    driveBaseSub.setLeftPower(paddedXbox.getLeftY());
    driveBaseSub.setRightPower(paddedXbox.getRightY());

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
