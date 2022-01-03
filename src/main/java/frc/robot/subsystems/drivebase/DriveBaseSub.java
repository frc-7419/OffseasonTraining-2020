package frc.robot.subsystems.drivebase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveBaseSub extends SubsystemBase {
  
  private TalonFX talonFX_RM;
  private TalonFX talonFX_LM;
  private TalonFX talonFX_LF;
  private TalonFX talonFX_RF;
  /**
   * Creates a new DriveBaseSub.
   */
  public DriveBaseSub(TalonFX talonFX_RM, TalonFX talonFX_LM, TalonFX talonFX_LF, TalonFX talonFX_RF) {
    this.talonFX_RM = talonFX_RM;
    this.talonFX_LM = talonFX_LM;
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
  @Override
  public void periodic() {
  }
  public void setPowerLeft(double power) {
    talonFX_LM.set(ControlMode.PercentOutput, power);
    talonFX_LF.set(ControlMode.PercentOutput, power);
  }
  public void setPowerRight(double power) {
    talonFX_RM.set(ControlMode.PercentOutput, power);
    talonFX_RF.set(ControlMode.PercentOutput, power);
  }
  public void setPower(double power) {
    talonFX_LM.set(ControlMode.PercentOutput, power);
    talonFX_LF.set(ControlMode.PercentOutput, power);
    talonFX_RM.set(ControlMode.PercentOutput, power);
    talonFX_RF.set(ControlMode.PercentOutput, power);

  }
  public void brake() {
    talonFX_LM.setNeutralMode(NeutralMode.Brake);
    talonFX_LF.setNeutralMode(NeutralMode.Brake);
    talonFX_RM.setNeutralMode(NeutralMode.Brake);
    talonFX_RF.setNeutralMode(NeutralMode.Brake);
  }
  public void coast() {
    talonFX_LM.setNeutralMode(NeutralMode.Coast);
    talonFX_LF.setNeutralMode(NeutralMode.Coast);
    talonFX_RM.setNeutralMode(NeutralMode.Coast);
    talonFX_RF.setNeutralMode(NeutralMode.Coast);
  }

}
