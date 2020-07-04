package frc.robot.subsystems.intake;

import javax.swing.text.ViewFactory;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
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
  public IntakeSub() {
	// step 2: pass motor controllers through the constructor
	public IntakeSub(VictorSPX victor){
		this.victor = victor;
		initVictors(victor);
	}
}