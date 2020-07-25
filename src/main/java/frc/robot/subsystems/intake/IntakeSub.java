package frc.robot.subsystems.intake;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.team7419.Initers;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RealFactory;

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
  private final VictorSPX newVictor;
  private final RealFactory factory;

  public IntakeSub(VictorSPX victor) {
    newVictor = victor;
    factory = new RealFactory();
    newVictor.setInverted(false);
    Initers.initVictors(newVictor);
    
  }

  public boolean getInverted() {
    return newVictor.getInverted();
  }

  public VictorSPX getVictor() {
    return newVictor;
  }

  public void setPower(double power) {
    newVictor.set(ControlMode.PercentOutput, power);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}