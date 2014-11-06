package org.adligo.tests4j_gen.class_lists;

import java.util.List;

public class BaseClassNameList {
  public static void add(List<String> names, Class<?> c) {
    names.add(c.getName());
  }
  public static void addNames(List<String> names, List<Class<?>> classes) {
    for (Class<?> c: classes ) {
      add(names, c);
    }
  }
}
