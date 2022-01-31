package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.subsystems.drivebase.DriveBaseSub;

public class StraightPowerTime extends CommandBase {

  private DriveBaseSub next;

  private double power;

  private double time;

  public StraightPowerTime(DriveBaseSub next, double p, double t) {

    this.next = next;

    power = p;

    time = t;
  }

  @Override

  public void initialize() {

  }

  @Override

  public void execute() {

    next.setLeftPower(power);

    next.setRightPower(power);

  }


  @Override

  public void end(boolean interrupted) {

    next.setLeftPower(0);

    next.setRightPower(0);

    next.brake();

  }

  @Override

  public boolean isFinished() {

      return System.currentTimeMillis() == time;
      
  }

}
