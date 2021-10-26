package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class StraightThenTurn extends SequentialCommandGroup {


  /**
   * Creates a new StraightThenTurn.
   */
  public StraightThenTurn(DriveBaseSub driver, double straightpower, double straighttime, double turnpower, double turntime, String dir) {
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());
    super(new StraightPowerTime(driver, straightpower, straighttime), new TurnPowerTime(driver, dir, turnpower, turntime));
  }
}
