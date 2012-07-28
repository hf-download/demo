package org.hf;

public class MyClassLoader extends ClassLoader {

  protected synchronized Class<?> loadClass(String name, boolean resolve)
  throws ClassNotFoundException {
    System.out.println(name);
    return super.loadClass(name, resolve);
  }
}
