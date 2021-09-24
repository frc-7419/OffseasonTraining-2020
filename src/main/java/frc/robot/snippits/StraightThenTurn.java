package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class StraightThenTurn extends SequentialCommandGroup {


  /**
   * Creates a new StraightThenTurn.
   */
  public StraightThenTurn(DriveBaseSub driveBase, double spower, double stime, String direction, double tpower, double ttime) {
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());
    super(new StraightPowerTime(driveBase, spower, stime), new TurnPowerTime(driveBase, direction, tpower, ttime));
  }
}
