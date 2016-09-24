package com.JavaStudent.Shildt.part1.Chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile01 {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fil = null;
        FileOutputStream fout = null;

        //сначала убедимся, что указаны имена обоих файлов
        if(args.length != 2){
            System.out.println("Использование: CopyFile01 откуда куда");
            return;
        }

        //копировать файл
        try{
            //попытаться открыть файлы
            fil = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do{
                i = fil.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        }
        catch (IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        } finally {
            try {
                if (fil != null) fil.close();
            } catch (IOException e2){
                System.out.println("Ошибка закрытия файла ввода");
            }
            try {
                if (fout != null) fout.close();
            } catch (IOException e2){
                System.out.println("Ошибка закрытия файла вывода");
            }
        }
    }
}
