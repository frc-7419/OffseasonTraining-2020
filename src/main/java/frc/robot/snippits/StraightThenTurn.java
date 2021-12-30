package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class StraightThenTurn extends SequentialCommandGroup {


  /**
   * Creates a new StraightThenTurn.
   */
  public StraightThenTurn(StraightPowerTime straightPowerTime, TurnPowerTime turnPowerTime) {
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());
    // helpful link for command groups: https://docs.wpilib.org/en/stable/docs/software/commandbased/command-groups.html
    super(straightPowerTime, turnPowerTime);
  }
}
