package frc.robot.subsystems.intake;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.team7419.Initers;


import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.team7419.Initers;
import javax.swing.text.ViewFactory;
/**
 * For your first code assignment, you're going to be writing a subsystem for
 * the intake on our 2020 robot. There's a tutorial on Notion that's going to
 * step you through
 */

 //comment 
 
public class IntakeSub extends SubsystemBase {
  //private static final VictorSPX VictorSPX = null;
/**
   * Creates a new IntakeSub.
   */
  private VictorSPX victor;

  
  public IntakeSub(VictorSPX victor) {
    this.victor = victor;
    Initers.initVictors(victor);
    //int init = Initers.initVictors(VictorSPX victor);
  }

  public VictorSPX getVictor(){
    return victor;
    
  }
  // public IntakeSub(VictorSPX victor) {
  //   this.victor = victor;
  // }
  // public IntakeSub(){

  // }

  // public IntakeSub(VictorSPX victor) {
  //   this.victor = victor;
  // }

  //public IntakeSub() {

  //}

  public IntakeSub() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  //power function: I am still working on this
  // public void setPower(double power){
	// 	//Object intakeVictor;
  //   //Object ControlMode;
  //   intakeVictor.set(ControlMode.PercentOutput, power);
  // }

  public boolean getInverted() {
    return false;
    //return victor.getInverted();
  }

public void setPower(double d) {
}

  
  // public void setPower(double power){
	// 	Object intakeVictor;
  //   intakeVictor.set(ControlMode.PercentOutput, power);
	// }
}
