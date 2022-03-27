package com.company;

public class Main
{
    public static void main(String[] args) {
        int[] arr={12,96,32,96,55,122};
        int value=96;
        boolean isTrue = false;

        for (int i : arr) {
            if (i == value) {
                isTrue = true;
                break;
            }
        }

        if(isTrue)
            System.out.println("zangvacum ka ayd tivy");
        else
            System.out.println("zangvacum chka ayd tivy");
    }
}