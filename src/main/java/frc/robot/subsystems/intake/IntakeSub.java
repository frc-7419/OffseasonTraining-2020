package frc.robot.subsystems.intake;

import com.team7419.Initers;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * For your first code assignment, you're going to be writing a subsystem 
 * for the intake on our 2020 robot. There's a tutorial on Notion that's going 
 * to step you through 
 */

 //comment 
 //he
public class IntakeSub extends SubsystemBase {
  private VictorSPX victor;
  public IntakeSub(VictorSPX victor) {
    Initers.initVictors(victor);
    victor.setInverted(false);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public boolean getInverted() {
    return victor.getInverted();
  }
}
