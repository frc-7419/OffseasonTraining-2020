package frc.robot.subsystems.drivebase;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class TankDrive extends CommandBase {
  
  
  /**
   * Creates a new TankDrive.
   */
  private DriveBaseSub driveBaseSub;
  private PaddedXbox xbox;

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
    this.driveBaseSub.setPowerLeftMast(this.xbox.getLeftY());
    this.driveBaseSub.setPowerRightMast(this.xbox.getRightY());
    this.driveBaseSub.setPowerLeftFollow(this.xbox.getLeftY());
    this.driveBaseSub.setPowerRightFollow(this.xbox.getRightY());
  }

  @Override
  public void end(boolean interrupted) {
    this.driveBaseSub.setPowerLeftMast(0);
    this.driveBaseSub.setPowerRightMast(0);
    this.driveBaseSub.setPowerLeftFollow(0);
    this.driveBaseSub.setPowerRightFollow(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }

}
