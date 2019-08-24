package com.lamdas;

import com.lambdas.classes.ConcreteClass;
import com.lambdas.interfaces.CustomFunctionalInterface;
import com.lambdas.interfaces.Functional;
import com.lambdas.interfaces.IntPred;
import org.junit.Test;

import javax.swing.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class LamdaTestRunner {

    @Test
    public void testCustomLambda(){
        CustomFunctionalInterface customFunctionalInterface = parameter -> parameter + "lambda value";
        String result = new ConcreteClass().add("concrete value",customFunctionalInterface);
        System.out.println(result);
    }

    @Test
    public void testWithoutFunctionalInterface(){
        Function<String,String> fn = parameter -> parameter + " lamda value without Interface";
        String result = new ConcreteClass().addWithoutFunctionalInterface("concrete value and ",fn);
        System.out.println(result);
    }

    @Test
    public void testFunctionalApply(){
        Functional <Integer,Integer> fun = x -> x+1;
        System.out.println(fun.apply(2));
        Functional<Integer,Boolean> fun2 =  x -> x==1;
        System.out.println(fun2.apply(2));
        //Below line will not work, because the parameter list is different
        //Functional<Integer,Integer> fun3 = (x,y) -> x+1;
    }

    @Test
    public void testRandom(){
        Runnable helloWorld = () -> System.out.println("hello world");
        helloWorld.run();

        IntPred intPred = x ->x>5;
        System.out.println(new ConcreteClass().check(intPred,6));
        Predicate<Integer> p = x->x>5;
        System.out.println(new ConcreteClass().check(p,7));
    }
}
