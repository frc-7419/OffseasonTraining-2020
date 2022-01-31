package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

import edu.wpi.first.wpilibj2.command.command;

import frc.robot.subsystems.drivebase.DriveBaseSub;

import com.ctre.phoenix.motorcontrol.can.TalonFX;


public class StraightThenTurn extends SequentialCommandGroup {


  public StraightThenTurn(DriveBaseSub dbs, double straightpower, double straighttime, String turnDirection, double turnpower, double turntime) {

    super(new StraightPowerTime(dbs, straightpower, straighttime), new TurnPowerTime(dbs, turnpower, turntime, turnDirection));
    
  }
}
