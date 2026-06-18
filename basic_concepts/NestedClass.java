// implementation of simple nested classes

class Outerclass{
  int x = 10;

  class InnerClass{
    int y =4;

    void display(){
      System.out.println("Outer class variable: " + x);
      System.out.println("Inner class variable: " + y);
    }
  }
}
