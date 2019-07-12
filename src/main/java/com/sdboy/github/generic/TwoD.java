package com.sdboy.github.generic;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class TwoD
 * @date 2019/7/12 18:06
 * @Copyright
 */
public class TwoD {
  int x, y;
  TwoD(int a, int b) {
    x = a;
    y = b;
  }
}

class ThreeD extends TwoD {
  int z;
  ThreeD(int a, int b, int c) {
    super(a, b);
    z = c;
  }
}

class FourD extends ThreeD {
  int t;
  FourD(int a, int b, int c, int d) {
    super(a, b, c);
    t = d;
  }
}

class Coords<T extends TwoD> {
  T[] coords;
  Coords(T[] o) {
    coords = o;
  }
}