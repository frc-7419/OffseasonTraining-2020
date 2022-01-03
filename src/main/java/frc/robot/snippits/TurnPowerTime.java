package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class TurnPowerTime extends CommandBase {
  private DriveBaseSub driveBaseSub;
  private double power;
  private double time;
  private String direction;
  private double difference;
  public TurnPowerTime(DriveBaseSub driveBaseSub, String direction, double power, double time) {
    this.driveBaseSub = driveBaseSub;
    this.power = power;
    this.time = time;
    this.direction = direction;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(driveBaseSub);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    difference = System.currentTimeMillis();
    driveBaseSub.coast();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if(direction.equals("RIGHT")) {
      driveBaseSub.setPowerLeft(power);
      driveBaseSub.setPowerRight(-power);
    }
    else {
      driveBaseSub.setPowerLeft(-power);
      driveBaseSub.setPowerRight(power);
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
    double currentTime = System.currentTimeMillis();
    if(currentTime-difference>=time) {
      return true;
    }
    return false;
  }
}
