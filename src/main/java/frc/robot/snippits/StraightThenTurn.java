package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class StraightThenTurn extends SequentialCommandGroup {


  /**
   * Creates a new StraightThenTurn.
   */
  public StraightThenTurn() {
    public StraightThenTurn(DriveBaseSub driveBase, double straightPower, double straightTime, String direction, double turnPower, double turnTime){}
  }
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());
    super();
    super(new StraightPowerTime(driveBase, straightPower, straightTime), new TurnPowerTime(driveBase, direction, turnPower, turnTime ));
  }
}
