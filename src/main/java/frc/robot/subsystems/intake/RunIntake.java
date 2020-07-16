package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class RunIntake extends CommandBase {

  private IntakeSub intake;  

  public RunIntake(IntakeSub intake, double power) {
    this.intake = intake;
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    intake.setPower(0.5);
  }

  @Override
  public void end(boolean interrupted) {
    intake.setPower(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }

  public void getPower() {
    //return power;
  }
}