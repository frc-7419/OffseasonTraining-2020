package frc.robot.subsystems.drivebase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveBaseSub extends SubsystemBase {
  
  private TalonFX leftm;
  private TalonFX rightm;
  private TalonFX leftf;
  private TalonFX rightf;
  /**
   * Creates a new DriveBaseSub.
   */
  public DriveBaseSub(TalonFX lm, TalonFX rm, TalonFX lf, TalonFX rf) {
    this.leftm = lm;
    this.rightm = rm;
    this.leftf = lf;
    this.rightf = rf;
    this.leftm.set(ControlMode.PercentOutput, 0);
    this.rightm.set(ControlMode.PercentOutput, 0);
    this.leftf.set(ControlMode.PercentOutput, 0);
    this.rightf.set(ControlMode.PercentOutput, 0);
  }

  @Override
  public void periodic() {
  }

  public TalonFX getLeftMast() {
    return this.leftm;
  }
  public TalonFX getRightMast() {
    return this.rightm;
  }
  public TalonFX getLeftFollow() {
    return this.leftf;
  }
  public TalonFX getRightFollow() {
    return this.rightf;
  }
}
