package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class TurnPowerTime extends CommandBase {
  private DriveBaseSub driveBaseSub;
  private double power;
  private double time;
  private String direction;
 
 
  public TurnPowerTime(DriveBaseSub driveBaseSub, double power, double time, String direction) {
    this.driveBaseSub = driveBaseSub;
    this.power = power;
    this.time = time;
    this.direction = direction;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    driveBaseSub.coast();
  }

  // Called every time the scheduler runs while the command is scheduled.
  public void execute() {
    if (direction == "RIGHT") {
      driveBaseSub.setRightPower(-power);
      driveBaseSub.setLeftPower(power);
    }
    
    if (direction == "LEFT") {
      driveBaseSub.setRightPower(power);
      driveBaseSub.setLeftPower(-power);
    }



  }
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    driveBaseSub.setPower(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
