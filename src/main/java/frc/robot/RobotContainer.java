package frc.robot;

import frc.robot.Factory;
import frc.robot.snippits.StraightPowerTime;
import frc.robot.snippits.TurnPowerTime;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.drivebase.DriveBaseSub;
import frc.robot.subsystems.drivebase.TankDrive;
import frc.robot.subsystems.intake.IntakeSub;


public class RobotContainer {
  private Factory  factory;
  private IntakeSub intake;
  private PaddedXbox paddedXbox;
  private TankDrive tankdrive;
  private DriveBaseSub driveBase;
  private StraightPowerTime straightPowerTime;
 
  //robot container
  public RobotContainer() {
    this.factory =  Factory;
    intake = factory.getIntakeSub();
    paddedXbox = factory.getPaddedXbox();
    drivebase = factory.getDriveBaseSub();
    arcadedrive = factory.getArcadedrive();
    straightPowerTime = factory.getStraightPowerTime(PowerConstants.AutoStraightPower.val, PowerConstants.AutoStraightTime.val);
  //configure button bindings
      configureButtonBindings();
}

public straightPowerTime getAutoCommand() {
  return straightPowerTime;
}

  /**
   * Use this method to define your button->command mappings. 
   * We're going to teach you how to use this later.
   */
  private void configureButtonBindings() {
    joystick.getA().whenpressed(factory.getRunIntakeWithPower(0.5));
  }
  public void setdefaultCommand() {
    intake.setdefaultCommand(factory.getRunintakewithjoystick(paddedXbox))
  }
}


