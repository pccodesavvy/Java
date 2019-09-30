import java.nio.charset.Charset;

public class byteToString {

    public static void main (String[] args){

        String name = "myworld.com";
        byte[] byteArray = name.getBytes();

        String str = new String(byteArray);
        String strWithcharSet = new String(byteArray, Charset.defaultCharset());

        System.out.println("Original String: "+name);
        System.out.println("Original String: "+str);
        System.out.println("Original String: "+strWithcharSet);

        /***
         * Byte to String eg2
         */

        String string = "howtodoinjava.com";

        byte[] bytes = string.getBytes();
        System.out.println(bytes);
    }
}
