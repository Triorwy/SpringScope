package com.spring.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author:liuzhao
 * @phone:132-0145-6372
 * @date:2020/5/24 下午3:09
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class NotepadTestAutowired2 {

//  @Autowired
//  private Notepad2 notepad1;
//
//  @Autowired
//  private Notepad2 notepad2;

  /**
   * scope=singleton
   * 1.无论我们是否主动获取或注入bean对象，Spring上下文一加载就会创建对象
   * 2.无论获取多少次，拿到的都是同一个对象
   *
   * scope=prototype
   *    * 1.Spring上下文加载的时候不会创建bean对象，只有在获取bean的时候才会创建bean对象
   *    * 2.每次获取都会拿到不同的bean对象
   */
  @Test
  public void test(){
    //System.out.println(notepad1 == notepad2);

  }

}
