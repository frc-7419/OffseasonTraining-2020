package frc.robot.subsystems.drivebase;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveBaseSub extends SubsystemBase {
  
  /**
   * Creates a new DriveBaseSub.
   */

   private TalonFX talonFX_LM;
   private TalonFX talonFX_RM;
   private TalonFX talonFX_RF;
   private TalonFX talonFX_LF;

  public DriveBaseSub(TalonFX talonFX_LM, TalonFX talonFX_RM, TalonFX talonFX_LM, TalonFX talonFX_RF) {
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

  public brake(){
    talonFX_LM.set(NeutralMode.Brake);
    talonFX_RM.set(NeutralMode.Brake);
    talonFX_LF.set(NeutralMode.Brake);
    talonFX_RF.set(NeutralMode.Brake);
  }
  
  public coast(){
    talonFX_LM.set(NeutralMode.Coast);
    talonFX_RM.set(NeutralMode.Coast);
    talonFX_LF.set(NeutralMode.Coast);
    talonFX_RF.set(NeutralMode.Coast);
  }

  public void setPower(double power) {
    talonFX_LM.set(ControlMode.PercentOutput, power);
    talonFX_RM.set(ControlMode.PercentOutput, power);
    talonFX_LF.set(ControlMode.PercentOutput, power);
    talonFX_RF.set(ControlMode.PercentOutput, power);
  }
  
  @Override
  public void periodic() {
  }

}
