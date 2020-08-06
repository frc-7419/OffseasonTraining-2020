package frc.robot.snippits;

import java.sql.Time;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class StraightPowerTime extends CommandBase {


  /**
   * Runs the drive base straight at a power for a time
   */
  private DriveBaseSub driveBaseSub;
  private PaddedXbox paddedXbox;
  private double power;
  private double time;
  
  
  public StraightPowerTime(DriveBaseSub driveBaseSub, PaddedXbox paddedXbox, double power, double time) {
    this.driveBaseSub = driveBaseSub;
    this.paddedXbox = paddedXbox;
    this.power = power;
    this.time = time;

  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    driveBaseSub.setPower(power);
  }


  @Override
  public void end(boolean interrupted) {
    driveBaseSub.setPower(0);

  }

  @Override
  public boolean isFinished() {
      return false;
      //return System.currentTimeMillis();
  }

}
