package com.spring.demo;

/**
 * @author:liuzhao
 * @phone:132-0145-6372
 * @date:2020/5/24 下午1:37
 */
public class Notepad {

  public Notepad() {
    super();
    System.out.println("Notepad的无参构造函数" + this.toString());
  }

  /**
   * bean对象的初始化和销毁
   */

  public void init(){
    System.out.println("Notepad初始化方法");
  }

  public void destory(){
    System.out.println("Notepad销毁方法");
  }
}
