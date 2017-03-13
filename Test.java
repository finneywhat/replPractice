package com.guest.epicodus;
import java.util.ArrayList;

public class Test {
  public static void main(String[] args) {

  }

  public static void printMyName() {
    System.out.println("Who am I?");
  }

  public static void test1(String stringInput, int intInput) {
    for (int count = 0; count < intInput; count++) {
      System.out.println(stringInput);
    }
  }

  public int[] test2(int intInput1, int intInput2, int intInput3) {
    int[] intArray = {intInput1, intInput2, intInput3};
    return intArray;
  }

  public ArrayList test3(int intInput1, int intInput2, String stringInput1, String stringInput2) {
    ArrayList awesomeArrayList = new ArrayList();
    awesomeArrayList.add(intInput1);
    awesomeArrayList.add(intInput2);
    awesomeArrayList.add(stringInput1);
    awesomeArrayList.add(stringInput2);
    return awesomeArrayList;
  }

  public boolean isPrime(int inputNumber) {
    boolean prime = true;
    for (int count = 2; count < inputNumber; count += 2) {
      if (inputNumber % count == 0) {
        prime = false;
        return prime;
      }
      if (count == 2) {
        count -= 1;
      }
    }
    return prime;
  }
}
