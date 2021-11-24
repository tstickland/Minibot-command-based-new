// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.DrivetrainSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Controller;
// idk if I read from the controller here

/** An example command that uses an example subsystem. */
public class DefaultDrive extends CommandBase {
  @SuppressWarnings({ "PMD.UnusedPrivateField", "PMD.SingularField" })
  private final DrivetrainSubsystem drivetrainSubsystem;
  // private Controller driver = new Controller();
  private double leftSpeed;
  private double rightSpeed;
  private double speed;
  private double turn;

  public DefaultDrive(DrivetrainSubsystem driveSub) {
    drivetrainSubsystem = driveSub;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(driveSub);
    System.out.println("########DRIVE CREATED##########");
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    // generally want to update the state of the subsystem/robot in here, run once
    // per time scheduled
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    speed = Controller.getSpeed();
    turn = Controller.getTurn();
    leftSpeed = speed + turn;
    rightSpeed = speed - turn;
    drivetrainSubsystem.ArcadeDrive(leftSpeed, rightSpeed);
    System.out.println("DRIVING");
  }

  // Called once the command ends or is interrupted.

  @Override
  public void end(boolean interrupted) {

  }

  // Returns true when the command should end.
  // in this case we don't want to ever not run the drivetrain so it always
  // returns false

  @Override
  public boolean isFinished() {
    return false;
  }

}
