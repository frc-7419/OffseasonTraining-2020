package frc.robot.subsystems.drivebase;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class TankDrive extends CommandBase {
  private DriveBaseSub driveBase;
  private PaddedXbox joystick;
  
  /**
   * Creates a new TankDrive.
   */
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
    // using these from PaddedXbox.java
    this.driveBase.setLPower(joystick.getLeftY());
    this.driveBase.setRPower(joystick.getRightY());
    addRequirements(driveBase);
  }

  @Override
  public void end(boolean interrupted) {
    this.driveBase.setPower(0.0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }

}
