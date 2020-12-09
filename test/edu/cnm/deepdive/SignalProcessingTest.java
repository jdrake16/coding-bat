package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

class SignalProcessingTest {

  private static Object[][] signalProcessing() {
    return new Object[][]{
        //n[]                offset = 1  scale = 5       expected[] 6, 11, ect..
        {new int[]{1, 2, 3, 4, 5}, 1, 5, new int[]{6, 11, 16, 21, 26}},
        //{new int[]{100, 90, 80, 80, 80, 20}, new int[]{10, 50, 80, 90}, new int[]{7, 6, 3, 2}},
    };

  }

  @ParameterizedTest
  @MethodSource
  void signalProcessing(int[] n, int offset, int scale,int[] expected) {
    int[] actual = SignalProcessing.signalProcessing(n, offset, scale );
    assertArrayEquals(expected, actual);
  }
}