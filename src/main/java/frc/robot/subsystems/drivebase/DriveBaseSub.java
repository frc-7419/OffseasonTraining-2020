package frc.robot.subsystems.drivebase;

import com.ctre.phoenix.motorcontrol.ControlMode;
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

  public void setPower(double leftPower, double rightPower) {
    talonFxLM.set(ControlMode.PercentOutput, leftPower);
    talonFxLF.set(ControlMode.PercentOutput, leftPower);

    talonFxRM.set(ControlMode.PercentOutput, rightPower);
    talonFxRF.set(ControlMode.PercentOutput, rightPower);   

  }

  @Override
  public void periodic() {
  }

}