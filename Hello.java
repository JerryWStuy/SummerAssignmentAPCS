
  public class Hello {

      public static void printHello(String name){
          String result;
          result = returnHello(name);
          System.out.println(result);
      }

      public static String returnHello(String name){
          String result;
          return "Hello " + name + "!";
      }

      public static void main(String[] args){
          String s;
          printHello("Thomas");
          s = returnHello("Jane");
          System.out.println(s);
      }

  }