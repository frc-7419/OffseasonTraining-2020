package frc.robot.subsystems.drivebase;

import com.team7419.PaddedXbox;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class TankDrive extends CommandBase {
  
  private DriveBaseSub dbs;
  private PaddedXbox xbox;
  /**
   * Creates a new TankDrive.
   */
  public TankDrive(DriveBaseSub dbs, PaddedXbox xbox) {
    addRequirements(dbs);
    this.dbs = dbs;
    this.xbox = xbox;
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
