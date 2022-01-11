// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.intake;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Factory;

public class RunIntakeWithJoystick extends CommandBase {

  /** Creates a new RunIntakeWithJoystick. */
  public RunIntakeWithJoystick() {
    // Use addRequirements() here to declare subsystem dependencies.
  }

  private IntakeSub intake;
  private PaddedXbox paddedXbox;
  private Factory factory;

  public RunIntakeWithJoystick(IntakeSub intake, PaddedXbox paddedXbox) {

    this.intake = intake;
    this.paddedXbox = paddedXbox;
    addRequirements(intake);

  }
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

  }

  
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    intake.setPower(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
