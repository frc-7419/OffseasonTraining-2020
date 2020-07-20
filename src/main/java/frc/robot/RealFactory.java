package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.team7419.PaddedXbox;

import frc.robot.Constants.CanIds;
import frc.robot.subsystems.intake.DriveBaseSub;
import frc.robot.subsystems.intake.IntakeSub;
import frc.robot.subsystems.intake.RunIntake;
import frc.robot.subsystems.intake.RunIntakeWithJoystick;
import frc.robot.subsystems.intake.TankDrive;

public class RealFactory implements Factory{
    IntakeSub intakeSub;
    PaddedXbox paddedXbox;
    DriveBaseSub driveBaseSub;

	private VictorSPX getVictor(int id) {
        return new VictorSPX(id);
    }
    
    private TalonFX getTalonFX(int id){
        return new TalonFX(id);
    }

    @Override
    public IntakeSub getIntakeSub(){
        if (intakeSub == null){
            intakeSub = new IntakeSub(this.getVictor(CanIds.intakeVictor.id));
        }
        return intakeSub;
    }

    @Override
    public PaddedXbox getPaddedXbox(){
        if (paddedXbox == null){
            paddedXbox = new PaddedXbox();
        }
        return paddedXbox;
    }

    @Override
    public RunIntake getRunIntakeWithPower(double power){
        return new RunIntake(this.getIntakeSub(), power);
    }

    /**
     * Always pass SimFactory through this method. If you want it to be real, use the other method.
     */
    @Override
    public RunIntakeWithJoystick getRunIntakeWithJoystick(PaddedXbox joystick){
        return new RunIntakeWithJoystick(this.getIntakeSub(), joystick);
    }

    @Override
    public DriveBaseSub getDriveBaseSub(){
        if (driveBaseSub == null){
            driveBaseSub = new DriveBaseSub(this.getTalonFX(CanIds.leftBack.id), this.getTalonFX(CanIds.leftFront.id), 
            this.getTalonFX(CanIds.rightBack.id), this.getTalonFX(CanIds.rightFront.id));
        }
            return driveBaseSub;
    }

    @Override 
    public TankDrive getTankDrive(PaddedXbox joystick){
        return new TankDrive(this.getDriveBaseSub(), joystick);
    }
}
