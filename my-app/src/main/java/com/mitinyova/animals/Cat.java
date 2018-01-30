package com.mitinyova.animals;

import java.util.Collection;

public class Cat {
  private String name;
  private Collection<Mouse> snack;
  
  public Cat(String name) {
	 this.name = name;
  }
  
  public Cat () {
	 name = "Murka";
  }
  
  public void mew() {
	  System.out.println(name+" said mew!");
  }

  public void setName(String name) {
	  this.name = name;
  }
  
  public void setSnack(Collection<Mouse> snack) {
	  this.snack = snack;
  }
  
  public void eatSnack() {
	  for (Mouse mouse:snack) {
		  System.out.println("Mouse ¹ "+mouse.getId()+" has been recently eaten by "+this.name+"!");
	  }
  }
}
