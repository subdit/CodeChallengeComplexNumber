package com.codeChallengePartII.complexOperations;

import javax.swing.plaf.SplitPaneUI;
// A complex number is a number that can be expressed in the form a + bi,
// where a and b are real numbers and i is a solution of the of equation x2 =- 1. Because no real number satisfies
// this equation, i is called an imaginary number. For the complex number a + bi,
// a is called the real part, and b is called the imaginary part. To add or subtract 2 complex numbers, just add or subtract the corresponding real and imaginary parts.
// For instance, the sum of 5 + 3i and 4 + 2i is 9 + 5i.
// For another, the sum of 3 + i and -1 + 2i is 2 + 3i.

// Write a class with the name ComplexNumber. The class need two fields (instance variables) with name real and imaginary of typ double.
// it represents the Complex Number
// The class needs to have one constructor, The constructor has parameters real and imaginary of type double, and it needs to initialize the fields.
// Write instance method: =>
// 1. Method name getReal without any parameters, it needs to return the value of real field.
// 2. Method name getImaginary without any params, it needs to return value of the imaginary field
// 3. Method named add with two params real and imaginary of type double, it needs to add parameter to fields. In other words
// it needs to do a complex number and operation
// 4. Method named add with one param of type ComplexNumber. It needs to add the ComplexNumber param to the corresponding instance variables.
// 5. Method named subtract with two params real and imaginary of type double. needs to subtract params from fields,
// in other words it needs to do a complex number and operation.
// 6. Method named subtract with one param of type ComplexNumber. it needs to subtract the other param from this complex number

public class ComplexNumber {
    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(1.0, 1.2);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
    }

    private double real;
    private double imaginary;



    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal(){
        return real;
    }
    public double getImaginary(){
        return imaginary;
    }
    public void add(double real, double imaginary){
       // this.real = this.real+ real;// ;
       // this.imaginary = this.imaginary+imaginary;
        // refactoring the code above
        this.real += real;
        this.imaginary += imaginary;
    }
    // Logic complexNumber
    public void add(ComplexNumber complexNumber){
//        real = real+complexNumber.getReal();
//        imaginary = imaginary + complexNumber.getImaginary();
        // refactoring the code above
        add(complexNumber.real, complexNumber.imaginary );
    }
    public void subtract(double real, double imaginary){
//        this.real = this.real-real;
//        this.imaginary = this.imaginary - imaginary;
        // refactoring the code above
        this.real -= real;
        this.imaginary -= imaginary;
    }
    // Logic complexNumber
    public void subtract(ComplexNumber complexNumber){
        real = (real-complexNumber.getReal());
        imaginary = (imaginary-complexNumber.getImaginary());
    }

}
