package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * For your first code assignment, you're going to be writing a subsystem for
 * the intake on our 2020 robot. There's a tutorial on Notion that's going to
 * step you through
 */
public class IntakeSub extends SubsystemBase {
  /**
   * Creates a new IntakeSub.
   */
  private VictorSPX victor;

  
  public VictorSPX getVictor(){
    return victor.setInverted();
  }
  public IntakeSub(VictorSPX victor) {
    this.victor = victor;
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
  
  // public void setPower(double power){
	// 	Object intakeVictor;
  //   intakeVictor.set(ControlMode.PercentOutput, power);
	// }
}
