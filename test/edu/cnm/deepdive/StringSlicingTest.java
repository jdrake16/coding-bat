package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class StringSlicingTest {

  @ParameterizedTest                       //numLinesToSkip (skips 1st line in csv)
  @CsvFileSource(resources = "slice.csv", numLinesToSkip = 1)
  void returnSlice(String word, int BeginningIndex, int EndIndex, int stride,String expected) {
    String actual = StringSlicing.returnSlice(word, BeginningIndex, EndIndex, stride);
                    //Class.Method(parameters)
    assertEquals(expected, actual);


  }
}