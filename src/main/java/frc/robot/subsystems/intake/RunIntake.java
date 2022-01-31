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
