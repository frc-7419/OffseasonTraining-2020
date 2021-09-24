package frc.robot;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.drivebase.ArcadeDrive;
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
  private ArcadeDrive arcadeDrive;

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

  public Command getAutoCommand() {
    return factory.getStraightPowerTime(PowerConstants.AutoStraightPower.val, PowerConstants.AutoStraightTime.val);
  }

  public void setDefaultCommands() {
    this.intake.setDefaultCommand(factory.getRunIntakeWithJoystick(this.xbox));
    // this.driveBaseSub.setDefaultCommand(factory.getArcadeDrive(this.xbox));
    this.driveBaseSub.setDefaultCommand(factory.getTankDrive(this.xbox));

  }
}
