package frc.robot.subsystems.drivebase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
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
  public void brake() {
    this.leftm.setNeutralMode(NeutralMode.Brake);
    this.rightm.setNeutralMode(NeutralMode.Brake);
    this.leftf.setNeutralMode(NeutralMode.Brake);
    this.rightf.setNeutralMode(NeutralMode.Brake);
  }
  public void coast() {
    this.leftm.setNeutralMode(NeutralMode.Coast);
    this.rightm.setNeutralMode(NeutralMode.Coast);
    this.leftf.setNeutralMode(NeutralMode.Coast);
    this.rightf.setNeutralMode(NeutralMode.Coast);
  }
  /**
   * Drives all four motors on the drivetrain with the same power.
   * @param power The power to drive at.
   */
  public void drivePower(double power) {
    this.leftm.set(ControlMode.PercentOutput, power);
    this.rightm.set(ControlMode.PercentOutput, power);
    this.leftf.set(ControlMode.PercentOutput, power);
    this.rightf.set(ControlMode.PercentOutput, power);
  }
}
