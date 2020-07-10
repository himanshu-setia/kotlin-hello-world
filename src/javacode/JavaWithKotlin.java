package javacode;

import intro.ExtensionsKt;
import intro.Util;
import intro.Util2;
import intro.Util3;

import java.io.IOException;

enum color {
    BLUE,
    GREEN
}

public class JavaWithKotlin {
    public static void main(String[] args) {
        System.out.println(Util.max(5, 10));
        System.out.println(Util.checkJoin("Himanshu", "Setia"));
        System.out.println(Util2.generateEmail("asa", "A"));
        System.out.println(Util2.getDefaultEmail2());

        // Allowed only after adding @JvmOverloads to the function in kotlin
        // NOTE: since first arguement would always be needed if specificying
        // non default arguements, keep the defaults towards the end in function
        // declaration.
        System.out.println(Util2.generateEmail("sagar"));

        // We can only catch exception if it is explicitly declared with
//        try{
//            Util3.foo();
//        } catch (IOException e) {
//
//        }

        // We can only catch exception if it is explicitly declared with
        // @Throws(IOException::class)
        try {
            Util3.bar();
        } catch (IOException e) {

        }

        // Testing kotlin extensions
        System.out.println(ExtensionsKt.lastChar("Himanshu"));
        System.out.println(ExtensionsKt.repeat("sdpds", 5));
    }
}
