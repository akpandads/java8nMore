package com.annotations.impl;

import com.annotations.CustomAnnotation;

import java.lang.reflect.Method;

public class CustomAnnotationReflection {

    public static void getCustomAnnotationValue(){
        Class customAnnotationExample = CustomAnnotationExample.class;
        for(Method method:customAnnotationExample.getDeclaredMethods()){
            CustomAnnotation customAnnotation = method.getAnnotation(CustomAnnotation.class);
            System.out.println("Method name :"+method.getName());
            System.out.println("Author :"+customAnnotation.author());
            System.out.println("Priority :"+customAnnotation.prriority());
            System.out.println("Status :"+customAnnotation.status());
        }
    }
}
