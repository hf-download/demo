package org.hf;

public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {
//    System.out.println(Main.class.getProtectionDomain().getCodeSource().getLocation());
    // file:/D:/eclipse-3.5.2/workspace/zzzdemo/bin/
    
    Main main = new Main();
    main.test();
  }

  public void test() {
    ClassLoader myclassLoader = new MyClassLoader();
    try {
      Class<?> c = myclassLoader.loadClass("org.hf.PolicyImpl");
      Policy policy = (Policy) c.newInstance();
      policy.getInsured();
      System.out.println(c);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
