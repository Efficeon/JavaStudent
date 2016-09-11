package com.JavaStudent.MotorDeport;

import com.JavaStudent.MotorDeport.dao.lorryDao.CoveredBodyLorryDao;
import com.JavaStudent.MotorDeport.dao.lorryDao.IsothermalLorryDao;
import com.JavaStudent.MotorDeport.dao.lorryDao.RefrigeratorLorryDao;
import com.JavaStudent.MotorDeport.dao.lorryDao.UncoveredBodyLorryDao;
import com.JavaStudent.MotorDeport.model.factory.lorryFactory.CoveredBodyLorryFactory;
import com.JavaStudent.MotorDeport.model.factory.lorryFactory.IsothermalLorryFactory;
import com.JavaStudent.MotorDeport.model.factory.lorryFactory.RefrigeratorLorryFactory;
import com.JavaStudent.MotorDeport.model.factory.lorryFactory.UncoveredBodyLorryFactory;
import com.JavaStudent.MotorDeport.model.lorry.Lorry;

import java.io.*;

public class TestMain implements Serializable{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CoveredBodyLorryFactory coveredBodyLorryFactory = new CoveredBodyLorryFactory();
        Lorry lorry  = coveredBodyLorryFactory.createLorry("KA234-12UA", 12, 10, 2, 3, true);
        Lorry lorry1 = coveredBodyLorryFactory.createLorry("KA234-13UA", 12, 10, 2, 3, false);
        Lorry lorry2 = coveredBodyLorryFactory.createLorry("KA234-14UA", 12, 10, 2, 3, true);
        Lorry lorry3 = coveredBodyLorryFactory.createLorry("KA234-15UA", 12, 10, 2, 3, false);
        Lorry lorry4 = coveredBodyLorryFactory.createLorry("KA234-17UA", 12, 10, 2, 3, true);

        UncoveredBodyLorryFactory uncoveredBodyLorryFactory = new UncoveredBodyLorryFactory();
        Lorry lorry5 = uncoveredBodyLorryFactory.createLorry("AA134-10UA", 12, 10, 2, 3, true);
        Lorry lorry6 = uncoveredBodyLorryFactory.createLorry("AA544-17UA", 12, 10, 2, 3, false);
        Lorry lorry7 = uncoveredBodyLorryFactory.createLorry("AA994-17UA", 12, 10, 2, 3, true);
        Lorry lorry8 = uncoveredBodyLorryFactory.createLorry("AA004-13UA", 12, 10, 2, 3, false);
        Lorry lorry9 = uncoveredBodyLorryFactory.createLorry("AA554-12UA", 12, 10, 2, 3, true);

        RefrigeratorLorryFactory refrigeratorLorryFactory = new RefrigeratorLorryFactory();
        Lorry lorry10 = refrigeratorLorryFactory.createLorry("BA074-11UA", 12, 10, 2, 3, true);
        Lorry lorry11 = refrigeratorLorryFactory.createLorry("BA704-09UA", 12, 10, 2, 3, false);
        Lorry lorry12 = refrigeratorLorryFactory.createLorry("BA444-01UA", 12, 10, 2, 3, true);
        Lorry lorry13 = refrigeratorLorryFactory.createLorry("BA224-02UA", 12, 10, 2, 3, false);
        Lorry lorry14 = refrigeratorLorryFactory.createLorry("BA094-12UA", 12, 10, 2, 3, true);

        IsothermalLorryFactory isothermalLorryFactory = new IsothermalLorryFactory();
        Lorry lorry15 = isothermalLorryFactory.createLorry("TT600-15UA", 12, 10, 2, 3, true);
        Lorry lorry16 = isothermalLorryFactory.createLorry("TT704-18UA", 12, 10, 2, 3, false);
        Lorry lorry17 = isothermalLorryFactory.createLorry("TT333-19UA", 12, 10, 2, 3, true);
        Lorry lorry18 = isothermalLorryFactory.createLorry("TT204-05UA", 12, 10, 2, 3, false);
        Lorry lorry19 = isothermalLorryFactory.createLorry("TT090-01UA", 12, 10, 2, 3, true);

        CoveredBodyLorryDao coveredBodyLorryDao = new CoveredBodyLorryDao();
        coveredBodyLorryDao.showDatabaseCoveredBodyLorry();

        UncoveredBodyLorryDao uncoveredBodyLorryDao = new UncoveredBodyLorryDao();
        uncoveredBodyLorryDao.showDatabaseUncoveredBodyLorry();

        RefrigeratorLorryDao refrigeratorLorryDao = new RefrigeratorLorryDao();
        refrigeratorLorryDao.showDatabaseRefrigeratorLorry();

        IsothermalLorryDao isothermalLorryDao = new IsothermalLorryDao();
        isothermalLorryDao.showDatabaseIsothermalLorry();

        /*CoveredBodyLorry coveredBodyLory = new CoveredBodyLorry("KA234-12UA", 12, 10, 2, 3, true);
        CoveredBodyLorry coveredBody = null;
        ObjectOutputStream lorryOutputStream = new ObjectOutputStream(new FileOutputStream("ConvertedBodyLorry.dat"));
        ObjectInputStream lorryInputStream = new ObjectInputStream(new FileInputStream("ConvertedBodyLorry.dat"));

        Map<String, CoveredBodyLorry> map = new HashMap<>();
        Map<String, CoveredBodyLorry> map1 = new HashMap<>();
        map.put(coveredBodyLory.getLicensePlate(), coveredBodyLory);
        lorryOutputStream.writeObject(map);
        lorryOutputStream.close();
        map1 = (Map<String, CoveredBodyLorry>) lorryInputStream.readObject();
        System.out.println(map1);*/
    }
}
