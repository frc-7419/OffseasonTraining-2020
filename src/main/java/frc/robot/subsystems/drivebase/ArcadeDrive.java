package frc.robot.subsystems.drivebase;

import com.team7419.PaddedXbox;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArcadeDrive extends CommandBase {
  
  private DriveBaseSub dbs;
  private PaddedXbox xbox;
  private double sc;
  private double tc;
  
  /**
   * Creates a new ArcadeDrive.
   */
  public ArcadeDrive(DriveBaseSub dbs, PaddedXbox xbox, double straightC, double turnC) {
    addRequirements(dbs);
    this.dbs = dbs;
    this.xbox = xbox;
    sc = straightC;
    tc = turnC;
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    double a = xbox.getLeftY() * sc;
    double b = xbox.getRightX() * tc;

    dbs.setLeftPower(a+b);
    dbs.setRightPower(a-b);
  }

  @Override
  public void end(boolean interrupted) {
    dbs.setPower(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
  
}
