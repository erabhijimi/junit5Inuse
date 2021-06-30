package com.cosmos.string;

public class StringProgram {
    //1.Reverse a String
    public String reverseString(String str){
        char[] chs =str.toCharArray();
        String rev ="";
        for(int i=chs.length-1;i>=0;i--){
            rev = rev+chs[i];
        }
        return rev;
    }
    //2.Remove all duplicate characters from  a String
    //3.Print Ocurance of each characters of a String
    //4.Print all duplicate characters in a String
    //5.Paranthesis Checker Algo
    //6.Check if a String is repetation of the other string

}
