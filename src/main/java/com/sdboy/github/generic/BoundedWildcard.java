package com.sdboy.github.generic;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class BoundedWildcard
 * @date 2019/7/12 18:21
 * @Copyright
 */
public class BoundedWildcard {
  static void showXY(Coords<?> c) {
    System.out.println("X Y Coordinates: ");
    for(int i = 0; i < c.coords.length; i++) {
      System.out.println(c.coords[i].x + " " + c.coords[i].y);
    }
    System.out.println();
  }

  static void showXYZ(Coords<? extends ThreeD> c) {
    System.out.print("X Y Z Coordinates: ");
    for(int i = 0; i < c.coords.length; i++) {
      System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
    }
    System.out.println();
  }

  static void showAll(Coords<? extends FourD> c) {
    System.out.print("X Y Z T Coordinates: ");
    for(int i = 0; i < c.coords.length; i++) {
      System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " " + c.coords[i].t);
    }
    System.out.println();
  }

  public static void main(String[] args) {
    TwoD td[] = {
        new TwoD(0, 0),
        new TwoD(7, 9),
        new TwoD(18, 14),
        new TwoD(-1, -23),
    };
    Coords<TwoD> tdlocs = new Coords<TwoD>(td);
    showXY(tdlocs);

    FourD fd[] = {
        new FourD(0, 0, 3, 4),
        new FourD(7, 9, 10, 11),
        new FourD(18, 14, 15, 16),
        new FourD(-1, -23, 29, 45),
    };
    Coords<FourD> fdlocs = new Coords<>(fd);
    showXYZ(fdlocs);
    showAll(fdlocs);
    showXY(fdlocs);
  }
}
