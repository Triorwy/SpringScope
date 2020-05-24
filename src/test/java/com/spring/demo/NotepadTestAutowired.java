package com.spring.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author:liuzhao
 * @phone:132-0145-6372
 * @date:2020/5/24 下午3:09
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class NotepadTestAutowired {

//  @Autowired
//  private Notepad notepad1;
//
//  @Autowired
//  private Notepad notepad2;

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
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "applicationContext.xml");
    Notepad notepad1 = (Notepad)context.getBean("notepad");

    //主动调用销毁方法
    context.destroy();
  }

}
