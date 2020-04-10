package lesson3;

public class StringsApp {
    String name = "   Jim    ";
    String hello_mesage ="Hello"+name;
    String hello_mesage2 = String.format("Hello, %s",name);
    String trimmed = name.trim();
    boolean hello_found = "Hello Worlds".startsWith("Hello");
    boolean hello_found2 = "Hello".startsWith("hello");
    String[] splited = "Apple Banana Binaple".split(",");
    boolean checked = "Hello".equals("Hello");
    boolean h = "Hello".equalsIgnoreCase("HELLO");
    String sub = "Hello".substring(0,1);//first one included secon one excluded
    String sub2 = "hello".substring(1);//ello
    char[] chars = "Hello".toCharArray();
    byte[] bytes = "Hello".getBytes();


}
