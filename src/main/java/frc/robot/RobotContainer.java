package frc.robot;

import frc.robot.subsystems.drivebase.DriveBaseSub;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here. 
 */
public class RobotContainer {
  private Factory factory;
  private IntakeSub intake;
  private PaddedXbox joystick;
  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer(Factory factory) {
    this.factory = factory;
    intake = factory.getIntakeSub();
    joystick = factory.getPaddedXbox();
    driveBaseSub = factory.getDriveBaseSub()

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
