package frc.robot.subsystems.drivebase;

import frc.robot.Factory;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveBaseSub extends SubsystemBase {
  
  
  /**
   * Creates a new DriveBaseSub.
   */

  private TalonFX talonFX_LM;
  private TalonFX talonFX_RM;
  private TalonFX talonFX_LF;
  private TalonFX talonFX_RF;

  public DriveBaseSub(TalonFX talonFX_LM, TalonFX talonFX_RM, TalonFX talonFX_LF, TalonFX talonFX_RF, Factory factory) {
    this.talonFX_LM = talonFX_LM;
    this.talonFX_RM = talonFX_RM;
    this.talonFX_LF = talonFX_LF;
    this.talonFX_RF = talonFX_RF;
  }

  public TalonFX getLeftMast() {
    return this.talonFX_LM;
  }

  public TalonFX getRightMast() {
    return this.talonFX_RM;
  }

  public TalonFX getLeftFollow() {
    return this.talonFX_LF;
  }

  public TalonFX getRightFollow() {
    return this.talonFX_RF;
  }

  public void setPower(double power){
    talonFX_LM.set(ControlMode.PercentOutput, power);
    talonFX_LF.set(ControlMode.PercentOutput, power);
    talonFX_RM.set(ControlMode.PercentOutput, power);
    talonFX_RF.set(ControlMode.PercentOutput, power);
  }

  // public void setPowerLM(double power){
  //   talonFX_LM.set(ControlMode.PercentOutput, power);
  // }

  // public void setPowerLF(double power){
  //   talonFX_LF.set(ControlMode.PercentOutput, power);
  // }

  // public void setPowerRM(double power){
  //   talonFX_RM.set(ControlMode.PercentOutput, power);
  // }

  // public void setPowerRF(double power){
  //   talonFX_RF.set(ControlMode.PercentOutput, power);
  // }

  @Override
  public void periodic() {
  }

}
