package frc.robot.subsystems.drivebase;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArcadeDrive extends CommandBase {
  private DriveBaseSub driveBase;
  private PaddedXbox joystick;
  private double straight;
  private double turn;
  /**
   * Creates a new ArcadeDrive.
   */
  public ArcadeDrive(DriveBaseSub driveBase, PaddedXbox joystick, double straight, double turn) {
    this.driveBase = driveBase;
    this.joystick = joystick;
    this.straight = straight;
    this.turn = turn;
    addRequirements(driveBase);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    double y = joystick.getLeftY() * straight;
    double x = joystick.getRightX() * turn;
    // adding them allows for straight and turn combos.
    driveBase.setLPower(y + x);
    driveBase.setRPower(y - x);
  }

  @Override
  public void end(boolean interrupted) {
    driveBase.setPower(0.0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
  
}
