package frc.robot;

import com.team7419.PaddedXbox;

import frc.robot.subsystems.intake.IntakeSub;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here. 
 */
public class RobotContainer {

  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  private Factory factory;
  private IntakeSub intakesub;
  private PaddedXbox joystick;

  public RobotContainer(Factory factory) {
    this.factory = factory;
    this.intakesub = this.factory.getIntakeSub();
    this.joystick = this.factory.getPaddedXbox();
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. 
   * We're going to teach you how to use this later.
   */
  private void configureButtonBindings() {
    joystick.getA().whenPressed(factory.getRunIntakeWithPower(0.5));
  }
}
