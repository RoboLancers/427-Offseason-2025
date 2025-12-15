// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DrivetrainSubsystem extends SubsystemBase {
  //create brushed motors for drive
  private SparkMax leftLeader;
  private SparkMax leftFollower;
  private SparkMax rightLeader;
  private SparkMax rightFollower;

  leftLeader = new SparkMax(LEFT_LEADER_ID, MotorType.kBrushed);
  leftFollower = new SparkMax(LEFT_FOLLOWER_ID, MotorType.kBrushed);
  rightLeader = new SparkMax(RIGHT_LEADER_ID, MotorType.kBrushed);
  rightFollower = new SparkMax(RIGHT_FOLLOWER_ID, MotorType.kBrushed);

  // Set can timeout. Because this project only sets parameters once on
    // construction, the timeout can be long without blocking robot operation. Code
    // which sets or gets parameters during operation may need a shorter timeout.

  /** Creates a new DrivetrainSubsystem. */
  public DrivetrainSubsystem() {
    leftLeader.setCANTimeout(250);
    rightLeader.setCANTimeout(250);
    leftFollower.setCANTimeout(250);
    rightFollower.setCANTimeout(250);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
