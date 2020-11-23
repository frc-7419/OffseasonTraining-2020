package frc.robot.subsystems.drivebase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveBaseSub extends SubsystemBase {
  
  
  /**
   * Creates a new DriveBaseSub.
   */
  
  private TalonFX leftMast;
  private TalonFX rightMast;
  private TalonFX leftFollow;
  private TalonFX rightFollow;

  public DriveBaseSub(TalonFX leftMast, TalonFX righMast, TalonFX leftFollow, TalonFX rightFollow) {
    this.leftMast = leftMast;
    this.rightMast = righMast;
    this.leftFollow = leftFollow;
    this.rightFollow = rightFollow;
  }

  @Override
  public void periodic() {
  }
  
  public void setPowerLeftMast(double power) {
    this.leftMast.set(ControlMode.PercentOutput, power);
  }
  public void setPowerRightMast(double power) {
    this.rightMast.set(ControlMode.PercentOutput, power);
  }
  public void setPowerLeftFollow(double power) {
    this.leftFollow.set(ControlMode.PercentOutput, power);
  }
  public void setPowerRightFollow(double power) {
    this.rightFollow.set(ControlMode.PercentOutput, power);
  }

  public TalonFX getLeftMast() {
    return this.leftMast;
  }
  public TalonFX getRightMast() {
    return this.rightMast;
  }
  public TalonFX getLeftFollow() {
    return this.leftFollow;
  }
  public TalonFX getRightFollow() {
    return this.rightFollow;
  }
}
