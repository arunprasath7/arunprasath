package com.musical.controller.musicalbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext appobj = new AnnotationConfigApplicationContext();
   System.out.println("qw");
        appobj.scan("com.configuration");
        appobj.refresh();
    }
}  
