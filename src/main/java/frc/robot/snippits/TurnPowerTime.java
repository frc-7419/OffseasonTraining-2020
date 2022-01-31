//week 9

package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.subsystems.drivebase.DriveBaseSub;

private DriveBaseSub dbs;

private Power power;

private double time;

private String direction;

public class TurnPowerTime extends CommandBase {
  
  public TurnPowerTime(DriveBaseSub dbs, Power p, double t, String d) {

    this.dbs = dbs;

    power = p;

    time = t;

    direction = d;

  }


  @Override

  public void initialize() {

    this.dbs.coast();

  }


  @Override

  public void execute() {

    if (direction == "RIGHT"){

      dbs.setLeftPower(power);

      dbs.setRightPower(-power);

    } else if (direction == "LEFT"){

      dbs.setLeftPower(-power);

      dbs.setRightPower(power);

    }

  }

  @Override

  public boolean isFinished() {

    if (System.currentTimeMillis() >= time) {

      return true;
      
    }
    return false;
  }
}

  @Override

  public void end(boolean interrupted) {

    dbs.setPower(0);

    this.dbs.brake();

  }


 