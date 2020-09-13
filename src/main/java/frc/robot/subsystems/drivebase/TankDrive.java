package frc.robot.subsystems.drivebase;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class TankDrive extends CommandBase {
  
  private DriveBaseSub driveBaseSub;
  private PaddedXbox joystick;
  
  /**
   * Creates a new TankDrive.
   */
  public TankDrive(DriveBaseSub driveBaseSub, PaddedXbox joystick) {
    this.driveBaseSub = driveBaseSub;
    this.joystick = joystick;
    //addRequirements(driveBaseSub);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    driveBaseSub.setPowerLeftMast(joystick.getLeftY());
    driveBaseSub.setPowerRightMast(joystick.getRightY());
    driveBaseSub.setPowerLeftFollow(joystick.getLeftY());
    driveBaseSub.setPowerRightFollow(joystick.getRightY());
  }

  @Override
  public void end(boolean interrupted) {
    driveBaseSub.setPowerLeftMast(0);
    driveBaseSub.setPowerRightMast(0);
    driveBaseSub.setPowerLeftFollow(0);
    driveBaseSub.setPowerRightFollow(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }

}
