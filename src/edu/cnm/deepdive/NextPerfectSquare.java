package edu.cnm.deepdive;



//  Perfect squares are positive integers which are the product of some integer multiplied by itself.
//  For example, 1=12, 4=22, 9=32, 16=42, etc. Thus, 1,4,9,16,… are perfect squares.
//
//  Your task is to implement a method that takes a long input parameter, and—if the value of that
//  parameter is a perfect square—returns the next perfect square higher than the input value.
//  For example, 225=152, and 256=162, so the next perfect square after 225 is 256.

  public class NextPerfectSquare {

  static long nextPerfectSquare(long N) {
    long nextN = (long)Math.floor(Math.sqrt(N)) + 1;
    return nextN * nextN;
  }

  public static void main(String args[]) {
    long n = 9;
    System.out.println (nextPerfectSquare(n));
  }
}



