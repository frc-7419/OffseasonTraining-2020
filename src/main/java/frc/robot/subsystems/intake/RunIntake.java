
package frc.robot.subsystems.intake;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class RunIntakeWithJoystick extends CommandBase {

  private IntakeSub intake1;

  private PaddedXbox joystick1;

  public RunIntakeWithJoystick(IntakeSub intake, PaddedXbox joystick) {

    this.intake1 = intake;

    this.joystick1 = joystick;

    addRequirements(intake1);

  }

 

  @Override

  public void end(boolean interrupted) {

    intake1.setPower(0);

  }

  @Override

  public void execute() {}

  @Override

  public void initialize() {}



  @Override

  public boolean isFinished() {

    return false;

  }

}
