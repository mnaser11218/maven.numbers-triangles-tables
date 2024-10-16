package com.github.curriculeon;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String result="";
//        for(int i=0;i<numberOfRows;i++){
//                if(i > 1){
//                    result+="\n";
//                }
//            for(int j=0; j<i; j++){
//                result += "*";
//            }
//        }
        for(int i =0; i<numberOfRows-1; i++){
            result += getRow(i+1);
            result += "\n";
        }

        return result;
    }

    public static String getRow(int numberOfStars) {
        String row = "";
        for(int i=0; i<numberOfStars;i++){
            row+= "*";
        }

        return row;
    }

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
