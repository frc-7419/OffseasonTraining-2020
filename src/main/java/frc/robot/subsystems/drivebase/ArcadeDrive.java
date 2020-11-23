package frc.robot.subsystems.drivebase;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArcadeDrive extends CommandBase {
  
  
  /**
   * Creates a new ArcadeDrive.
   */
  private DriveBaseSub driveBase;
  private PaddedXbox joystick;
  private double one;
  private double two;
  public ArcadeDrive(DriveBaseSub driveBase, PaddedXbox joystick, double one, double two) {
    this.driveBase = driveBase;
    this.joystick = joystick;
    this.one = one;
    this.two = two;
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
  }

  @Override
  public void end(boolean interrupted) {
  }

  @Override
  public boolean isFinished() {
    return false;
  }
  
}
