package com.mitinyova.things;

public class Tangle {
   private String color;
   public Tangle(String color) {
	   this.color = color;
   }
   public Tangle() {
	   this.color = "Yellow";
   }
   public String toString() {
	   return color+" tangle";
   }
}
