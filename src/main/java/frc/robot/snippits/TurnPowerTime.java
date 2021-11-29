package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class TurnPowerTime extends CommandBase {
  
  public TurnPowerTime() {
    private DriveBaseSub driveBaseSub;
    private double power;
    private double time;
    private String direction;

  public TurnPowerTime(DriveBaseSub driveBaseSub, double power, double time, String direction){
    addRequirements(driveBaseSub);
    this.driveBaseSub = driveBaseSub;
    this.time = time;
    this.power = power;
    this.direction = direction;
  }
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    driveBaseSub.coast();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (direction == "RIGHT"){
      this.driveBaseSub.setPowerRightMast(-this.power);
      this.driveBaseSub.setPowerRightFollow(-this.power);
      this.driveBaseSub.setPowerLeftMast(-this.power);
      this.driveBaseSub.setPowerLeftFollow(-this.power);
    } else if (direction == "LEFT") {
      this.driveBaseSub.setPowerRightMast(this.power);
      this.driveBaseSub.setPowerRightFollow(this.power);
      this.driveBaseSub.setPowerLeftMast(this.power);
      this.driveBaseSub.setPowerLeftFollow(this.power);

    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    this.driveBaseSub.setPowerLeftMast(0);
    this.driveBaseSub.setPowerLeftFollow(0);
    this.driveBaseSub.setPowerRightMast(0);
    this.driveBaseSub.setPowerRightFollow(0);
    this.driveBaseSub.brake();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
    return System.currentTimeMillis() >= time;
  }
}
