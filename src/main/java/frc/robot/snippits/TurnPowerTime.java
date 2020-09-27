package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class TurnPowerTime extends CommandBase {
  
  private DriveBaseSub driveBaseSub;
  private double power;
  private double time;
  private String direction;

  double initialTime;
  
  public TurnPowerTime(DriveBaseSub driveBaseSub,String direction, double power, double time) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.driveBaseSub = driveBaseSub; 
    this.direction = direction;
    this.power = power;
    this.time = time;
    //addRequirements(driveBaseSub);
  }


  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    initialTime = System.currentTimeMillis();
    driveBaseSub.coast();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (direction == "RIGHT"){
      driveBaseSub.setPowerLeftFollow(power);
      driveBaseSub.setPowerLeftMast(power);
      driveBaseSub.setPowerRightFollow(-power);
      driveBaseSub.setPowerRightMast(-power);
    }
    else {
      driveBaseSub.setPowerLeftFollow(-power);
      driveBaseSub.setPowerLeftMast(-power);
      driveBaseSub.setPowerRightFollow(power);
      driveBaseSub.setPowerRightMast(power);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    driveBaseSub.setPowerLeftFollow(0);
    driveBaseSub.setPowerLeftMast(0);
    driveBaseSub.setPowerRightFollow(0);
    driveBaseSub.setPowerRightMast(0);
    driveBaseSub.brake();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return (System.currentTimeMillis() - initialTime) >= time;
  }
}
