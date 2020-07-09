package frc.robot.subsystems.intake;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

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

  private VictorSPX victor;

  public IntakeSub(VictorSPX victor) {

    this.victor = victor;
    

  }

  public boolean getInverted() {

    if(victor.getInverted()) {

      return true;

    }
    else {

      return false;

    }

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
