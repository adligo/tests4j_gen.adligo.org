package org.adligo.tests4j_gen.console;

public class ConsoleGenUtils {
  public static String toConstantJavaText(Class<?> c) {
    String orig = c.getSimpleName();
    
    StringBuilder sb = new StringBuilder();
    char [] chars = orig.toCharArray();
    boolean lastUpper = true;
    for (int i = 0; i < chars.length; i++) {
      char ch = chars[i];
      if (Character.isUpperCase(ch)) {
        if (!lastUpper) {
          sb.append("_");
        }
        sb.append(ch);
        lastUpper = true;
      } else {
        lastUpper = false;
        sb.append(Character.toUpperCase(ch));
      }
    }
    return sb.toString();
  }
}
