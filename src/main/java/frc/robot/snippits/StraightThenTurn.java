package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.drivebase.DriveBaseSub;
import com.ctre.phoenix.motorcontrol.can.TalonFX;




public class StraightThenTurn extends SequentialCommandGroup {


  /**
   * Creates a new StraightThenTurn.
   */
  
  public StraightThenTurn(StraightPowerTime straightPowerTime, TurnPowerTime turnPowerTime) {
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());
    super(straightPowerTime, turnPowerTime);
  }
}
