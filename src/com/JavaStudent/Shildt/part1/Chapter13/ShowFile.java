package com.JavaStudent.Shildt.part1.Chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String args[])
    {
        int i;
        FileInputStream fin = null;

        // сначала убедиться, что имя файла указано.
        if(args.length != 1) {
            System.out.println("Использование: ShowFile01 имя_файла");
            return;
        }

        // Вследующем коде сначала открывается файл, а затем
        // из него читаются символы до тех пор, пока не встретится
        // признак окончания файла.
        try {
            fin = new FileInputStream(args[0]);

            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while(i != -1);

        } catch(FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch(IOException e) {
            System.out.println("Произошла ошибка вводе вывода");
        } finally {
            // Закрыть файл в любом случае.
            try {
                if(fin != null) fin.close();
            } catch(IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }
    }
}
