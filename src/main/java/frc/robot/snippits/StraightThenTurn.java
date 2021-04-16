package frc.robot.snippits;


import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.PowerConstants;
import frc.robot.subsystems.drivebase.DriveBaseSub;


public class StraightThenTurn extends SequentialCommandGroup {


  /**
   * Creates a new StraightThenTurn.
   */
  public StraightThenTurn(DriveBaseSub driveBaseSub) {
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());
    super(
      new StraightPowerTime(driveBaseSub, PowerConstants.AutoStraightPower.val, PowerConstants.AutoStraightTime.val),
      new TurnPowerTime(driveBaseSub, "LEFT", .2, 300)
    );
  }
}
