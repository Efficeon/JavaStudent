package com.JavaStudent.Shildt.part1.Chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile01 {
    public static void main(String args[])
    {
        int i;
        FileInputStream fin;

        // сначала убедиться, что имя файла указано.
        if(args.length != 1) {
            System.out.println("Использование: ShowFile01 имя_файла");
            return;
        }

        // Попытка окрыть файл.
        try {
            fin = new FileInputStream(args[0]);
        } catch(FileNotFoundException e) {
            System.out.println("Невозможно отрыть файл");
            return;
        }

        // Теперь файл открыт и готов к чтению.
        // Далее из него читаются символы до тех пор
        // пока не встретится признак окончания файла.
        try {
            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while(i != -1);
        } catch(IOException e) {
            System.out.println("Ошибка чтения из файла");
        }

        // Закрыть файл.
        try {
            fin.close();
        } catch(IOException e) {
            System.out.println("ошибка закрытия файла");
        }
    }
}
