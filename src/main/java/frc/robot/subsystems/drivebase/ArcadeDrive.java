package frc.robot.subsystems.drivebase;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArcadeDrive extends CommandBase {
  
  private DriveBaseSub driveBaseSub;
  private PaddedXbox paddedXbox;
  private double x;
  private double y;
  private double straight;
  prviate double turn;
  
  /**
   * Creates a new ArcadeDrive.
   */
  public ArcadeDrive(DriveBaseSub driveBaseSub, PaddedXbox paddedXbox, double x, double y,) {
    addRequirements(driveBaseSub);
    this.driveBaseSub = driveBaseSub;
    this.paddedXbox = paddedXbox;
    this.x = x;
    this.y = y;
    this.straight = straight;
    this.turn = turn;
    addRequirements(driveBaseSub);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    double x = paddedXbox.getLeftY() * straight;
    double y = paddedXbox.getRightX() * turn;

    this.driveBaseSub.setPowerLeftMast(x);
    this.driveBaseSub.setPowerLeftFollow(x);

    this.driveBaseSub.setPowerRightMast(y);
    this.driveBaseSub.setPowerRightFollow(y);
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
