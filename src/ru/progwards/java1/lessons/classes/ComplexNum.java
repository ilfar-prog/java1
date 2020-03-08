package ru.progwards.java1.lessons.classes;

public class ComplexNum {

    // properties
    int a;
    int b;



    // Constructor
    public ComplexNum(int a, int b){
        this.a = a;
        this.b = b;

    }

    // methods

//    public int getReal(){
//        return a;
//    }
//
//    public int getImag(){
//        return b;
//    }

    public String toString(){
        String as = Integer.toString(a);
        String bs = Integer.toString(b);
        return as + "+" + bs + "i";
    }

    public ComplexNum add(ComplexNum num){
//        a = this.a + num.getReal();
//        b = this.b + num.getImag();
        a = this.a + num.a;
        b = this.b + num.b;
        return this;
    }

    public ComplexNum sub(ComplexNum num){
//        a = this.a - num.getReal();
//        b = this.b - num.getImag();
        a = this.a - num.a;
        b = this.b - num.b;
        return this;
    }

    public ComplexNum mul(ComplexNum num){
//        (a + bi) * (c + di) = (a*c - b*d) + (b*c + a*d)i
//        a = this.a * num.getReal() - this.b * num.getImag();
//        b = this.b * num.getReal() + this.a * num.getImag();
        int temp_a = a;
        int temp_b = b;

        a = temp_a * num.a - temp_b * num.b;
        b = temp_b * num.a + temp_a * num.b;
        return this;
    }

    public ComplexNum div(ComplexNum num){
//        (a + bi) / (c + di) = (a*c + b*d)/(c*c+d*d) + ((b*c - a*d)/(c*c+d*d))i
//        a = (this.a * num.getReal() + this.b * num.getImag()) / (num.getReal() * num.getReal() + num.getImag() * num.getImag());
//        b = (this.b * num.getReal() - this.a * num.getImag()) / (num.getReal() * num.getReal() + num.getImag() * num.getImag());
        int temp_a = a;
        int temp_b = b;
        a = (temp_a * num.a + temp_b * num.b) / (num.a * num.a + num.b * num.b);
        b = (temp_b * num.a - temp_a * num.b) / (num.a * num.a + num.b * num.b);
        return this;
    }
}
