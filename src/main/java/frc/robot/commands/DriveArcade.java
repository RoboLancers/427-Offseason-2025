// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveSubsystem;
import java.util.function.DoubleSupplier;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class DriveArcade extends Command {

  private final DoubleSupplier xSpeed;
  private final DoubleSupplier zRotation;
  private final DriveSubsystem driveSubsystem;

  /** Creates a new DriveArcade. */
  public DriveArcade(DoubleSupplier xSpeed, DoubleSupplier zRotation, DriveSubsystem driveSubsystem) {
    // Use addRequirements() here to declare subsystem dependencies.

    this.xSpeed = xSpeed;
    this.zRotation = zRotation;
    this.driveSubsystem = driveSubsystem;
    addRequirements(this.drivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    driveSubsystem.driveArcade(xSpeed.getAsDouble(), zRotation.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    RobotContainer.m_drivetrain.arcadeDrive(0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
