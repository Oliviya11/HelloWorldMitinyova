package com.mitinyova.animals;

import org.aspectj.lang.annotation.*;

@Aspect
public class Dog {
	@Around("execution(* com.mitinyova.animals.Cat.play(..))")
	   public void bark() {
		System.out.println("Dog is barking...");
	   }
}
