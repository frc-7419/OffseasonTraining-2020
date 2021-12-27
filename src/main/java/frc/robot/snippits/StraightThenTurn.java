package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.command;
import frc.robot.subsystems.drivebase.DriveBaseSub;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

public class StraightThenTurn extends SequentialCommandGroup {


  /**
   * Creates a new StraightThenTurn.
   */
  public StraightThenTurn(StraightPowerTime spt, TurnPowerTime tpt) {
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());
    super(StraightPowerTime, TurnPowerTime);
  }
}
