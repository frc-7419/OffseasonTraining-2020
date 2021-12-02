package frc.robot;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.intake.IntakeSub;
import frc.robot.snippits.StraightPowerTime;
import frc.robot.subsystems.drivebase.DriveBaseSub;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a "declarative" paradigm, very little robot logic should
 * actually be handled in the {@link Robot} periodic methods (other than the
 * scheduler calls). Instead, the structure of the robot (including subsystems,
 * commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  private Factory factory;
  private IntakeSub intake;
  private PaddedXbox xbox;
  private DriveBaseSub driveBaseSub;
  private StraightPowerTime straightPowerTime;
  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer(Factory factory) {
    // Configure the button bindings
    this.factory = factory;
    intake = factory.getIntakeSub();
    xbox = factory.getPaddedXbox();
    driveBaseSub = factory.getDriveBaseSub();
    straightPowerTime = factory.getStraightPowerTime(PowerConstants.AutoStraightPower.val, PowerConstants.AutoStraightPower.val);
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. 
   * We're going to teach you how to use this later.
   */
  private void configureButtonBindings() {
    xbox.getA().whenPressed(factory.getRunIntakeWithPower(0.5));
  }

  public Command getAutoCommand() {
    return factory.getStraightPowerTime(PowerConstants.AutoStraightPower.val, PowerConstants.AutoStraightTime.val);
  }

  public void setDefaultCommands(){
    intake.setDefaultCommand(factory.getRunIntakeWithJoystick(xbox));
    driveBaseSub.setDefaultCommand(factory.getTankDrive(xbox));
    driveBaseSub.setDefaultCommand(factory.getArcadeDrive(xbox));
  }


}
