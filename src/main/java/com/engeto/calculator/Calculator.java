package com.engeto.calculator;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Calculator {

    public Calculator() {
    }

    public long add(int a, int b){
        return a+b;
    }
    public long subtract(int a, int b){
        return a-b;
    }
    public long multiply(int a, int b){
        return a*b;
    }
    public double divide(int a, int b){
        if(b==0){
            throw new ArithmeticException();
        }
        return (double) a/b;
    }
    public double squareRoot(int a){
        if(a<0) {
            throw new ArithmeticException();
        }
        return (double) sqrt(a);
    }
    public double square(int a) {
        return (double) pow(a,2);
    }
    public double areaOfCircle(int a){
        if (a<0) {
            throw new ArithmeticException();
        }
        return (double) (3.141593 * (pow(a,2)));
    }

}
