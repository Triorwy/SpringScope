package com.spring.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author:liuzhao
 * @phone:132-0145-6372
 * @date:2020/5/24 下午1:37
 */

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Lazy // 延迟加载
public class Notepad2 {

  public Notepad2() {
    super();
    System.out.println("Notepad2的无参构造函数" + this.toString());
  }


  /**
   * bean对象的初始化和销毁
   * 注解方法
   */

  @PostConstruct
  public void init(){
    System.out.println("Notepad初始化方法");
  }

  @PreDestroy
  public void destroy(){
    System.out.println("Notepad销毁方法");
  }


}
