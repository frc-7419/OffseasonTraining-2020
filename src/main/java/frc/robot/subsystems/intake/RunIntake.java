
  @Override

  public void execute() {

    intake1.setPower(power);

  }

  @Override

  public void end(boolean interrupted) {

    intake1.setPower(0);

  }
