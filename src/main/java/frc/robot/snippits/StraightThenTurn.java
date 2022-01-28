package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class StraightThenTurn extends SequentialCommandGroup {
  private DriveBaseSub driveBase;
  private double powerStraight;
  private double timeStraight;
  private double powerTurn;
  private double timeTurn;
  private String direction;

  /**
   * Creates a new StraightThenTurn.
   */
  public StraightThenTurn(DriveBaseSub driveBase, double powerStraight, double timeStraight, double powerTurn, double timeTurn, String direction) {
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());
    super(new StraightPowerTime(driveBase, powerStraight, timeStraight), new TurnPowerTime(driveBase, powerTurn, timeTurn, direction));
  }
}
