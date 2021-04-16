package frc.robot.subsystems.drivebase;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class TankDrive extends CommandBase {
  
  private DriveBaseSub drivebase;
  private PaddedXbox joystick;

  public TankDrive(DriveBaseSub drivebase, PaddedXbox joystick) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.drivebase = drivebase;
    this.joystick = joystick;
    addRequirements(drivebase);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    drivebase.setLeftMastPower(joystick.getLeftY());
    drivebase.setLeftFollowPower(joystick.getLeftY());
    drivebase.setRightMastPower(joystick.getRightY());
    drivebase.setRightFollowPower(joystick.getRightY());
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
