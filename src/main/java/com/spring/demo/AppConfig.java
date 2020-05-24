package com.spring.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * @author:liuzhao
 * @phone:132-0145-6372
 * @date:2020/5/24 下午3:39
 *
 * 配置类
 */
@Configuration
public class AppConfig {

  @Bean
  @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
  @Lazy
  public Notepad3 notepad3(){
    return new Notepad3();
  }
}
