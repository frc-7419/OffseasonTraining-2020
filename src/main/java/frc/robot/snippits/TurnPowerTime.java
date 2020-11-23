package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class TurnPowerTime extends CommandBase {
  
  private DriveBaseSub driveBase;
  private double power;
  private double time;
  private String direction;
  private long initTime;

  public TurnPowerTime(DriveBaseSub driveBase, String direction, double power, double time) {
    this.driveBase = driveBase;
    this.power = power;
    this.time = time;
    this.direction = direction;
    addRequirements(driveBase);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    this.driveBase.coast();
    this.initTime = System.currentTimeMillis();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    switch (this.direction) {
      case "RIGHT":
          driveBase.setPowerLeftMast(this.power);
          driveBase.setPowerRightMast(-this.power);
          driveBase.setPowerLeftFollow(this.power);
          driveBase.setPowerRightFollow(-this.power);
        // }
        break;
      case "LEFT":
          driveBase.setPowerLeftMast(-this.power);
          driveBase.setPowerRightMast(this.power);
          driveBase.setPowerLeftFollow(-this.power);
          driveBase.setPowerRightFollow(this.power);
        break;
      default:
        break;
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    this.driveBase.setPowerLeftMast(0);
    this.driveBase.setPowerRightMast(0);
    this.driveBase.setPowerLeftFollow(0);
    this.driveBase.setPowerRightFollow(0);
    this.driveBase.brake();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return (System.currentTimeMillis() - this.initTime) >= this.time;
  }
}
