package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class StraightThenTurn extends SequentialCommandGroup {


  /**
   * Creates a new StraightThenTurn.
   */

  public StraightThenTurn(DriveBaseSub driveBase, double straightPower, double straightTime, String turnDirection, double turnPower, double turnTime) {
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());
    super(new StraightPowerTime(driveBase, straightPower, straightTime), new TurnPowerTime(driveBase, turnDirection, turnPower, turnTime));
  }
}
