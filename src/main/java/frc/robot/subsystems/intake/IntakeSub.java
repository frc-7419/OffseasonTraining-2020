package frc.robot.subsystems.intake;

import javax.swing.text.ViewFactory;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.team7419.Initers;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSub extends SubsystemBase {

  private VictorSPX victor;

  public IntakeSub(VictorSPX victor) {
    this.victor = victor; 
    Initers.initVictors(victor);
    victor.setInverted(false);
  }

  public boolean getInverted() {
    return victor.getInverted();
  }

  public void setPower(double power){
    victor.set(ControlMode.PercentOutput, power);
  }
}