package com.mitinyova.myjdbc;

import com.mitinyova.animals.Cat;

public interface CatsDAO {
	
  void addCat(Cat cat);
  
  Cat getCatById(int id);
}
