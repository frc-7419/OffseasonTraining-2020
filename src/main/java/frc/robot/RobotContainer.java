package frc.robot;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.Command;
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
  private IntakeSub intakesub;
  private PaddedXbox joystick;
  private DriveBaseSub driveBase;
  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer(Factory factory) {
    this.factory = factory;
    intakesub = factory.getIntakeSub();
    joystick = factory.getPaddedXbox();
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. 
   * We're going to teach you how to use this later.
   */
  private void configureButtonBindings() {
    joystick.getA();
  }

  public void setDefaultCommands() {
    intakesub.setDefaultCommand(factory.getRunIntakeWithJoystick(joystick));
  }
  public Command getAutoCommand() {
    return factory.getStraightPowerTime(PowerConstants.AutoStraightPower.val, PowerConstants.AutoStraightTime.val);
  }
}
