package frc.robot.subsystems.drivebase;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveBaseSub extends SubsystemBase {
  
  
  /**
   * Creates a new DriveBaseSub.
   */

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

  public TalonFx getLeftMast(){
    return this.talonFX_LM;
  }

  public TalonFX getRightMast(){
    return this.talonFX_RM;
  }

  public TalonFX getLeftFollow(){
    return this.talonFX_LF;
  }

  public TalonFX getRightFollow(){
    return this.talonFX_RF;
  }

  public void setPower(double power){
    talonFX_LM.set(ControlMode.PercentOutput, power);
    talonFX_LF.set(ControlMode.PercentOutput, power);
    talonFX_RM.set(ControlMode.PercentOutput, power);
    talonFX_RF.set(ControlMode.PercentOutput, power);
  }
  @Override
  public void periodic() {
  }

}

public void brake(){
  this.leftMast.setNeutralMode(NeutralMode.Brake);
  this.rightMast.setNeutralMode(NeutralMode.Brake);
  this.leftFollow.setNeutralMode(NeutralMode.Brake);
  this.rightFollow.setNeutralMode(NeutralMode.Brake);
}

public void coast(){
  this.leftMast.setNeutralMode(NeutralMode.Coast);
  this.rightMast.setNeutralMode(NeutralMode.Coast);
  this.leftFollow.setNeutralMode(NeutralMode.Coast);
  this.rightFollow.setNeutralMode(NeutralMode.Coast);
}