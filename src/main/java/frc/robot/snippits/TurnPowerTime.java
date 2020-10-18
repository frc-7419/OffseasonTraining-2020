package frc.robot.snippits;

import java.sql.DriverAction;

import com.team7419.math.DriveBaseConversions;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class TurnPowerTime extends CommandBase {
  private DriveBaseSub driveBaseSub;
  private double time;
  private double power;
  private String direction;

  
  public TurnPowerTime(DriveBaseSub driveBaseSub, String direction, double power, double time) {
    addRequirements(driveBaseSub);
    this.driveBaseSub = driveBaseSub;
    this.time = time;
    this.power = power;
    this.direction = direction;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    driveBaseSub.coast();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (direction == "RIGHT") {
      driveBaseSub.setRightPower(-power);
      driveBaseSub.setLeftPower(power);
    }
    else if (direction == "LEFT") {
      driveBaseSub.setRightPower(power);
      driveBaseSub.setLeftPower(-power);

    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    driveBaseSub.setPower(0);
    driveBaseSub.brake();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    if (System.currentTimeMillis() >= time) {
      return true;
    }
    return false;
  }
}
