package frc.robot.snippits;

import java.sql.Time;

import com.ctre.phoenix.motorcontrol.NeutralMode;

//For now--------



import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class StraightPowerTime extends CommandBase {


  /**
   * Runs the drive base straight at a power for a time
   */
  private DriveBaseSub DriveBaseSub;
  private double power;
  private double time;
  private double tInitial;
  private double tFinal;
  
  
  public StraightPowerTime(DriveBaseSub DriveBaseSub, double power, double time) {
    this.DriveBaseSub = DriveBaseSub;
    this.power = power;
    this.time = time;


  }

  @Override
  public void initialize() {
    tInitial = System.currentTimeMillis();
  }

  

  @Override
  public void execute() {
    DriveBaseSub.setPower(power);
    tFinal = System.currentTimeMillis() - tInitial;
       
    

  }
  //Testing to see if it works, YESSSSSSSSSSSSSSSSSSSS
  

  @Override
  public void end(boolean interrupted) {
    DriveBaseSub.setPower(0);
    DriveBaseSub.brake();
    

  }

  
  @Override
  
  public boolean isFinished() {
    if(tFinal < time) {
      return true;
    }
      return false; //change to false if you have to
  }


}
