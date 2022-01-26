package com.company;

import java.text.CompactNumberFormat;

public class Complex {
    private double x;
    private double y;

    public Complex(double r, double i){
        x=r;
        y=i;
    }
    public Complex(double r){
        this(r,0.0);
    }
    public String toString(){
        String s=x+"+"+y+"i";
        return s;
    }
    public double abs(){
        double a=Math.pow(x,2);
        double b=Math.pow(y,2);
        return Math.sqrt(a+b);
    }
    public Complex add(Complex other){
        double a=x+other.x;
        double b=y+other.y;
        Complex c= new Complex(a,b);
        return c;
    }
    public Complex add(double s){
        double a=x+s;
        double b=y;
        Complex c= new Complex(a,b);
        return c;
    }
    public Complex multiply(Complex other){
        double a=x*other.x-y+other.y;
        double b=x*other.y+y*other.x;
        Complex c= new Complex(a,b);
        return c;
    }
    //multiply(double s)
    public static void main(String[] args) {
        Complex s= new Complex(3.0,4.0);
        Complex t= new Complex(5.0,8.0);
        Complex c1= new Complex(7.0,9.0);
        Complex c2= new Complex(-9.0,8.0);
        Complex c3= new Complex(12.0,-8.0);
        Complex c4= new Complex(13.0,17.0);
        System.out.println(s.abs());
        System.out.println(t.abs());
        System.out.println(s.multiply(t));
        System.out.println(c1.multiply(c2));
        System.out.println(c3.multiply(c4));
        System.out.println(c3.add(c4));
        System.out.println(t.add(s));
        System.out.println(c2.add(c1));
        System.out.println(c4.add(2.0));
    }
}
