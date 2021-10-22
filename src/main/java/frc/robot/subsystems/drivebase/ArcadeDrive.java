package frc.robot.subsystems.drivebase;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArcadeDrive extends CommandBase {
  
  private DriveBaseSub driveBaseSub;
  private PaddedXbox joystick;
  private double straightCoefficient;
  private double turnCoefficient;
  /**
   * Creates a new ArcadeDrive.
   */
  public ArcadeDrive(DriveBaseSub driveBaseSub, PaddedXbox joystick, double straightCoefficient, double turnCoefficient) {
    this.driveBaseSub = driveBaseSub;
    this.joystick = joystick;
    this.straightCoefficient = straightCoefficient;
    this.turnCoefficient = turnCoefficient;
    //addRequirements(driveBaseSub);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    driveBaseSub.setPowerLeftMast(straightCoefficient*joystick.getLeftY() + turnCoefficient*joystick.getRightX());
    driveBaseSub.setPowerLeftFollow(straightCoefficient*joystick.getLeftY() + turnCoefficient*joystick.getRightX());
    driveBaseSub.setPowerRightMast(straightCoefficient*joystick.getLeftY() - turnCoefficient*joystick.getRightX());
    driveBaseSub.setPowerRightFollow(straightCoefficient*joystick.getLeftY() - turnCoefficient*joystick.getRightX());
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
