package frc.robot.subsystems.intake;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.team7419.Initers;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * For your first code assignment, you're going to be writing a subsystem 
 * for the intake on our 2020 robot. There's a tutorial on Notion that's going 
 * to step you through 
 */

 //comment 
 // sourceTree is so complicated :(

public class IntakeSub extends SubsystemBase {
  /** vivi's week 2 assignment
   * Creates a new IntakeSub.
   */

   private VictorSPX victor1;

  public IntakeSub(VictorSPX victor) {
    this.victor1 = victor;
    Initers.initVictors(victor);
    victor.setInverted(false);
  }

  public VictorSPX getVictor(){
    return victor1;
  }

  public void setPower(double p){
    victor1.set(ControlMode.PercentOutput, p);
  }

  public boolean getInverted(){
    return victor1.getInverted();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
