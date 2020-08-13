package frc.robot.subsystems.drivebase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveBaseSub extends SubsystemBase {
  
  private TalonFX t_LM;
  private TalonFX t_RM;
  private TalonFX t_LF;
  private TalonFX t_RF;
  /**
   * Creates a new DriveBaseSub.
   */
  public DriveBaseSub(TalonFX t_LM, TalonFX t_RM, TalonFX t_LF, TalonFX t_RF) {
    this.t_LM = t_LM;
    this.t_RM = t_RM;
    this.t_LF = t_LF;
    this.t_RF = t_RF;
  }

  public TalonFX getLeftMast(){
    return t_LM;
  }

  public TalonFX getRightMast(){
    return t_RM;
  }

  public TalonFX getLeftFollow(){
    return t_LF;
  }

  public TalonFX getRightFollow(){
    return t_RF;
  }
  public void setPower(double power){
    t_LM.set(ControlMode.PercentOutput, power);
    t_RM.set(ControlMode.PercentOutput, power);
    t_LF.set(ControlMode.PercentOutput, power);
    t_RF.set(ControlMode.PercentOutput, power);
  }
  @Override
  public void periodic() {
  }
}
