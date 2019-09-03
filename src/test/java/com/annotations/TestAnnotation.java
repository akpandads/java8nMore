package com.annotations;

import com.annotations.impl.CustomAnnotationReflection;
import org.junit.Assert;
import org.junit.Test;

public class TestAnnotation {
    @Test
    public void testCustomAnnotationValue(){
        CustomAnnotationReflection.getCustomAnnotationValue();
    }
}
