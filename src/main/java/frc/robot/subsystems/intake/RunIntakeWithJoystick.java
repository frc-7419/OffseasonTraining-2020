// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class RunIntakeWithJoystick extends CommandBase {
  private IntakeSub intake;
  private PaddedXbox xbox;
  /** Creates a new RunIntakeWithJoystick. */
  public RunIntakeWithJoystick() {
  public RunIntakeWithJoystick(IntakeSub intake, PaddedXbox xbox) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.intake = intake;
    this.xbox = xbox;
    addRequirements(intake);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}
  public void execute() {
    this.intake.setPower(this.xbox.getLeftY());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}
  public void end(boolean interrupted) {
    this.intake.setPower(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
