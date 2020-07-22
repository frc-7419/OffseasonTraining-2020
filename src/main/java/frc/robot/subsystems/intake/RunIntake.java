package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class RunIntake extends CommandBase {
  private IntakeSub intakesub;
  private double power;
  /**
   * Creates a new RunIntake.
   */
  public RunIntake(IntakeSub intake, double power) {
  // Use addRequirements() here to declare subsystem dependencies.
    this.intakesub = intake;
    this.power = power;
  }
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    intakesub.setPower(power);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    intakesub.setPower(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
