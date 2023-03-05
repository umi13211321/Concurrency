import java.sql.Timestamp;
import java.text.DecimalFormat;

import static java.lang.Thread.currentThread;

public class Main {
    public static void main(String[] args) {

       Addable ad1 = (a,b) -> {
         return a+b;
       };
    }
}

interface Addable{
    int add(int a,int b);
}