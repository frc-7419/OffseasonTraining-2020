package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.team7419.Initers;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
/**
 * For your first code assignment, you're going to be writing a subsystem 
 * for the intake on our 2020 robot. There's a tutorial on Notion that's going 
 * to step you through 
 */

 //stephen was here 
 //telebop
 
public class IntakeSub extends SubsystemBase {
  private VictorSPX victor1;
  /**
   * Creates a new  IntakeSub.
   */
  public IntakeSub(VictorSPX victor1) {
    this.victor1 = victor1;
    Initers.initVictors(victor1);
    victor1.setInverted(false);
  }

  public void setPower(double power) {
    victor1.set(ControlMode.PercentOutput, power);
  }
  public VictorSPX getVictor() {
    return victor1;
  }
  public boolean getInverted() {
    return victor1.getInverted();
  }


  @Override  
  public void periodic() {
    // This method will be called once per scheduler run
    
  }
}
