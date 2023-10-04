// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int n = 0;
        while ( true ) // ввод числа строк
        {
            System.out.println("Введите число строк");
            Scanner sc1 = new Scanner(System. in );
            try
            {
                n = sc1.nextInt();
                break;
            }
            catch(InputMismatchException fg)
            {
// если введенное значение не является числом
                System.out.print("Вы ввели не число. " );
            }
        }
// создание массива строк
        String[] str = new String[n];
        Scanner sc2 = new Scanner(System.in);
        for (int i = 0; i < n; i++)
        {
            System. out.println( " Введите строку №" + (i+1));
            str[i] = sc2.nextLine();
        }
//сортировка массива строк по длине
        for ( int i = 0; i < str. length -1; i++)
        {
            for (int j = i+1; j < str.length; j++)
            {
                if (str[i].length()>str[j].length())
                {
                    String temp = str[j];
                    str[j] = str[i];
                    str[i] = temp;
                }
            }
        }
        int maxlength = str[0].length();
        System.out.println("Строки в порядке возрастания длины:");
        for ( int i = 0; i < str. length ; i++)
        {
            System.out.print(str[i]);
            for (int j = 0; j < maxlength - str[i].length(); j++)
                System.out.print(" ");
            System. out.println( " её длина = " + str[i].length());
        }
        System. out.println( " А теперь учтём первую букву и отсортируем по алфавиту");
        Arrays.sort(str);
        for ( int i = 0; i < str. length ; i++)
        {
            System.out.print(str[i]);
            for (int j = 0; j < maxlength - str[i].length(); j++)
                System.out.print(" ");
            System. out.println( " её длина = " + str[i].length());
        }
    }
}