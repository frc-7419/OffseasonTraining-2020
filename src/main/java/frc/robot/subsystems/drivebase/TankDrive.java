package frc.robot.subsystems.drivebase;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj2.command.CommandBase;


public class TankDrive extends CommandBase {
  private DriveBaseSub driveBaseSub; 
  private PaddedXbox paddedXbox; 


  public TankDrive(DriveBaseSub driveBaseSub, PaddedXbox paddedXbox) {
    addRequirements(driveBaseSub);
    this.driveBaseSub = driveBaseSub;
    this.paddedXbox = paddedXbox;
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    driveBaseSub.setPower(paddedXbox.getLeftY());
    driveBaseSub.setPower(paddedXbox.getRightY());
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
