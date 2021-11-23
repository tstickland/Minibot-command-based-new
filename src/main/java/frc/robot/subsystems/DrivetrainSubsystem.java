// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

// import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.TalonNumbers;

public class DrivetrainSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  
  private Talon leftTalon1 = new Talon(TalonNumbers.talonLeft1); 
  private Talon leftTalon2 = new Talon(TalonNumbers.talonLeft2);
  private Talon rightTalon1 = new Talon(TalonNumbers.talonRight1);
  private Talon rightTalon2 = new Talon(TalonNumbers.talonRight2);
   

  // creating a left and right motor controller group
  /*
  private SpeedControllerGroup leftTalons = new SpeedControllerGroup(new Talon(TalonNumbers.talonLeft1),
      new Talon(TalonNumbers.talonLeft2));
  private SpeedControllerGroup rightTalons = new SpeedControllerGroup(new Talon(TalonNumbers.talonLeft1),
      new Talon(TalonNumbers.talonLeft2));
  */

  public void ArcadeDrive(double leftSpeed, double rightSpeed) {
    // leftTalons.set(leftSpeed);
    // rightTalons.set(rightSpeed);
    leftTalon1.set(leftSpeed);
    leftTalon2.set(leftSpeed);
    rightTalon1.set(rightSpeed);
    rightTalon2.set(rightSpeed);
  }

  //
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
