package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class RunIntake extends CommandBase {
  /**
   * Creates a new RunIntake.
   */
  private IntakeSub intake;
  private Double power;

  public RunIntake(IntakeSub intake, Double power) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.intake = intake;
    this.power = power;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    intake.setPower(0.5);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    intake.setPower(0.0);
  }

  public double getPower(){

    return power;

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
