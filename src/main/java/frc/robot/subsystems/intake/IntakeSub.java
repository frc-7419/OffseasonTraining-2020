package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.team7419.Initers;
/**
 * For your first code assignment, you're going to be writing a subsystem 
 * for the intake on our 2020 robot. There's a tutorial on Notion that's going 
 * to step you through 
 */

 //comment 
 
public class IntakeSub extends SubsystemBase {
  /**
   * Creates a new IntakeSub.
   */
//this is a comment
//second comment

private VictorSPX victor;

public IntakeSub(VictorSPX victor){
  this.victor = victor;
  Initers.initVictors(victor);
  victor.setInverted(false);
}

public VictorSPX getVictor(){
  return victor;
}


public boolean getInverted(){
  return false;
}


  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

public void setPower(double power){
  victor.set(ControlMode.PercentOutput, power);
}

