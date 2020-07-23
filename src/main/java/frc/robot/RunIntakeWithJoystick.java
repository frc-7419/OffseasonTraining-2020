/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.intake.IntakeSub;

public class RunIntakeWithJoystick extends CommandBase {

  private IntakeSub intake;
  private PaddedXbox paddedXbox;
  private Factory factory;
  /**
   * Creates a new RunIntakeWithJoystick.
   */
  public RunIntakeWithJoystick(IntakeSub intake, PaddedXbox paddedXbox) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.intake = intake;
    this.paddedXbox = paddedXbox;
    paddedXbox.getTrigger(factory.getRunIntakeWithPower(0.5));
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
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
