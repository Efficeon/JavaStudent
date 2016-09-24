package com.JavaStudent.Shildt.part1.Chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile03 {
    public static void main(String args[])
    {
        int i;

        // сначала убедиться, что имя файла указано.
        if(args.length != 1) {
            System.out.println("Использование: ShowFile01 имя_файла");
            return;
        }

        // Ниже оператор try с ресурсами применяется
        // сначала для открытия, а потом для автоматического
        // закрытия файла по завершении блока этого оператора
        try(FileInputStream fin = new FileInputStream(args[0])) {

            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while(i != -1);

        } catch(FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch(IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }
    }
}
