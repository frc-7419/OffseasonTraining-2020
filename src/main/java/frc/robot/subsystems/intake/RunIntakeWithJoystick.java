// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class RunIntakeWithJoystick extends CommandBase {
  /** Creates a new RunIntakeWithJoystick. */
  private IntakeSub intake1;
  private PaddedXbox joystick1;

  public RunIntakeWithJoystick(IntakeSub intake, PaddedXBox joystick) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.intake1 = intake;
    this.joystick1 = joystick;
    addRequirements(intake1);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    intake1.setPower(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
