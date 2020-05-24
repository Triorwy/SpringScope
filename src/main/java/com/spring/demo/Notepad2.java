package com.spring.demo;

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
}
