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

  public Factory simFactory;
  public IntakeSub intake;
  public PaddedXbox xbox;
     
  public RobotContainer(Factory factory) {
    this.simFactory = factory;
    intake = this.simFactory.getIntakeSub();
    xbox = this.simFactory.getPaddedXbox();

    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. 
   * We're going to teach you how to use this later.
   */
  private void configureButtonBindings() {
    xbox.getA().whenPressed(simFactory.getRunIntakeWithJoystick(xbox));
  }

  public void setDefaultCommands() {
    intake.setDefaultCommand(simFactory.getRunIntakeWithJoystick(simFactory.getPaddedXbox()));
  }
}
