package com.github.curriculeon;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String result = "";

        while(start < stop){
            if(start %2==0){
                result += start;
            }
            start++;
        }

        return result;
    }


    public static String getOddNumbers(int start, int stop) {
        String result = "";

        while(start < stop){
            if(start %2==1){
                result += start;
            }
            start++;
        }

        return result;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String result = "";

        while(start < stop){
                result += start * start;

            start+= step;
        }

        return result;
    }

    public static String getRange(int start) {
        String result = "";
 for(int i=0 ; i< start; i++){
     result += i;
 }

        return result;
    }

    public static String getRange(int start, int stop) {
        String result = "";
        for(int i=start ; i< stop; i++){
            result += i;
        }

        return result;
    }


    public static String getRange(int start, int stop, int step) {
        String result = "";
        for(int i=start ; i< stop; i+= step){
            result += i;
        }

        return result;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {

        String result = "";
        for(int i=start ; i< stop; i+= step){
            result += (int) Math.pow(i, exponent);
        }

        return result;
    }
}
