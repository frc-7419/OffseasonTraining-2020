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
  
  private Factory fact;
  private IntakeSub intake;
  private PaddedXbox xbox;
  private DriveBaseSub drive;
  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer(Factory factory) {
    this.fact = factory;
    this.intake = this.fact.getIntakeSub();
    this.xbox = this.fact.getPaddedXbox();
    this.drive = this.fact.getDriveBaseSub();
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. 
   * We're going to teach you how to use this later.
   */
  private void configureButtonBindings() {
    this.xbox.getA().whenPressed(this.fact.getRunIntakeWithPower(0.5));
  }
  public void setDefaultCommands() {
    this.intake.setDefaultCommand(this.fact.getRunIntakeWithJoystick(this.xbox));
    this.drive.setDefaultCommand(this.fact.getTankDrive(this.xbox));
  }
}
