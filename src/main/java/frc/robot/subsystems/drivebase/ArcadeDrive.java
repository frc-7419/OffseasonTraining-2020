package frc.robot.subsystems.drivebase;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArcadeDrive extends CommandBase {
  
  
  private DriveBaseSub drivebase;
  private PaddedXbox joystick;
  private double straightCoefficient, turnCoefficient;

  public ArcadeDrive(DriveBaseSub drivebase, PaddedXbox joystick, double straightCoefficient, double turnCoefficient) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.drivebase = drivebase;
    this.joystick = joystick;
    this.straightCoefficient = straightCoefficient;
    this.turnCoefficient = turnCoefficient;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (joystick.getLeftY() != 0) {
      double straightPower = joystick.getLeftY() * straightCoefficient;
      drivebase.setLeftMastPower(straightPower);
      drivebase.setLeftFollowPower(straightPower);
      drivebase.setRightMastPower(straightPower);
      drivebase.setRightFollowPower(straightPower);
    } else if (joystick.getRightX() != 0) {
      double turnPower = Math.abs(joystick.getRightX() * turnCoefficient);
      if (joystick.getRightX() > 0) {
        drivebase.setLeftMastPower(turnPower);
        drivebase.setLeftFollowPower(turnPower);
        drivebase.setRightMastPower(-turnPower);
        drivebase.setRightFollowPower(-turnPower);
      } else {
        drivebase.setLeftMastPower(-turnPower);
        drivebase.setLeftFollowPower(-turnPower);
        drivebase.setRightMastPower(turnPower);
        drivebase.setRightFollowPower(turnPower);
      }
    }
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    drivebase.setLeftMastPower(0);
    drivebase.setLeftFollowPower(0);
    drivebase.setRightMastPower(0);
    drivebase.setRightFollowPower(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
  
}
