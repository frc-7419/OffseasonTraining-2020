package frc.robot.subsystems.drivebase;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class TankDrive extends CommandBase {
  private DriveBaseSub driveBaseSub;
  private PaddedXbox xbox;
  
  /**
   * Creates a new TankDrive.
   */
  public TankDrive(DriveBaseSub driveBaseSub, PaddedXbox xbox) {
    this.driveBaseSub = driveBaseSub;
    this.xbox = xbox;
    addRequirements(driveBaseSub);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    driveBaseSub.setLeftPower(xbox.getLeftY());
    driveBaseSub.setRightPower(xbox.getRightX());
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
