package frc.robot.subsystems.drivebase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveBaseSub extends SubsystemBase {
  private TalonFX talonFxLM;
  private TalonFX talonFxRM;
  private TalonFX talonFxLF;
  private TalonFX talonFxRF;
  //private TankDrive tankDrive;
  
  
  /**
   * Creates a new DriveBaseSub.
   */
  public DriveBaseSub(TalonFX talonFxLM,TalonFX talonFxRM, TalonFX talonFxLF, TalonFX talonFxRF) {
    this.talonFxLM = talonFxLM;
    this.talonFxRM = talonFxRM;
    this.talonFxLF = talonFxLF;
    this.talonFxRF = talonFxRF;
    

  }

  public TalonFX getLeftMass() {
    return this.talonFxLM;
  }
  public TalonFX getRightMass() {
    return this.talonFxRM;
  }
  public TalonFX getLeftFollow() {
    return this.talonFxLF;
  }
  public TalonFX getRightFollow() {
    return this.talonFxRF;
  }

  public void setPower(double power) {
    talonFxLM.set(ControlMode.PercentOutput, power);
    talonFxRM.set(ControlMode.PercentOutput, power);
    talonFxLF.set(ControlMode.PercentOutput, power);
    talonFxRF.set(ControlMode.PercentOutput, power);

  }

  @Override
  public void periodic() {
  }

}
