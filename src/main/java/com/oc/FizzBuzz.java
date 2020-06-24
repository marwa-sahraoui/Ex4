package com.oc;

public class FizzBuzz {

    public String FBuzz(int number) {

        if(number % 3 == 0 && number % 5 == 0) {
            return "fizzBuzz"  ;
        } else if( number % 3 == 0) {
            return "fizz";
        } else if (number % 5 == 0) {
            return "buzz";
        }
        return String.valueOf(number);
    }
}
