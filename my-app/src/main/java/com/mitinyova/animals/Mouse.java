package com.mitinyova.animals;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Mouse {
  private static int idCounter = 0;
  private int id;
  
  public Mouse() {
	 this.id = ++idCounter; 
  }
  
  public int getId() {
	  return id;
  }
}
