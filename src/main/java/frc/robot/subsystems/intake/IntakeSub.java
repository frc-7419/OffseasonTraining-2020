package frc.robot.subsystems.intake;

import javax.swing.text.ViewFactory;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * For your first code assignment, you're going to be writing a subsystem for
 * the intake on our 2020 robot. There's a tutorial on Notion that's going to
 * step you through
 */
public class IntakeSub extends SubsystemBase {
  // Aarav Sharma's Comment
  /**
   * Creates a new IntakeSub.
   */
  private VictorSPX victor;

  public IntakeSub(VictorSPX victor) {
    this.victor = victor;
    initVictors(VictorSPX victor);
  }

  public void setInverted() {
    //victor.
  }

  
}