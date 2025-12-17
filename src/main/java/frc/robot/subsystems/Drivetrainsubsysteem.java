// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

 package frc.robot.subsystems;

 import com.revrobotics.spark.SparkLowLevel.MotorType;
 import com.revrobotics.spark.SparkMax;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
 import frc.robot.Constants.DriveConstants;
 import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;

 public class Drivetrainsubsysteem extends SubsystemBase {
  private final SparkMax leftLeader;
  private final SparkMax leftFollower;
  private final SparkMax rightLeader;
  private final SparkMax rightFollower;
 
  private final DifferentialDrive drive;
 drive = new DiffrentalDrive(leftMotors, rightMotors);
  // **creates new drivetrain */
  /** Creates a new Drivetrainsubsysteem. */

  public Drivetrainsubsysteem() {
    leftLeader = new SparkMax(DriveConstants.LEFT_LEADER_ID, MotorType.kBrushed);
    leftFollower = new SparkMax(DriveConstants.LEFT_FOLLOWER_ID, MotorType.kBrushed);
    rightLeader = new SparkMax(DriveConstants.RIGHT_LEADER_ID, MotorType.kBrushed);
    rightFollower = new SparkMax(DriveConstants.RIGHT_FOLLOWER_ID, MotorType.kBrushed);

    leftLeader.setCANTimeout(250);
 leftFollower.setCANTimeout(250);
 rightLeader.setCANTimeout(250);
 rightFollower.setCANTimeout(250);

 
 config.follow(leftLeader);
 leftFollower.configure(config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
 config.follow(rightLeader);
 right.Follower.configure(config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);

  }

 

 @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  }
