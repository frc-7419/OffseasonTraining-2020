//week 7

package frc.robot.subsystems.drivebase;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArcadeDrive extends CommandBase {
  
  

  public ArcadeDrive() {

  }

  @Override

  public void initialize() {

  }


  @Override

  public void execute() {
    
    double a = xbox.getLeftY() * straight;
    double b = xbox.getRightX() * turn;

    this.driveBaseSub.setPowerLeftMast(a);
    this.driveBaseSub.setPowerLeftFollow(a);

    this.driveBaseSub.setPowerRightMast(b);
    this.driveBaseSub.setPowerRightFollow(b);

  }

  @Override

  public void end(boolean interrupted) {

    this.driveBaseSub.setPowerLeftMast(0);
    this.driveBaseSub.setPowerRightMast(0);
    this.driveBaseSub.setPowerLeftFollow(0);
    this.driveBaseSub.setPowerRightFollow(0);




  }


  @Override

  public boolean isFinished() {

    return false;
    
  }
  
}
