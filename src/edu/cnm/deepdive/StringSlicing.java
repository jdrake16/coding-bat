package edu.cnm.deepdive;

//  Given a String, return a specified slice of the String. Rather than a simple substring
//      (e.g. the return value of String.substring(int beginIndex, int endIndex)),
//  a String slice contains the characters starting from beginIndex, up to (but not including)
//  endIndex, skipping characters according to a step or stride parameter value (stride).
//
//  For example, a slice of "algorithm", with a beginIndex value of 1, an endIndex of 8,
//  and a stride of 2, would return "loih"—that is, the sequence of characters starting at
//  position 1, advancing by 2 positions in each step
//      (thus, including characters from positions 3, 5, etc.), including each such character up to,
//  but not including position 8.

public class StringSlicing {

  public static String returnSlice(String word, int BeginningIndex, int EndIndex, int stride) {

    String slice = word.substring(BeginningIndex, EndIndex);
    //(StringBuilder) to allow modification of string.
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < slice.length(); i = i+ stride) {
      result.append(slice.charAt(i));
      // append = add to.
    }
    return result.toString();
  }



}
