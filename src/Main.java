import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        byte[] array = {1,2,3,4,5,6,7,8,9,10};
        ByteArrayInputStream by =new ByteArrayInputStream(array,2,3);
        System.out.println("KULLANILABILEN BYTE SAYISI : "+by.available());
        int i = by.read();

        while (i != -1){
            System.out.println(i);
            i = by.read();
        }
        by.close();
    }
}
