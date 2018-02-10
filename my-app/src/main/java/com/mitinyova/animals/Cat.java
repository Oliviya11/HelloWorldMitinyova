package com.mitinyova.animals;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import com.mitinyova.people.Person;
import com.mitinyova.things.Collar;
import com.mitinyova.things.Tangle;

public class Cat {
  private String name;
  private Collection<Mouse> snack;
  private Tangle tangle;
  private Collar collar;
  
  public Cat(String name) {
	 this.name = name;
  }
  
  public Cat() {
	 name = "Murka";
  }
  
  public Cat(Tangle tangle) {
	  this.tangle = tangle;
	  name = "Murka";
  }
  public void mew() {
	  System.out.println(name+" said mew!");
  }

  public void setName(String name) {
	  this.name = name;
  }
  
  @Autowired
  public void setSnack(Collection<Mouse> snack) {
	  this.snack = snack;
  }
  
  public Tangle getTangle() {
	  return tangle;
  }
  @Autowired(required = false)
  public void setCollar(Collar collar) {
	  this.collar = collar;
  }
  public void setTangle(Tangle tangle) {
	  this.tangle = tangle;
  }
  
  public void eatSnack() {
	  for (Mouse mouse:snack) {
		  System.out.println("Mouse � "+mouse.getId()+" has been recently eaten by "+this.name+"!");
	  }
  }
  
  public void play() {
	  System.out.println(name + " play with "+tangle);
  }
  
  public String toString() {
	  return name;
  }
}
