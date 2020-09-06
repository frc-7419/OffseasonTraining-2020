package frc.robot.subsystems.drivebase;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArcadeDrive extends CommandBase {
  private DriveBaseSub drive;
  private PaddedXbox xbox;
  private double num1;
  private double num2;
  /**
   * Creates a new ArcadeDrive.
   */
  public ArcadeDrive(DriveBaseSub drive, PaddedXbox xbox, double num1, double num2)
   {
     this.drive = drive;
     this.xbox = xbox;
     this.num1 = num1;
     this.num2 = num2;
     addRequirements(drive);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    drive.setPower(xbox.getLeftY());
    drive.setPower(xbox.getRightY());
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
