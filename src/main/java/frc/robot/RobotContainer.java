package frc.robot;

import com.team7419.PaddedXbox;

import frc.robot.subsystems.drivebase.DriveBaseSub;
import frc.robot.subsystems.intake.IntakeSub;
import frc.robot.subsystems.intake.RunIntakeWithJoystick;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here. 
 */
public class RobotContainer 
{
  private Factory factory;
  private IntakeSub intake;
  private PaddedXbox xbox;
  private DriveBaseSub driveBaseSub;
  public RobotContainer(Factory factory) {
  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
    this.factory = factory;
    intake = factory.getIntakeSub();
    xbox = factory.getPaddedXbox();
    driveBaseSub = factory.getDriveBaseSub();
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. 
   * We're going to teach you how to use this later.
   */
  private void configureButtonBindings() {
    xbox.getA().whenPressed(factory.getRunIntakeWithPower(0.5));
  } 
  public void setDefaultCommands(){
    intake.setDefaultCommand(factory.getRunIntakeWithJoystick(xbox));
    driveBaseSub.setDefaultCommand(factory.getTankDrive(xbox));
    driveBaseSub.setDefaultCommand(factory.getArcadeDrive(xbox));
  }
}
