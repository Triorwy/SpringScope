package com.spring.xml;

/**
 * @author:liuzhao
 * @phone:132-0145-6372
 * @date:2020/5/24 下午4:16
 *
 * 创建静态工厂方法，基于xml方法
 */
public class PersonFactory {

  /**
   * 静态工厂方法
   * @return
   */
  public static Person createPerson(){
    System.out.println("原始静态工厂方法");
    return new Person();
  }

  /**
   * 实例工厂
   */

  public  Person createPerson2(){
    System.out.println("实例静态工厂方法");
    return new Person();
  }
}
