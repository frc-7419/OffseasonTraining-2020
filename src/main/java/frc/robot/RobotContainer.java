package frc.robot;

import com.team7419.PaddedXbox;

import frc.robot.subsystems.drivebase.DriveBaseSub;
import frc.robot.subsystems.intake.IntakeSub;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here. 
 */
public class RobotContainer {
  private Factory factory;
  private IntakeSub intake;
  private PaddedXbox xbox;
  private DriveBaseSub driveBaseSub;

  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer(Factory factory) {
    this.factory = factory;
    this.intake = factory.getIntakeSub();
    this.xbox = factory.getPaddedXbox();
    this.driveBaseSub = factory.getDriveBaseSub();
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. 
   * We're going to teach you how to use this later.
   */
  private void configureButtonBindings() {
    this.xbox.getA().whenPressed(this.factory.getRunIntakeWithPower(0.5));
  }

  public void setDefaultCommands() {
    this.intake.setDefaultCommand(factory.getRunIntakeWithJoystick(this.xbox));
    this.driveBaseSub.setDefaultCommand(factory.getTankDrive(this.xbox));
  }
}
