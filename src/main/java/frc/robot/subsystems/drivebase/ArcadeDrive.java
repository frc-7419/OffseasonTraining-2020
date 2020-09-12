package frc.robot.subsystems.drivebase;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.PowerConstants;

public class ArcadeDrive extends CommandBase {
  private DriveBaseSub drive;
  private PaddedXbox xbox;
  private double straight;
  private double turn;
  /**
   * Creates a new ArcadeDrive.
   */
  public ArcadeDrive(DriveBaseSub drive, PaddedXbox xbox, double straight, double turn)
   {
     this.drive = drive;
     this.xbox = xbox;
     this.straight = straight;
     this.turn = turn;
     addRequirements(drive);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    double direction1 = xbox.getLeftY() * straight;
    double direction2 = xbox.getRightX() * turn;
    drive.setLeftPower(direction1+direction2);
    drive.setRightPower(direction1-direction2);
  }

  @Override
  public void end(boolean interrupted) {
    drive.setPower(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
  
}
