package frc.robot;

import com.team7419.PaddedXbox;

//import org.graalvm.compiler.replacements.SnippetCounter.Group.Factory;

//import java.lang.invoke.ClassSpecializer.Factory;

import frc.robot.subsystems.intake.*;
//mport jdk.nashorn.internal.runtime.regexp.JoniRegExp.Factory;
//import sun.security.smartcardio.SunPCSC.Factory;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 
 */
public class RobotContainer {

  // The robot's subsystems are defined here
  private final IntakeSub intake = new IntakeSub();

  // The commands that run on those subsystems are defined here
  private final RunIntake runIntake = new RunIntake();

  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  private Factory factory;
  private IntakeSub intakeSub;
  private PaddedXbox controller;

  //private Object factory;

  public RobotContainer() {
    // Configure the button bindings
    //this.factory = factory;
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. 
   * We're going to teach you how to use this later.
   */
  private void configureButtonBindings() {
  }
}
