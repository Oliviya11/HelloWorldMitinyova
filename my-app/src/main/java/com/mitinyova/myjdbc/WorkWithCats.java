package com.mitinyova.myjdbc;

import org.springframework.beans.factory.annotation.Autowired;

import com.mitinyova.animals.Cat;

public class WorkWithCats {
  @Autowired
  private CatsDAO catsDAO;
  
  public void saveCatToDb(Cat cat) {
	  if ((cat!=null)&&(cat.getName()!=null)&&(!"".equals(cat.getName()))&&(cat.getAge()>0)){
		  catsDAO.addCat(cat);
		  System.out.println("Cat have been saved "+cat);
	   }
  }
  
  public Cat getCatById(int id) {
	  return catsDAO.getCatById(id);
  }
}
