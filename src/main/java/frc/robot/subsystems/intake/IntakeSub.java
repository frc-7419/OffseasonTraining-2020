package frc.robot.subsystems.intake;

import javax.swing.text.ViewFactory;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSub extends SubsystemBase{

	// step 1: declare all motor controllers
	private VictorSPX victor;

	// step 2: pass motor controllers through the constructor
	public IntakeSub(VictorSPX victor){
		this.victor = victor;
		initVictors(victor);
	}
}