package frc.robot.snippits;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class TurnPowerTime extends CommandBase {
  private DriveBaseSub driveBase;
  private String direction;
  private double power;
  private double time;
  private double initialTime;
  public TurnPowerTime(DriveBaseSub driveBase, String direction, double power, double time) {
    this.driveBase = driveBase;
    this.direction = direction;
    this.power = power;
    this.time = time;
    addRequirements(driveBase);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    initialTime = System.currentTimeMillis();
    driveBase.coast();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (direction == "RIGHT") {
      driveBase.setLPower(power);
      driveBase.setRPower(-power);
      // driveBase.getLeftMast().set(ControlMode.PercentOutput,power);
      // driveBase.getRightMast().set(ControlMode.PercentOutput,-power);
      // driveBase.getLeftFollow().set(ControlMode.PercentOutput,power);
      // driveBase.getRightFollow().set(ControlMode.PercentOutput,-power);
    }
    if (direction=="LEFT") {
      driveBase.setRPower(power);
      driveBase.setLPower(-power);
      // driveBase.getLeftMast().set(ControlMode.PercentOutput,-power);
      // driveBase.getRightMast().set(ControlMode.PercentOutput,power);
      // driveBase.getLeftFollow().set(ControlMode.PercentOutput,-power);
      // driveBase.getRightFollow().set(ControlMode.PercentOutput,power);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    driveBase.setPower(0.0);
    driveBase.brake();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    if (System.currentTimeMillis() - initialTime >= time) {
      return true;
    }
    else {
      return false;
    }
  }
}
