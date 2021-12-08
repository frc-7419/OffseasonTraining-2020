package frc.robot;

import frc.robot.subsystems.drivebase.DriveBaseSub;
import frc.robot.subsystems.intake.IntakeSub;
import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.Command;

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
  private Factory factory1;
  private IntakeSub intake1;
  private PaddedXbox joystick1;
  private DriveBaseSub dbs;

  public RobotContainer(Factory factory) {
    this.factory1 = factory;
    intake1 = factory.getIntakeSub();
    joystick1 = factory.getPaddedXbox();
    dbs = factory.getDriveBaseSub();
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. 
   * We're going to teach you how to use this later.
   */
  private void configureButtonBindings() {
    joystick1.getA().whenPressed(factory1.getRunIntakeWithPower(0.5));
  }

  public void setDefaultCommands(){
    intake1.setDefaultCommand(factory1.getRunIntakeWithJoystick(joystick1));
    intake1.setDefaultCommand(factory1.getArcadeDrive(joystick1));
  }

  public Command getAutoCommand(){
    return factory1.getStraightPowerTime(PowerConstants.AutoStraightPower.val, PowerConstants.AutoStraightTime.val);
  }
}
