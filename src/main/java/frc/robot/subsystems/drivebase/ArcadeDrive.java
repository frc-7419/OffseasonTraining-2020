package frc.robot.subsystems.drivebase;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArcadeDrive extends CommandBase {
  
  
  private DriveBaseSub drivebasesub;
  private PaddedXbox paddedXbox;
  private double straight;
  private double turn;

  public ArcadeDrive(DriveBaseSub d, PaddedXbox p, double s, double t) {
    this.drivebasesub = d;
    this.paddedXbox = p;
    this.straight = s;
    this.turn = t;
    addRequirements(drivebasesub);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    double a = paddedXbox.getLeftY() * straight;
    double b = paddedXbox.getRightX() * turn;
    drivebasesub.setLeftPower(a + b);
    drivebasesub.setRightPower(a-b);

  }

  @Override
  public void end(boolean interrupted) {
    this.drivebasesub.setPower(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
  
}
