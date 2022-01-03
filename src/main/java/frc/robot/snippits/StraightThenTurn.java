package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class StraightThenTurn extends SequentialCommandGroup {

  /**
   * Creates a new StraightThenTurn.
   */
  
  public StraightThenTurn(DriveBaseSub driveBaseSub, String direction, double powerForStraight, double timeForStraight, double powerForTurn, double timeForTurn) {
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());
    super(new StraightPowerTime(driveBaseSub, powerForStraight, timeForStraight), new TurnPowerTime(driveBaseSub, direction, powerForTurn, timeForTurn));
  }
}
