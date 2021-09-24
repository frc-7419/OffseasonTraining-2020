package frc.robot.subsystems.drivebase;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArcadeDrive extends CommandBase {
  
  
  /**
   * Creates a new ArcadeDrive.
   */
  private DriveBaseSub driveBaseSub;
  private PaddedXbox xbox;
  private double straight;
  private double turn;

  public ArcadeDrive(DriveBaseSub driveBaseSub, PaddedXbox xbox, double straight, double turn) {
    this.driveBaseSub = driveBaseSub;
    this.xbox = xbox;
    this.straight = straight;
    this.turn = turn;
    addRequirements(driveBaseSub);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    double a = xbox.getLeftY() * straight;
    double b = xbox.getRightX() * turn;

    this.driveBaseSub.setPowerLeftMast(a);
    this.driveBaseSub.setPowerLeftFollow(a);

    this.driveBaseSub.setPowerRightMast(b);
    this.driveBaseSub.setPowerRightFollow(b);
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
