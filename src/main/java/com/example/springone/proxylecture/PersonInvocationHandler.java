package com.example.springone.proxylecture;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonInvocationHandler implements InvocationHandler {
    private Person person;
    public PersonInvocationHandler(Person person) {
        this.person = person;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        person.;
//        man.introduce("Tanishq");
        System.out.println("HI");
        return null;
    }
}
