package org.usfirst.ftc.exampleteam.yourcodehere;

import com.qualcomm.ftccommon.DbgLog;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.IrSeekerSensor;
import com.qualcomm.robotcore.hardware.LegacyModule;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * A skeletal example of a do-nothing first OpMode. Go ahead and change this code
 * to suit your needs, or create sibling OpModes adjacent to this one in the same
 * Java package.
 */
public class MyFirstOpMode extends OpMode {

    final static double MOTOR_POWER = 50; // Higher values will cause the robot to move faster

    // final static double HOLD_IR_SIGNAL_STRENGTH = 0.20; // Higher values will cause the robot to follow closer

    LegacyModule legacyOne;
    LegacyModule motorBack;
    DcMotor motorBackArticulator;
    DcMotor motorFrontArticulator;
    DcMotor motorLeft;
    Servo armSpinny;

    @Override
    public void init() {
//        legacyOne=hardwareMap.legacyModule.get(Legacy_module_2);
//        motorDrive = hardwareMap.dcMotor.g
        armSpinny = hardwareMap.servo.get("left_zipline");
        motorBackArticulator = hardwareMap.dcMotor.get("back_articulator");
        motorFrontArticulator = hardwareMap.dcMotor.get("f_a");

    }

    @Override
    public void start() {

//        motorLeft.setDirection(DcMotor.Direction.REVERSE);
    }

    @Override
    public void loop() {

      // full power
        motorBackArticulator.setPower(MOTOR_POWER);
        motorFrontArticulator.setPower(MOTOR_POWER);
//                motorBack.setPower
//                motorRight.setPower(MOTOR_POWER);
//                motorLeft.setPower(MOTOR_POWER);
    }
}

