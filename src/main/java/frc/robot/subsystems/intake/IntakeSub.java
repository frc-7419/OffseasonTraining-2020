package frc.robot.subsystems.intake;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * For your first code assignment, you're going to be writing a subsystem for
 * the intake on our 2020 robot. There's a tutorial on Notion that's going to
 * step you through
 * 
 * 
 */

// comment I installed VSCode, ready to commit

public class IntakeSub<VictorSpox> extends SubsystemBase {
  private VictorSPX victor;

  public IntakeSub(VictorSPX Victor) {
    this.victor = Victor;
    Initers.initVictors(victor);
    victor.setInverted(false);

  }
  public VictorSpox getVictor(){
    return victor;
  }
  @Override
  public void periodic(){
  }

  public boolean getInverted(){
    return victer.getInverted();
  }

  public void setPower(double power){
    victor.set(ControlMode.PercentOutput, power);
    
  }
  


}
