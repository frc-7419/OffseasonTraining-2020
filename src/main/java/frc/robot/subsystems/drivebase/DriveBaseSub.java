package frc.robot.subsystems.drivebase;

import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveBaseSub extends SubsystemBase {
  
  
  /**
   * Creates a new DriveBaseSub.
   */
  public TalonFX rightFront;
  public TalonFX rightBack;
  public TalonFX leftFront;
  public TalonFX leftBack;

  public DriveBaseSub(TalonFX leftBack, TalonFX leftFront, TalonFX rightBack, TalonFX rightFront) {
    
    this.leftBack = leftBack;
    this.leftFront = leftFront;
    this.rightBack = rightBack;
    this.rightFront = rightFront;
  }

  @Override
  public void periodic() {
  }

}
