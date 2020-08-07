package frc.robot.subsystems.drivebase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class DriveBaseSub extends SubsystemBase {
  private TalonFX talonFxLM;
  private TalonFX talonFxRM;
  private TalonFX talonFxLF;
  private TalonFX talonFxRF;
  private double straight;
  private double turn;


  public DriveBaseSub(TalonFX talonFxLM, TalonFX talonFxRM, TalonFX talonFxLF, TalonFX talonFxRF) {
    this.talonFxLM = talonFxLM;
    this.talonFxRM = talonFxRM;
    this.talonFxLF = talonFxLF;
    this.talonFxRF = talonFxRF;
  }

  public TalonFX getLeftMast() {
    return this.talonFxLM;
  }
  public TalonFX getRightMast() {
    return this.talonFxRM;
  }
  public TalonFX getLeftFollow() {
    return this.talonFxLF;
  }
  public TalonFX getRightFollow() {
    return this.talonFxRF;
  }
  public double getStraight() {
    return this.straight;
  }
  public double getTurn() {
    return this.turn;
  }

  public void setPower(double power){
    talonFxLM.set(ControlMode.PercentOutput, power);
    talonFxRM.set(ControlMode.PercentOutput, power);
    talonFxLF.set(ControlMode.PercentOutput, power);
    talonFxRF.set(ControlMode.PercentOutput, power);   
  }

  public void setLeftPower(double leftPower) {
    talonFxLM.set(ControlMode.PercentOutput, leftPower);
    talonFxLF.set(ControlMode.PercentOutput, leftPower);
  }

  public void setRight(double rightPower) {
    talonFxRM.set(ControlMode.PercentOutput, rightPower);
    talonFxRF.set(ControlMode.PercentOutput, rightPower);
  }

  public void brake() {
    talonFxLM.setNeutralMode(NeutralMode.Brake);
    talonFxRM.setNeutralMode(NeutralMode.Brake);
    talonFxLF.setNeutralMode(NeutralMode.Brake);
    talonFxRF.setNeutralMode(NeutralMode.Brake);

  }

  public void coast() {
    talonFxLM.setNeutralMode(NeutralMode.Coast);
    talonFxRM.setNeutralMode(NeutralMode.Coast);
    talonFxLF.setNeutralMode(NeutralMode.Coast);
    talonFxRF.setNeutralMode(NeutralMode.Coast);
  }

  @Override
  public void periodic() {
  }

}