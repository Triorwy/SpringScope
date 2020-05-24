package com.spring.demo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {

  /**
   * Rigorous Test :-)
   */
  @Test
  public void shouldAnswerWithTrue() {
      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
          "applicationContext.xml");
    Notepad notepad1 = (Notepad)context.getBean("notepad");
    Notepad notepad2 = (Notepad)context.getBean("notepad");


  }
}
