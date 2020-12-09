package edu.cnm.deepdive;

public class DataArray {




  void process(int[] data) {
    int[] myData = {1, 3, 5, 7, 6, 4, 2};
    for (int i = 0, j = data.length - 1; i < j; i++, j--) {
      int temp = data[i];
      data[i] = data[j];
      data[j] = temp;
    }
  }

  }



