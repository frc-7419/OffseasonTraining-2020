package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class TurnPowerTime extends CommandBase {
  
  private DriveBaseSub driveBaseSub;
  private double power;
  private double time;
  private String direction;

  private double itime;

  public TurnPowerTime(DriveBaseSub driveBaseSub, String direction, double power, double time) {
    this.driveBaseSub = driveBaseSub;
    this.power = power;
    this.time = time;
    this.direction = direction;
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    this.driveBaseSub.coast();
    this.itime = System.currentTimeMillis();
  }


  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (direction == "RIGHT") {
      this.driveBaseSub.setPowerRightMast(-this.power);
      this.driveBaseSub.setPowerRightFollow(-this.power);
      this.driveBaseSub.setPowerLeftFollow(this.power);
      this.driveBaseSub.setPowerLeftMast(this.power);
    } else if (direction == "LEFT") {
      this.driveBaseSub.setPowerRightMast(this.power);
      this.driveBaseSub.setPowerRightFollow(this.power);
      this.driveBaseSub.setPowerLeftFollow(-this.power);
      this.driveBaseSub.setPowerLeftMast(-this.power);

    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    this.driveBaseSub.setPowerLeftMast(0);
    this.driveBaseSub.setPowerRightMast(0);
    this.driveBaseSub.setPowerLeftFollow(0);
    this.driveBaseSub.setPowerRightFollow(0);
    this.driveBaseSub.brake();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return (System.currentTimeMillis() - this.itime) >= this.time;
  }
}
