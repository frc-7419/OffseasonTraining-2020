package frc.robot.subsystems.drivebase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

// import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveBaseSub extends SubsystemBase {
  private TalonFX t1;
  private TalonFX t2;
  private TalonFX t3;
  private TalonFX t4;
  
  /**
   * Creates a new DriveBaseSub.
   */
  public DriveBaseSub(TalonFX t1, TalonFX t2, TalonFX t3, TalonFX t4) {
    this.t1 = t1;
    this.t2 = t2;
    this.t3 = t3;
    this.t4 = t4;
  }

  public TalonFX getLeftMast() {
    return this.t1;
  }
  public TalonFX getRightMast() {
    return this.t2;
  }
  public TalonFX getLeftFollow() {
    return this.t3;
  }
  public TalonFX getRightFollow() {
    return this.t4;
  }

  @Override
  public void periodic() {
  }

  // for reference: the below code will be used in tankdrive.java, where we will passing the powerValue.
  public void setPower(double powerValue) {
    t1.set(ControlMode.PercentOutput, powerValue);
    t2.set(ControlMode.PercentOutput, powerValue);
    t3.set(ControlMode.PercentOutput, powerValue);
    t4.set(ControlMode.PercentOutput, powerValue);
  }

  public void setRPower(double powerValue) {
    t2.set(ControlMode.PercentOutput, powerValue);
    t4.set(ControlMode.PercentOutput, powerValue);
  }

  public void setLPower(double powerValue) {
    t1.set(ControlMode.PercentOutput, powerValue);
    t3.set(ControlMode.PercentOutput, powerValue);
  }

  public void brake() {
    t1.setNeutralMode(NeutralMode.Brake);
    t2.setNeutralMode(NeutralMode.Brake);
    t3.setNeutralMode(NeutralMode.Brake);
    t4.setNeutralMode(NeutralMode.Brake);
  }

  public void coast() {
    t1.setNeutralMode(NeutralMode.Coast);
    t2.setNeutralMode(NeutralMode.Coast);
    t3.setNeutralMode(NeutralMode.Coast);
    t4.setNeutralMode(NeutralMode.Coast);
  }

}
