package com.lambdas.classes;

import com.lambdas.interfaces.CustomFunctionalInterface;
import com.lambdas.interfaces.IntPred;

import java.util.function.Function;
import java.util.function.Predicate;

public class ConcreteClass {
     public String add(String str, CustomFunctionalInterface customFunctionalInterface){
         return customFunctionalInterface.method(str);
     }

     public String addWithoutFunctionalInterface (String str,Function<String,String> fn){
         return  fn.apply(str);
     }

     public boolean check(Predicate<Integer> predicate,int x){
         return predicate.test(x);
     }
     public boolean check(IntPred intPred,int x){
         return intPred.test(x);
     }
}
