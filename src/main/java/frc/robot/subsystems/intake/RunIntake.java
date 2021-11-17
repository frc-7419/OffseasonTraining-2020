package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class RunIntake extends CommandBase {
  /**
   * Creates a new RunIntake.
   */
    private IntakeSub intake1;
    private double power;

  public RunIntake(IntakeSub intake, double p) {
    // Use addRequirements() here to declare subsystem dependencies.
    intake1 = intake;
    power = p;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    intake1.setPower(power);
  }

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
