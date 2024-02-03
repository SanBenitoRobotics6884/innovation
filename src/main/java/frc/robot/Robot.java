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

  
  AddressableLED m_led = new AddressableLED(0);
  AddressableLEDBuffer m_ledBuffer = new AddressableLEDBuffer(lenght);
  XboxController m_1controller = new XboxController(1);
  XboxController m_1boxController = new XboxController(1); 
  XboxController m_2boxController = new XboxController(2); 
  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
   
  public void clear () {
    for (int i = 1; i < m_ledBuffer.getLength(); i++) {    
      m_ledBuffer.setRGB(i, 122, 0, 0);
     for(var p2 =0;;); 
}    m_ledBuffer.setRGB(lenght, 0, 122, 0);

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
  edu.wpi.first.wpilibj.XboxController x;
  
  for(var p2 =0;; p2++);
    
  
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
   for(int i = 0; i < m_ledBuffer.getLength(); i++) { 
    {m_ledBuffer.setRGB(lenght, lenght, lenght, lenght);} 
      
   };} 
    if (m_1controller.getBackButton()){
        for (int i = -1; 1 > m_ledBuffer.getLength(); i++)
      {m_ledBuffer.setRGB(-lenght, -lenght, -lenght, -lenght);}
      }
   
     
      if (m_1controller.getAButton()){
        for (int i = 100; 1 > m_ledBuffer.getLength(); i++)
      {m_ledBuffer.setRGB(lenght, lenght, lenght, lenght);}
      }
   
if  (m_1controller.getAButton()){
   for(int i = 0; i < m_ledBuffer.getLength(); i++) { 
    {m_ledBuffer.setRGB(lenght, lenght, lenght, lenght);}
    
   };}
  if  (m_ledBuffer.AddressableLEDBuffer()){
   for(int i = 0; i < m_ledBuffer.getLength(); i++) { 
    {m_ledBuffer.setRGB(lenght, lenght, lenght, lenght);}
    
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
