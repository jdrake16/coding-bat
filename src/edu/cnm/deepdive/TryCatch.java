package edu.cnm.deepdive;

import java.util.Arrays;

public class TryCatch {

  public static void main(String[] args) {
//    my attempt
//    int[] array = {1,2,3};

    int[] array = new int[3];

    try {

      for (int i = 0; i < 4; i++) {
        array[i] = i;
      }

    } catch (Exception e) {
      System.out.println("PROBLEM!");

    }
    System.out.println(Arrays.toString(array));

  }

}
