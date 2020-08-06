package frc.robot.subsystems.drivebase;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArcadeDrive extends CommandBase {
  private DriveBaseSub driveBaseSub;
  private PaddedXbox paddedXbox;
  private double straight;
  private double turn;
  
  
  /**
   * Creates a new ArcadeDrive.
   */
  public ArcadeDrive(DriveBaseSub driveBaseSub, PaddedXbox paddedXbox, double straight, double turn) {
    this.driveBaseSub = driveBaseSub;
    this.paddedXbox = paddedXbox;
    this.straight = straight;
    this.turn = turn;
    addRequirements(driveBaseSub);    
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    driveBaseSub.setPower(paddedXbox.getLeftY());
    driveBaseSub.setPower(paddedXbox.getRightY());
    straight = paddedXbox.getLeftY();
    turn = paddedXbox.getRightY();
  }

  @Override
  public void end(boolean interrupted) {
    driveBaseSub.setPower(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
  
}
