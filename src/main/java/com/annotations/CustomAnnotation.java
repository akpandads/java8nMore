package com.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

public @interface CustomAnnotation {
    public enum Prioity {LOW,MEDIUM,HIGH};
    public enum Status{STARTED,NOT_STARTED};
    String author() default "Ankit";
    Prioity prriority() default Prioity.LOW;
    Status status() default Status.NOT_STARTED;

}
