package frc.robot.subsystems.drivebase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveBaseSub extends SubsystemBase {
  private TalonFX talon1;
  private TalonFX talon2;
  private TalonFX talon3;
  private TalonFX talon4;

  public DriveBaseSub(TalonFX t1, TalonFX t2, TalonFX t3, TalonFX t4) {
    this.talon1 = t1;
    this.talon1 = t2;
    this.talon1 = t3;
    this.talon1 = t4;
  }

  public TalonFX getLeftMast() {
    return this.talon1;
  }
  public TalonFX getRightMast() {
    return this.talon2;
  }
  public TalonFX getLeftFollow() {
    return this.talon3;
  }
  public TalonFX getRightFollow() {
    return this.talon4;
  }

  public void setPower(double power){
    talon1.set(ControlMode.PercentOutput, power);
    talon2.set(ControlMode.PercentOutput, power);
    talon3.set(ControlMode.PercentOutput, power);
    talon4.set(ControlMode.PercentOutput, power);
  }

  public void setLeftPower(double power){
    talon1.set(ControlMode.PercentOutput, power);
    talon3.set(ControlMode.PercentOutput, power);
  }

  public void setRightPower(double power){
    talon2.set(ControlMode.PercentOutput, power);
    talon4.set(ControlMode.PercentOutput, power);
  }

  public void brake(){
    this.talon1.setNeutralMode(NeutralMode.Brake);
    this.talon2.setNeutralMode(NeutralMode.Brake);
    this.talon3.setNeutralMode(NeutralMode.Brake);
    this.talon4.setNeutralMode(NeutralMode.Brake);
  }

  public void coast(){
    this.talon1.setNeutralMode(NeutralMode.Coast);
    this.talon2.setNeutralMode(NeutralMode.Coast);
    this.talon3.setNeutralMode(NeutralMode.Coast);
    this.talon4.setNeutralMode(NeutralMode.Coast);
  }

  @Override
  public void periodic() {
  }

public static void setDefalutCommand(TankDrive tankDrive) {
}

}
