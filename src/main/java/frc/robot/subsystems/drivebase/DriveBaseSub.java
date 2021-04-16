package frc.robot.subsystems.drivebase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveBaseSub extends SubsystemBase {
  private TalonFX leftMast, rightMast, leftFollow, rightFollow;

  /** Creates a new DriveBaseSub. */
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

  public void setLeftMastPower(double p) {
    leftMast.set(ControlMode.PercentOutput, p);
  }
  public void setRightMastPower(double p) {
    rightMast.set(ControlMode.PercentOutput, p);
  }
  public void setLeftFollowPower(double p) {
    leftFollow.set(ControlMode.PercentOutput, p);
  }
  public void setRightFollowPower(double p) {
    rightFollow.set(ControlMode.PercentOutput, p);
  }

  public void brake() {
    leftMast.setNeutralMode(NeutralMode.Brake);
    rightMast.setNeutralMode(NeutralMode.Brake);
    leftFollow.setNeutralMode(NeutralMode.Brake);
    rightFollow.setNeutralMode(NeutralMode.Brake);
  }
  public void coast() {
    leftMast.setNeutralMode(NeutralMode.Coast);
    rightMast.setNeutralMode(NeutralMode.Coast);
    leftFollow.setNeutralMode(NeutralMode.Coast);
    rightFollow.setNeutralMode(NeutralMode.Coast);
  }

  @Override
  public void periodic() {
  }

}
