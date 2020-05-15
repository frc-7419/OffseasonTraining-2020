package frc.robot.subsystems.intake;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
//intakesubtestadi
/**
 * For your first code assignment, you're going to be writing a subsystem 
 * for the intake on our 2020 robot. There's a tutorial on Notion that's going 
 * to step you through 
 */
public class IntakeSub extends SubsystemBase {
  private VictorSPX first;
  
  /**
   * Creates a new IntakeSub.
   */
  
  public IntakeSub(VictorSPX first) {
    this.first = first;
  }

  Initers.initVictor(VictorSPX first);

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
