package com.JavaStudent.Shildt.part1.Chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile02 {
    public static void main(String args[]) throws IOException
    {
        int i;

        // Сначала убедиться, что заданы оба файла.
        if(args.length != 2) {
            System.out.println("Использование: CopyFile02 откуда куда");
            return;
        }

        // Открыть два файла и управлять ними в операторе try.
        try (FileInputStream fin = new FileInputStream(args[0]);
             FileOutputStream fout = new FileOutputStream(args[1]))
        {
            do {
                i = fin.read();
                if(i != -1) fout.write(i);
            } while(i != -1);

        } catch(IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
