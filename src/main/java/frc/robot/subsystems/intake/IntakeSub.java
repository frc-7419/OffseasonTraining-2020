package frc.robot.subsystems.intake;

import javax.swing.text.ViewFactory;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

//AARAV WATTAL WAS HERE


// all subsystems need to extend SubsystemBase, it's a class from WPILib

public class IntakeSub extends SubsystemBase{

	// step 1: declare all motor controllers
	private VictorSPX victor;

	// step 2: pass motor controllers through the constructor
	public IntakeSub(VictorSPX victor){
    this.victor = victor;
	}
	
	@Override
	public void periodic(){
		/* this method gets called in a loop while 
			the robot's running, just leave it blank */
	} 

		/* write a method to set power to the subsystem. this isn't necessary,
			but we recommend you do it because it'll make life a lot easier later. */
	public void setPower(double power){
		intakeVictor.set(ControlMode.PercentOutput, power);
	}
}