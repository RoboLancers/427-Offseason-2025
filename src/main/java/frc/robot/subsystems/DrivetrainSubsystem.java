// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkMaxConfig;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;

public class DrivetrainSubsystem extends SubsystemBase {
  private final SparkMax leftLeader;
  private final SparkMax leftFollower;
  private final SparkMax rightLeader;
  private final SparkMax rightFollower;
  private final DifferentialDrive drive;

  /** Creates a new DrivetrainSubsystem. */
  public DrivetrainSubsystem() {
    leftLeader = new SparkMax(0, MotorType.kBrushed);
    leftFollower = new SparkMax(1, MotorType.kBrushed);
    rightLeader = new SparkMax(2, MotorType.kBrushed);
    rightFollower = new SparkMax(3, MotorType.kBrushed);

    leftLeader.setCANTimeout(250);
    leftFollower.setCANTimeout(250);
    rightLeader.setCANTimeout(250);
    rightFollower.setCANTimeout(250);

    SparkMaxConfig config = new SparkMaxConfig();
    config.voltageCompensation(12);
    config.smartCurrentLimit(DriveConstants.DRIVE_MOTOR_CURRENT_LIMIT);

    config.follow(leftLeader);
    leftFollower.configure(config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    config.follow(rightLeader);
    rightFollower.configure(config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    config.disableFollowerMode();
    rightLeader.configure(config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    config.inverted(true);
    leftLeader.configure(config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);

    drive = new DifferentialDrive(leftLeader, rightLeader);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void arcadeDrive(double moveSpeed, double rotateSpeed) {
    drive.arcadeDrive(moveSpeed, rotateSpeed);
  }
}
