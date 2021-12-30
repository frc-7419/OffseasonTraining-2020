package frc.robot;

import frc.robot.Factory;
import com.team7419.PaddedXbox;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.drivebase.DriveBaseSub;
import frc.robot.subsystems.drivebase.TankDrive;
import frc.robot.subsystems.drivebase.ArcadeDrive;
import frc.robot.subsystems.intake.IntakeSub;
import frc.robot.snippits.StraightPowerTime;
import frc.robot.snippits.TurnPowerTime;

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
  private TankDrive tankDrive;
  private DriveBaseSub driveBase;
  private ArcadeDrive arcadeDrive;
  private StraightPowerTime straightPowerTime;
  private TurnPowerTime turnPowerTime;

  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */

  public RobotContainer(Factory factory) {
    this.factory = factory;
    intakesub = factory.getIntakeSub();
    joystick = factory.getPaddedXbox();
    driveBase = factory.getDriveBaseSub();
    straightPowerTime = factory.getStraightPowerTime(PowerConstants.AutoStraightPower.val, PowerConstants.AutoStraightTime.val);
    configureButtonBindings();
  }

  public StraightPowerTime getAutoCommand() {
    return straightPowerTime;
  }

  /**
   * Use this method to define your button->command mappings. 
   * We're going to teach you how to use this later.
   */
  private void configureButtonBindings() {
    // factory.getRunIntakeWithPower(0.5);
    joystick.getA().whenPressed(factory.getRunIntakeWithPower(0.5));
  }
  public void setDefaultCommands() {
    intakesub.setDefaultCommand(factory.getRunIntakeWithJoystick(joystick));
    driveBase.setDefaultCommand(factory.getArcadeDrive(joystick));
  }
}
