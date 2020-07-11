package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class RunIntake extends CommandBase {
  /**
   * Creates a new RunIntake.
   */
  private IntakeSub intake;

  public RunIntake(IntakeSub intake) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.intake = intake;
  }

  //public RunIntakeForward() {

  //}

public RunIntake() {
}

// Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    intake.setPower(.5);
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