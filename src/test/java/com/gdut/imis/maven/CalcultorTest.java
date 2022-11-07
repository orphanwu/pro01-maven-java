package com.gdut.imis.maven;

import org.junit.Test;

public class CalcultorTest {
    @Test
    public void testCal() throws Exception {
        Calcultor calcultor = new Calcultor();
        int i = calcultor.add(3,5);
        int j = 8;
        if(i != j){
            throw new Exception();
        }
        System.out.println("hello");
        System.out.println("hello git");
        System.out.println("hello git1");
        System.out.println("hello git2");
        System.out.println("hello git3");
        System.out.println("master test");
        System.out.println("hot-fix test");
        System.out.println("push test");
        System.out.println("push test1");
    }
}