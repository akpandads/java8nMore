package com.collectors;

import com.collectors.interfaces.StringInterface;

import java.util.stream.Collectors;

public class MethodReferences {
    public String mapToUpperCase(String inputStr){
        StringInterface stringInterface = String::toUpperCase;
        return stringInterface.apply(inputStr);
    }
}
