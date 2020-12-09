package edu.cnm.deepdive;

public class SignalProcessing {

//  In digital signal processing (e.g. applying some effect to an audio, video or other data stream),
//  we perform mathematical operations on the values in an array or stream of data points.
//  We might do this in-place (modifying the values in the original array directly)
//  or out-of-place (not modifying the original array, but creating and returning a new array
//      containing the modified values).
//
//  For this problem, you’ll implement a method that takes an int[] as a parameter, performs a
//  specified simple out-of-place transformation operation—e.g. shifting all of the values
//  up or down by some specified offset amount, or multiplying the values by a specified
//  scaling factor—and returns an int[] with the resulting values.


  static int[] signalProcessing(int[] n, int offset, int scale) {

    int[] processed = new int[n.length];
    //processed = 0!
    for(int i = 0; i < n.length; i++) {
      processed[i] = n[i] * scale + offset;
    }



    return processed;
  }

}
