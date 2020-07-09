package frc.robot;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.team7419.PaddedXbox;

import frc.robot.Constants.CanIds;
import frc.robot.subsystems.intake.*;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {

  private VictorSPX intakeVictor = new VictorSPX(CanIds.intakeVictor.id);

  // The robot's subsystems are defined here
  private final IntakeSub intake = new IntakeSub(intakeVictor);

  // The commands that run on those subsystems are defined here
  private final RunIntake runIntake = new RunIntake(intake);

  private final PaddedXbox controller = new PaddedXbox();
  
  public RobotContainer() {
    this.factory = factory;
    // Configure the button bindings
    runIntake = factory.getIntakeSub();
    controller = factory.getPaddedXbox();
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. 
   * We're going to teach you how to use this later.
   */
  private void configureButtonBindings() {

    controller.getA();
    factory.getRunIntake(0.5);

  }
}