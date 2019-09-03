package com.annotations.impl;

import com.annotations.CustomAnnotation;

public class CustomAnnotationExample {

    @CustomAnnotation(prriority = CustomAnnotation.Prioity.HIGH, status = CustomAnnotation.Status.STARTED)
    public void doNothing(){

    }
}
