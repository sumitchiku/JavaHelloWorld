/*
 * package org.classObject;
 * 
 * import java.util.*; import java.lang.*; import java.io.*; public class Check
 * { public static void main (String[] args) throws java.lang.Exception { int
 * digits_needed=0; Scanner in = new Scanner(System.in); int n =
 * Integer.parseInt(in.nextLine()); // write your code here
 * 
 * long array[] = ; for (int i = 1 ; i <= n; i++){ arr[i] = i; }
 * 
 * String lastValue = arr[n];
 * 
 * if(lastValue < 1000){ int numberOf3digit = lastValue - 99; int set1 = 1 * 9 ;
 * int set2 = 2 * 90; int set3 = 3 * numberOf3digit; digits_needed = set1 + set2
 * + set3; } else if( lastValue < 100){ int numberOf2digit = lastValue - 9; int
 * set1 = 1 * 9 ; int set2 = 2 * numberOf2digit; digits_needed = set1 + set2; }
 * else{ digits_needed = lastValue; }
 * 
 * //end of mycode
 * 
 * System.out.println(digits_needed); } }
 * 
 */