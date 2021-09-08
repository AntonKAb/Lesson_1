import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex3 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите текст: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = br.readLine();
        String inputStringU = inputString.toUpperCase();
        inputStringU = inputStringU.replaceAll("\\s+","");
        inputStringU= inputStringU.replaceAll("\\p{Punct}", "");
        System.out.println(inputStringU);

        char[] charArray = inputString.toCharArray();
        String inputStringRev = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            inputStringRev += charArray[i];
        }

        String inputStringRevU = inputStringRev.toUpperCase();
        inputStringRevU = inputStringRevU.replaceAll("\\s+","");
        inputStringRevU= inputStringRevU.replaceAll("\\p{Punct}", "");
        System.out.println(inputStringRevU);

        if (inputStringU.equals(inputStringRevU)){
            System.out.println(inputString + " - это палиндром");
        }
        else{
            System.out.println(inputString + " - это не палиндром");
        }
    }
}
