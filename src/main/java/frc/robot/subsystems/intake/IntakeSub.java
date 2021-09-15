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

 //william chen week 1 comment
 
public class IntakeSub extends SubsystemBase {
  /**
   * Creates a new IntakeSub.
   */
  private VictorSPX victor;
  public IntakeSub(VictorSPX victor) {
    this.victor = victor;
    Initers.initVictors(this.victor);
    this.victor.setInverted(false);
  }
  public boolean getInverted() {
    return this.victor.getInverted();
  }
  public void setPower(double power) {
    victor.set(ControlMode.PercentOutput, power);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
