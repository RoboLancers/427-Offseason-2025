package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.spark.SparkLowLevel.MoterType;

public class DriveTrainSubsystem extends SubsystemBase {

  leftLeader = new SparkMax(LEFT_LEADER_ID, MoterType.kBrushed);
  leftFollower = new SparkMax(LEFT_FOLLOWER_ID, MoterType.kBrushed);
  rightLeader = new SparkMax(RIGHT_LEADER_ID, MoterType.kBrushed);
  rightFollower = new SparkMax(RIGHT_FOLLOWER_ID, MoterType.kBrushed);

  private final SparkMax leftLeader;
  private final SparkMax leftFollower;
  private final SparkMax rightLeader;
  private final SparkMax rightFollower;

  /** Creates a new DriveTrainSubsystem. */
  public DriveTrainSubsystem() {}



  /**
   * DriveTrain command factory method.
   *
   * @return a command
   */
  public Command DriveTrainMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }

  /**
   * An DriveTrain method querying a boolean state of the subsystem (for DriveTrain, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean DriveTrainCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
