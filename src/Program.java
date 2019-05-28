import java.io.*;

/**
 * Created by OUT-Akopyan-SR on 28.05.2019.
 */
public class Program {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        String s;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\OUT-Akopyan-SR\\Downloads\\Новая папка\\text2.txt"))) {
            while ((s = br.readLine()) != null) {
                a++;
                System.out.println(s);
            }
        } catch (IOException ext) {
            System.out.println("Ошибка ввода-вывода: " + ext);

        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите предложения");
        try (FileWriter fw = new FileWriter("C:\\Users\\OUT-Akopyan-SR\\Downloads\\Новая папка\\text2.txt")) {
            do {
                System.out.print("Вы ввели : ");
                s = br.readLine();
                s = s + "\r\n";
                fw.write(s);
                b++;

            } while (b < a);

        } catch (IOException ext) {
            System.out.println("Ошибка ввода-вывода: " + ext);

        }

    }


}