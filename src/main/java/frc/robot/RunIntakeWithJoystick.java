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
  /**
   * Creates a new RunIntakeWithJoystick.
   */

   public PaddedXbox paddedXbox;
   public IntakeSub intakeSub;

   public RunIntakeWithJoystick(IntakeSub intakeSub, PaddedXbox paddedXbox) {
    this.intakeSub = intakeSub;
    this.paddedXbox = paddedXbox;
    addRequirements(intakeSub);
  }
    // Use addRequirements() here to declare subsystem dependencies.
  

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    intakeSub.setPower(paddedXbox.getLeftY());
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    intakeSub.setPower(0.0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
