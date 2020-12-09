package edu.cnm.deepdive;

public class KTacToe {

  // K-Tac-Toe
  // Given:
  //   •	An M-by-N matrix (2-dimensional array) called tableau, where each element is either empty
  //   (which you can think of as null) or one of the two values, NOUGHT and CROSS.
  // •	A number of spaces in a row, k, required for a win.

  // Check for a winner in a K-tac-toe game - that is, search for at least k elements in a line
  // (vertically, horizontally, or diagonally), all of which contain NOUGHT, or all of which contain CROSS.


  public static void main(String[] args) {


    int[][] arr = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 } };

    for (int i = 0; i < 2; i++)
      for (int j = 0; j < 2; j++)
        for (int k = 0; k < 2; k++)
          for (int l = 0; l < 2; l++)
        System.out.println("arr[" + i + "][" + j + "][" + k + "][" + l + "] = "
            + arr[i][j]
            + arr[k][l]);
  }
}