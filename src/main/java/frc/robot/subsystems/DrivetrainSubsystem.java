//I SWEAR I DID CODE I JUST ACCIDENTALLY DELTED THIS SUBSYTEM THEN I BROUGHT IT BACK BUT LIKE IT NEVER SAVED SO LIKE IM SOWWWWWY ILL FIX IT OVER BREAK

// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkMaxConfig;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * I AM CONFUSED AND CONFUDLED.
 * 
 * ??????????????????????????????????????
 * 
 * GOOD LORD I NEED GOOGLE
 */
public class DrivetrainSubsystem extends SubsystemBase {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private final SparkMax leftLeader;
  private final SparkMax leftFollower;
  private final SparkMax rightLeader;
  private final SparkMax rightFollower;

  // Set can timeout. Because this project only sets parameters once on construction, the timeout can be long without blocking robot operation. Code which sets or gets parameters during operation may need a shorter timeout.
  leftLeader.setCANTimeout(250);
  rightLeader.setCANTimeout(250);
  leftFollower.setCANTimeout(250);
  rightFollower.setCANTimeout(250);

  //Config for voltage compensation or smth idfk
  SparkMaxConfig config = new SparkMaxConfig();
  config.voltageCompensation(12);
  config.smartCurrentLimit(Constants.DRIVE_MOTOR_CURRENT_LIMIT);

  public DrivetrainSubsystem() {
    // Talons
    leftLeader = new SparkMax(0, MotorType.kBrushed);
    leftFollower = new SparkMax(1, MotorType.kBrushed);
    rightLeader = new SparkMax(2, MotorType.kBrushed);
    rightFollower = new SparkMax(3, MotorType.kBrushed);
  }

  /*

  FIX THIS LATER (PREFERABLY TOMMAROW SICNE I NEED THIS DONE REALLY FRIGGEN SOON)
   private final DifferentialDrive drive;
   drive = new DifferentialDrive(leftMotors, rightMotors);

   config.follow(leftLeader);
   leftFollower.configure(config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
   config.follow(rightLeader);
   rightFollower.configure(config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);

   config.disableFollowerMode();
   rightLeader.configure(config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);

   config.inverted(true);
   leftLeader.configure(config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);

   */
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}