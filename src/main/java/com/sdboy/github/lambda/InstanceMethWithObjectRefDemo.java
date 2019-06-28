package com.sdboy.github.lambda;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class InstanceMethWithObjectRefDemo
 * @date 2019/6/27 17:34
 * @Copyright
 */
public class InstanceMethWithObjectRefDemo {
  static <T> int counter(T[] vals, CountFunc<T> f, T v) {
    int count = 0;
    for(int i = 0; i < vals.length; i++) {
      if(f.func(vals[i], v)) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int count;
    HighTemp[] weekDayHights = {new HighTemp(89), new HighTemp(82), new HighTemp(90),
        new HighTemp(89), new HighTemp(89), new HighTemp(91), new HighTemp(84), new HighTemp(83),};
    count = counter(weekDayHights, HighTemp::sameTemp, new HighTemp(89));
    System.out.println(count + " days had a high of 89");
    HighTemp[] weekDayHights2 = {new HighTemp(32), new HighTemp(12), new HighTemp(24),
        new HighTemp(19), new HighTemp(18), new HighTemp(12), new HighTemp(-1), new HighTemp(13),};
    count = counter(weekDayHights2, HighTemp::sameTemp, new HighTemp(12));
    System.out.println(count + " days had a high of 12");

    count = counter(weekDayHights, HighTemp::lessThanTemp, new HighTemp(89));
    System.out.println(count + " days had high less than 89");
    count = counter(weekDayHights2, HighTemp::lessThanTemp, new HighTemp(19));
    System.out.println(count + " days had high less than 19");
  }
}

class HighTemp {
  private int hTemp;
  HighTemp(int ht) {
    hTemp = ht;
  }

  boolean sameTemp(HighTemp ht2) {
    return hTemp == ht2.hTemp;
  }

  boolean lessThanTemp(HighTemp ht2) {
    return hTemp < ht2.hTemp;
  }
}
