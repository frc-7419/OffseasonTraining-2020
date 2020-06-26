
package frc.robot.subsystems.intake;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.team7419.Initers;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
 

public class IntakeSub extends SubsystemBase {
  /**
   * Creates a new IntakeSub.
   */

  private final VictorSPX newVictor;
  public IntakeSub(VictorSPX victor) {
    newVictor = victor;
    newVictor.setInverted(false);
    Initers.initVictors(newVictor);
  }

  public boolean getInverted() {
    return newVictor.getInverted();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
