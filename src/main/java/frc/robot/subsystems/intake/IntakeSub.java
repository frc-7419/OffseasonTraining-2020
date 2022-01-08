// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj2.command.CommandBase;
import com.team7419.Initers;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSub extends SubsystemBase {
  /** Creates a new IntakeSub. */
  
private VictorSPX victor;
  
public IntakeSub(VictorSPX victor) {
  this.victor = victor;
  Initers.initVictors(victor);
  victor.setInverted(false);
  }

  public boolean getInverted() {
    return victor.getInverted();
  }

  public void setPower(double power) {
    victor.set(ControlMode.PercentOutput, power);
  }

  public VictorSPX getVictor() {
    return this.victor;
  }
}

//Week 1 Comment
