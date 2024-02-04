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
import edu.wpi.first.wpilibj.simulation.XboxControllerSim;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger; 

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot{ 
  public static final int lenght  = 100;
  private static final AddressableLED m_AddressableLED = null;
 XboxController m_1controller = new XboxController(0);
  
  AddressableLED m_led = new AddressableLED(0);
  AddressableLEDBuffer m_ledBuffer = new AddressableLEDBuffer(lenght);
  XboxController m_1boxController = new XboxController(1); 
  XboxController m_2boxController = new XboxController(2); 
  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   * @return 
   */
   public int player1pos = 1; 
  public int player2pos = 2; 
   public void clear () {
    m_ledBuffer.setRGB(lenght, 255, 0, 0); 
    for (int player1pos =1;  player1pos < m_ledBuffer.getLength(); player1pos++) {    
    for (int player2pos =2;  player2pos < m_ledBuffer.getLength(); player2pos++){
   m_AddressableLED.setData (m_ledBuffer); 
      for (var i = 0; i < m_ledBuffer.getLength(); i++) {
        // Sets the specified LED to the RGB values for red
        m_ledBuffer.setRGB(i, 255, 0, 0);
     }
     
     m_led.setData(m_ledBuffer);

    }
      
    }   

}
   
    
  
  
  
  
   



  @Override
  public void robotInit() {
    m_led.start();
  }

  @Override
  public void robotPeriodic() {

    // Fill the buffer with a rainbow
    rainbow();
    // Set the LEDs
    m_led.setData(m_ledBuffer);
  
  AddressableLED m_led = new AddressableLED(9);
  
    
    
  

 
  
  
  CommandXboxController exampleCommandController = new CommandXboxController(1);
Trigger xButton = exampleCommandController.x();  
  Trigger  xbuttion = new Trigger(xButton); 
  

 
    
  
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
  public void teleopPeriodic(){
  if  (m_1controller.getAButton()){
   for(int i = 100; i < m_ledBuffer.getLength(); i++) { 
    {m_ledBuffer.setRGB(lenght, lenght, lenght, lenght);} 
      
   };} 
    XboxController m_2controller;
    if (m_1controller.getBackButton()){
        for (int i = -1; i > m_ledBuffer.getLength(); i++)
      {m_ledBuffer.setRGB(lenght, lenght, lenght, lenght);}
      }
   if  (m_1controller.getAButtonReleased()){
   for(int i = -100; i < m_ledBuffer.getLength(); i++) { 
    {m_ledBuffer.setRGB(-lenght, -lenght, -lenght, -lenght);}
   };}
    
      }
   

  
    
   
  

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
