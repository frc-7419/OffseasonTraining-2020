//week 8

package frc.robot;

import frc.robot.subsystems.drivebase.DriveBaseSub;

import frc.robot.subsystems.intake.IntakeSub;

import com.team7419.PaddedXbox;

import edu.wpi.first.wpilibj2.command.Command;


public class RobotContainer {

  
  private IntakeSub intake1;

  private Factory factory1;

  

  private PaddedXbox joystick1;

  private DriveBaseSub dbs;

  public RobotContainer(Factory factory) {

    this.factory1 = factory;

    intake1 = factory.getIntakeSub();

    joystick1 = factory.getPaddedXbox();

    dbs = factory.getDriveBaseSub();

   
    configureButtonBindings();
  }

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
