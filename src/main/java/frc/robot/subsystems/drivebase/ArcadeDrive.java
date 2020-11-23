package frc.robot.subsystems.drivebase;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArcadeDrive extends CommandBase {
  
  
  /**
   * Creates a new ArcadeDrive.
   */
  private DriveBaseSub driveBase;
  private PaddedXbox joystick;
  private double straightCoefficient;
  private double turnCoefficient;
  public ArcadeDrive(DriveBaseSub driveBase, PaddedXbox joystick, double straightCoefficient, double turnCoefficient) {
    this.driveBase = driveBase;
    this.joystick = joystick;
    this.straightCoefficient = straightCoefficient;
    this.turnCoefficient = turnCoefficient;
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    this.driveBase.setPowerLeftMast((this.straightCoefficient*this.joystick.getLeftY())+(this.turnCoefficient*this.joystick.getRightX()));
    this.driveBase.setPowerRightMast((this.straightCoefficient*this.joystick.getLeftY())-(this.turnCoefficient*this.joystick.getRightX()));
    this.driveBase.setPowerLeftFollow((this.straightCoefficient*this.joystick.getLeftY())+(this.turnCoefficient*this.joystick.getRightX()));
    this.driveBase.setPowerRightFollow((this.straightCoefficient*this.joystick.getLeftY())-(this.turnCoefficient*this.joystick.getRightX()));
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
