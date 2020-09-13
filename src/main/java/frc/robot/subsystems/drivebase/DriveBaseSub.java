package frc.robot.subsystems.drivebase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveBaseSub extends SubsystemBase {
  
  private TalonFX leftMast;
  private TalonFX rightMast;
  private TalonFX leftFollow;
  private TalonFX rightFollow;
  /**
   * Creates a new DriveBaseSub.
   */
  public DriveBaseSub(TalonFX leftMast, TalonFX rightMast, TalonFX leftFollow, TalonFX rightFollow) {
    this.leftMast = leftMast;
    this.rightMast = rightMast;
    this.leftFollow = leftFollow;
    this.rightFollow = rightFollow;
  }
  public TalonFX getLeftMast() {
    return leftMast;
  }
  public TalonFX getRightMast() {
    return rightMast;
  }
  public TalonFX getLeftFollow() {
    return leftFollow;
  }
  public TalonFX getRightFollow() {
    return rightFollow;
  }

  // set power
  public void setPowerLeftMast(double power) {
    leftMast.set(ControlMode.PercentOutput, power);
  }
  public void setPowerRightMast(double power) {
    rightMast.set(ControlMode.PercentOutput, power);
  }
  public void setPowerLeftFollow(double power) {
    leftFollow.set(ControlMode.PercentOutput, power);
  }
  public void setPowerRightFollow(double power) {
    rightFollow.set(ControlMode.PercentOutput, power);
  }

  public void brake() {
    leftMast.setNeutralMode(NeutralMode.Brake);
    leftFollow.setNeutralMode(NeutralMode.Brake);
    rightMast.setNeutralMode(NeutralMode.Brake);
    rightFollow.setNeutralMode(NeutralMode.Brake);
  }
  public void coast() {
    leftMast.setNeutralMode(NeutralMode.Coast);
    leftFollow.setNeutralMode(NeutralMode.Coast);
    rightMast.setNeutralMode(NeutralMode.Coast);
    rightFollow.setNeutralMode(NeutralMode.Coast);
  }



  @Override
  public void periodic() {
  }

}
