package frc.robot;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.XboxController;

public class Controller {
    private static XboxController xcont = new XboxController(0);

    public static double getTurn() {
        return xcont.getX(Hand.kLeft);
    }

    public static double getSpeed() {
        return xcont.getTriggerAxis(Hand.kRight) - xcont.getTriggerAxis(Hand.kLeft);
    }
}
