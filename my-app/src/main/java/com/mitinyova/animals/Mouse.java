package com.mitinyova.animals;

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
