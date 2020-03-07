package ru.progwards.java1.lessons.classes;

public class ComplexNum {

    // properties
    private int a;
    private int b;



    // Constructor
    public ComplexNum(int a, int b){
        this.a = a;
        this.b = b;

    }

    // methods

    public int getReal(){
        return a;
    }

    public int getImag(){
        return b;
    }

    public String toString(){
        String as = Integer.toString(a);
        String bs = Integer.toString(b);
        return as + "+" + bs + "i";
    }

    public ComplexNum add(ComplexNum num){
        a = this.a + num.getReal();
        b = this.b + num.getImag();
        return this;
    }

    public ComplexNum sub(ComplexNum num){
        a = this.a - num.getReal();
        b = this.b - num.getImag();
        return this;
    }

    public ComplexNum mul(ComplexNum num){
        a = this.a * num.getReal() - this.b * num.getImag();
        b = this.b * num.getReal() + this.a * num.getImag();
        return this;
    }

    public ComplexNum div(ComplexNum num){
        a = (this.a * num.getReal() + this.b * num.getImag()) / (num.getReal() * num.getReal() + num.getImag() * num.getImag());
        b = (this.b * num.getReal() - this.a * num.getImag()) / (num.getReal() * num.getReal() + num.getImag() * num.getImag());
        return this;
    }
}
