package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.command;
import frc.robot.subsystems.drivebase.DriveBaseSub;
import com.ctre.phoenix.motorcontrol.can.TalonFX;


public class StraightThenTurn extends SequentialCommandGroup {


  /**
   * Creates a new StraightThenTurn.
   */
  public StraightThenTurn(DriveBaseSub dbs, double straightpower, double straighttime, String turnDirection, double turnpower, double turntime) {
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());
    super(new StraightPowerTime(dbs, straightpower, straighttime), new TurnPowerTime(dbs, turnpower, turntime, turnDirection));
  }
}
