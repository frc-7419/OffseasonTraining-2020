package frc.robot.subsystems.intake;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
//intakesubtestadi
/**
 * For your first code assignment, you're going to be writing a subsystem 
 * for the intake on our 2020 robot. There's a tutorial on Notion that's going 
 * to step you through 
 */
public class IntakeSub extends SubsystemBase {
  /**
   * Creates a new IntakeSub.
   */

  private VictorSPX victor;


   /** Its a comment*/
  public IntakeSub(VictorSPX victor) {

    this.victor = victor;

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }


  public void setPower(double power){

    // intakeVictor.set(ControlMode.PercentOutput, power);

  }
}
