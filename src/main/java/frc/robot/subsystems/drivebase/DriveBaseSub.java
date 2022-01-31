package frc.robot.subsystems.drivebase;

import com.ctre.phoenix.motorcontrol.ControlMode;

import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveBaseSub extends SubsystemBase {
  
  private TalonFX talonFX_LM;

  private TalonFX talonFX_RM;

  private TalonFX talonFX_LF;

  private TalonFX talonFX_RF;



  public DriveBaseSub(TalonFX talonFX_LM, TalonFX talonFX_RM, TalonFX talonFX_LF, TalonFX talonFX_RF) {
    
    this.talonFX_LM = talonFX_LM;

    this.talonFX_RM = talonFX_RM;

    this.talonFX_LF = talonFX_LF;

    this.talonFX_RF = talonFX_RF;

  }

  public TalonFX getLeftMast(){

    return talonFX_LM;
  }

  public TalonFX getRightMast(){

    return talonFX_RM;

  }

  public TalonFX getLeftFollow(){

    return talonFX_LF;

  }


  public TalonFX getRightFollow(){

    return talonFX_RF;

  }

  public void setPower(double power){

    talonFX_LM.set(ControlMode.PercentOutput, power);

    talonFX_RM.set(ControlMode.PercentOutput, power);

    talonFX_LF.set(ControlMode.PercentOutput, power);

    talonFX_RF.set(ControlMode.PercentOutput, power);

  }

  public void setLeftPower(double leftPower){

    talonFX_LF.set(ControlMode.PercentOutput, leftPower);

    talonFX_LM.set(ControlMode.PercentOutput, leftPower);

  }

  public void setRightPower(double rightPower){

    talonFX_RF.set(ControlMode.PercentOutput, rightPower);

    talonFX_RM.set(ControlMode.PercentOutput, rightPower);

  }

  @Override
   {
  }

}
