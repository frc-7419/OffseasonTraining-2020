package frc.robot.subsystems.drivebase;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class TankDrive extends CommandBase {
  
  
  /**
   * Creates a new TankDrive.
   */
  private DriveBaseSub driveBase;
  private PaddedXbox joystick;

  public TankDrive(DriveBaseSub driveBase, PaddedXbox joystick) {
    this.driveBase = driveBase;
    this.joystick = joystick;
    addRequirements(driveBase);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    this.driveBase.setPowerLeftMast(joystick.getLeftY());
    this.driveBase.setPowerRightMast(joystick.getRightY());
    this.driveBase.setPowerLeftFollow(joystick.getLeftY());
    this.driveBase.setPowerRightFollow(joystick.getRightY());
  }

  @Override
  public void end(boolean interrupted) {
    this.driveBase.setPowerLeftMast(0);
    this.driveBase.setPowerRightMast(0);
    this.driveBase.setPowerLeftFollow(0);
    this.driveBase.setPowerRightFollow(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }

}
