package frc.robot.subsystems.intake;

import com.ctre.phoenix.motorcontrol.ControlMode;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import com.team7419.Initers;

import edu.wpi.first.wpilibj2.command.SubsystemBase;




public class IntakeSub extends SubsystemBase {

   private VictorSPX victor1;

  public IntakeSub(VictorSPX victor) {

    this.victor1 = victor;

    Initers.initVictors(victor);

    victor.setInverted(false);
  }

  public VictorSPX getVictor(){

    return victor1;
  
  }

  public void setPower(double p){

    victor1.set(ControlMode.PercentOutput, p);

  }

  public boolean getInverted(){

    return victor1.getInverted();
  }

  @Override
  
  public void periodic() {

  }
}
