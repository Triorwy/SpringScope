package com.spring.demo;

import com.spring.xml.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author:liuzhao
 * @phone:132-0145-6372
 * @date:2020/5/24 下午4:22
 */
@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration("classpath:applicationContext.xml")
public class PersonFactoryTest {

  @Autowired
  private Person person1;

  @Autowired
  private Person person2;

  @Test
  public void test(){
    System.out.println(person1);
    System.out.println(person2);
  }
}
