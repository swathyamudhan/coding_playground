package main.java.com.codingbat.Logic1;

public class InOrderEqual {
  public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
    if (equalOk && (a <= b && b <= c)) {
      return true;
    } else if (a < b && b < c) {
      return true;
    }

    return false;
  }
}
