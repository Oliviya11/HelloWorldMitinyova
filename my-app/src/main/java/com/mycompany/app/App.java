package com.mycompany.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mitinyova.animals.Cat;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
    	Cat catMurka = (Cat) context.getBean("catMurka");
    	catMurka.mew();
    	catMurka.eatSnack();
    	catMurka.play();
    	Cat catMurluk = (Cat) context.getBean("catMurluk");
    	catMurluk.mew();
    	catMurluk.eatSnack();
    	catMurluk.play();
    	Cat catVaska = (Cat) context.getBean("catVaska");
    	catVaska.mew();
    	catVaska.eatSnack();
    	catMurluk.play();
    }
}
