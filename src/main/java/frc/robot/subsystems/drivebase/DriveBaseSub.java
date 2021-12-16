package frc.robot.subsystems.drivebase;
// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveBaseSub extends SubsystemBase{
  private TalonFX talon1;
  private TalonFX talon2;
  private TalonFX talon3;
  private TalonFX talon4;
  /** Creates a new DriveBaseSub. */
  public DriveBaseSub(TalonFX talon1, TalonFX talon2, TalonFX talon3, TalonFX talon4) {
    this.talon1 = talon1;
    this.talon2 = talon2;
    this.talon3 = talon3;
    this.talon4 = talon4;
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

  public void setPower(double power) {
    talon1.set(ControlMode.PercentOutput, power);
    talon2.set(ControlMode.PercentOutput, power);
    talon3.set(ControlMode.PercentOutput, power);
    talon4.set(ControlMode.PercentOutput, power);
  }

  public void setLeftPower(double power) {
    talon1.set(ControlMode.PercentOutput, power);
    talon3.set(ControlMode.PercentOutput, power);
  }
  
  public void setRightPower(double power){
    talon2.set(ControlMode.PercentOutput, power);
    talon4.set(ControlMode.PercentOutput, power);
  }
  public void setPowerLeftMast(double power) {
    talon1.set(ControlMode.PercentOutput, power);
  }
  public void setPowerLeftFollow(double power) {
    talon3.set(ControlMode.PercentOutput, power);
  }
  public void setPowerRightMast(double power) {
    talon2.set(ControlMode.PercentOutput, power);
  }
  public void setPowerRightFollow(double power) {
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

  public void periodic() {
    // This method will be called once per scheduler run
  }
  // Called once the command ends or is interrupted.
}
