// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger; 

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot{
  public static final int XboxController = 1; 
  public static final int lenght  = 100;

  private static final AddressableLEDBuffer m_ledBuffer = null;
  private static final AddressableLED m_led = null;
  XboxController m_1controller = new XboxController(1);
   XboxController m_2controller = new XboxController(1);
  AddressableLEDBuffer m_AddressableLEDBuffer = new AddressableLEDBuffer(lenght);
 
  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */

  
    
  public void   clear (){
   

    }
   
  
  
   @Override
  public void robotInit() {}

  @Override
  public void robotPeriodic() {

    // Fill the buffer with a rainbow
    rainbow();
    // Set the LEDs
    m_led.setData(m_ledBuffer);
  
  AddressableLED m_led = new AddressableLED(9);
  
    for (var i = 0; i < m_ledBuffer.getLength(); i++); {
       m_ledBuffer.setRGB(i, 255, 0 , 0 ); 
    // Sets the specified LED to the RGB values for red
    }
    
  
 new AddressableLED(9);
  XboxController m_XboxController = new XboxController(1);
  m_2controller.getXButton();
  CommandXboxController exampleCommandController = new CommandXboxController(1);
  Trigger xButton = exampleCommandController.x();  
  Trigger  xbuttion = new Trigger(xbuttion); 
  

}

  private void rainbow() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'rainbow'");
  }

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {}

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}
