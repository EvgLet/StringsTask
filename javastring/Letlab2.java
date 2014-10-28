import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Letlab2 {

    public static void main(String[] args) throws IOException {
        String text = "";
        Scanner readText = new Scanner(new File("D:/projects/JavaProjects/src/123.txt"));
        while(readText.hasNext()){
            text +=readText.nextLine() +"\r\n";
        }
        System.out.println(text);
        int  n = 0;
        while (true) // ввод числа строк

        {
             System.out.println("Введите длину слов которые нужно удалить,если они начинаются на гласную букву я их удалю");
             Scanner scanN = new Scanner(System.in);
            try

            {
                n = scanN.nextInt();
                break;
            }
            catch(InputMismatchException fg)

            {
                System.out.print("Вы ввели не число. ");
            }

        }
        String [] words = text.split(" ");
        StringBuilder builder = new StringBuilder();
        for (String s : words) {
            if(!(isVowel(s.charAt(0)) && s.length() == n)) {
                builder.append(s).append(" ");
            }
        }
        String result = builder.toString().trim();
        System.out.println(result);

    }

    public static boolean isVowel(char c) {
        switch (Character.toLowerCase(c)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                return true;
            default:
                return false;
        }
    }
}


