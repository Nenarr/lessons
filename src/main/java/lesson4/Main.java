package lesson4;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args){
        System.out.print("Введите номер задания: ");
        Scanner s = new Scanner(System.in);
        switch (s.nextInt()){
            case 1:
                printThreeWords();
                break;
            case 2:
                checkSumSign();
                break;
            case 3:
                printColor();
                break;
            case 4:
                compareNumbers();
                break;
            case 5:
                System.out.println(checkSum(5,30));
                break;
            case 6:
                isNumberPositive(4);
                break;
            case 7:
                System.out.println(isNumberPositiveBool(-3));
                break;
            case 8:
                printStringNTimes("Some text", 7);
                break;
            case 9:
                System.out.println(isYearLeap(1204));
                break;
            case 10:
                ReverseArray();
                break;
            case 11:
                MakeArray();
                break;
            case 12:
                DoubleArraysValues();
                break;
            case 13:
                TwoDimensionArray();
                break;
            case 14:
                System.out.println(Arrays.toString(CreateArray(5,10)));
                break;
        }

    }

    public static void printThreeWords(){
        // Задание 1
        System.out.print("Orange\nBanana\nApple\n");
    }
    public static void checkSumSign(){
        // Задание 2
        int a, b;
        a = 10;
        b = -15;
        if (a + b >= 0){
            System.out.println("Сумма положительная");
        }
        else{
            System.out.println("Сумма отрицательная");
        }

    }
    public static void printColor(){
        // Зададние 3
        int value;
        value = 150;
        if (value <=0){
            System.out.println("Красный");
        }
        else if (value<=100){
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(){
        // Задание 4
        int a, b;
        a = 1;
        b = 2;
        if (a>= b){
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
    public static boolean checkSum(int a, int b){
        if (a+b>= 10 && a+b <= 20){
            return true;
        }
        else {
            return false;
        }
    }
    public static void isNumberPositive(int a){
        if (a >=0){
            System.out.println("Число "+ a +" положительное");

        }
        else {
            System.out.println("Число "+ a +" отрицительное");
        }
    }
    public static boolean isNumberPositiveBool(int a){
        return a >= 0;
    }
    public static void printStringNTimes(String a, int n){
        while (n> 0){
            System.out.println(a);
            n--;
        }
    }
    public static boolean isYearLeap(int year){
        if (year % 4 == 0 && year % 100 != 0){
            return true;
        }
        else if(year % 400 == 0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void ReverseArray(){
        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                arr[i] = 1;
            }
            else{
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void MakeArray(){
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void DoubleArraysValues(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6){
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void TwoDimensionArray(){

        int[][] table = new int[11][11];
        int idTable = table.length - 1;


        for (int i = idTable; i >= 0; i--) {
            table[i][i] = 1;
        }
        for (int i = idTable; i >= 0; i--) {
            table[i][idTable - i] = 1;
        }

        for (int i = 0; i < 11; i++){
            for (int j = 0; j < 11; j++){
                System.out.print(table[i][j] +" ");
            }
            System.out.println();
        }

    }
    public static int[] CreateArray(int len, int initialValue){
        int[] arr = new int[len];
            for (int i = 0; i < len; i++){
                arr[i] = initialValue;
            }
        return arr;
    }
}
