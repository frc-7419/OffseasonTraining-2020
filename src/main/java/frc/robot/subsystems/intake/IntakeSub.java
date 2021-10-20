package frc.robot.subsystems.intake;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.team7419.Initers;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * For your first code assignment, you're going to be writing a subsystem 
 * for the intake on our 2020 robot. There's a tutorial on Notion that's going 
 * to step you through 
 */

 //This is a comment by ricky

public class IntakeSub extends SubsystemBase {

  private VictorSPX victor;
  /**
   * Creates a new IntakeSub.
   */
  public IntakeSub(VictorSPX victor) {
    this.victor = victor;
    Initers.initVictors(this.victor);
    this.victor.setInverted(false);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public boolean getInverted() {
    return this.victor.getInverted();
  }
}
