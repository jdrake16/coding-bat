package edu.cnm.deepdive;

public class Practice {


  int sumMultiples(int limitNum, int div1, int div2) {

    // start at zero
    int sum = 0;

    // adding multiples of div1 stop at limitNum
    for (int i = div1; i < limitNum; i = i + div1) {
      sum = i + sum;
    }

    // adding multiples of div2 stop at limitNum
    for (int i = div2; i < limitNum; i = i + div2) {
      sum = i + sum;
    }

    // returning the sum of div1 and div2
    return sum;
  }

}
