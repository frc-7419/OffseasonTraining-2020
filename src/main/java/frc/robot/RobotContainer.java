package frc.robot;

import frc.robot.Factory;
import frc.robot.snippits.StraightPowerTime;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.drivebase.DriveBaseSub;
import frc.robot.subsystems.drivebase.TankDrive;
import frc.robot.subsystems.intake.IntakeSub;

public class RobotContainer {
  private Factory factory;
  private IntakeSub intake;
  private PaddedXbox paddedXbox;
  private TankDrive tankDrive;
  private DriveBaseSub driveBaseSub;
  private StraightPowerTime straightPowerTime;

  public RobotContainer(Factory factory) {
    this.factory = factory;
    intake = factory.getIntakeSub();
    paddedXbox = factory.getPaddedXbox();
    driveBaseSub = factory.getDriveBaseSub();

    // Configure the button bindings
    configureButtonBindings();
  }

  private void configureButtonBindings() {
    paddedXbox.getA().whenPressed(factory.getRunIntakeWithPower(0.5));
  }

  public void setDefaultCommands() {
    intake.setDefaultCommand(factory.getRunIntakeWithJoystick(paddedXbox));
    driveBaseSub.setDefaultCommand(factory.getArcadeDrive(paddedXbox));
  }

  public Command getAutoCommand() {
    return factory.getStraightPowerTime(PowerConstants.AutoStraightPower.val, PowerConstants.AutoStraightTime.val);
  }
}