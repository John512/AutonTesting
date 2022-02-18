// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.kinematics.DifferentialDriveKinematics;
import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj.Joystick;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static final Joystick driverController = new Joystick(0);

    public static final class AutonDrivetrain{

        public static final double ks = 0.24975; //Volts
        public static final double kv = 4.3066; //Volt seconds per meter
        public static final double ka = 0.29032; //Volt seconds squared per meter

        public static final double kP = 4.5584; //Proportional Gain

        public static final double robotWidth = Units.inchesToMeters(25.5);
        public static final DifferentialDriveKinematics driveKinematics = new DifferentialDriveKinematics(robotWidth);

        public static final double maxVel = 1.6; //Meters per second (Estimated Value)
        public static final double maxAccel = 25; //Meters per second squared (Estimated Value)

        //Constants for using the ramsete controller
        public static final double ramseteB = 2;
        public static final double ramseteZeta = 0.7;

    }

    public static final class Drivetrain{

        public static final int leftLeaderPort = 1;
        public static final int leftFollowerAPort = 2;
        public static final int leftFollowerBPort = 3;
        public static final int rightLeaderPort = 4;
        public static final int rightFollowerAPort = 5;
        public static final int rightFollowerBPort = 6;

        public static final int[] shifterPorts = {0, 1};

        public static final double deadband = 0.07;

    }

}
