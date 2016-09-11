package com.JavaStudent.MotorDeport.dao.lorryDao;

import com.JavaStudent.MotorDeport.model.ConsoleHelper;
import com.JavaStudent.MotorDeport.model.lorry.CoveredBodyLorry;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CoveredBodyLorryDao implements Serializable{
    private static Map<String, CoveredBodyLorry> coveredBodyLorries = new HashMap<>();
    private ObjectOutputStream lorryOutputStream;
    public CoveredBodyLorry createCoveredBodyLorry(String licensePlate, double carryingCapacity,
                              double lengthOfBody, double widthOfBody, double heightOfBody,
                              boolean technicalDiagnostics) throws IOException, ClassNotFoundException {

        CoveredBodyLorry lorry = null;

        if (getDatabaseCoveredBodyLorry()!=null){
        coveredBodyLorries = getDatabaseCoveredBodyLorry();
        }

        if (coveredBodyLorries.containsKey(licensePlate)){
            lorry = coveredBodyLorries.get(licensePlate);
        } else {
            lorry = new CoveredBodyLorry(licensePlate, carryingCapacity, lengthOfBody,
                    widthOfBody, heightOfBody, technicalDiagnostics);

            coveredBodyLorries.put(lorry.getLicensePlate(), lorry);
            addToDatabaseLorry();
        }
        return lorry;
    }

    public void addToDatabaseLorry() throws IOException {
        lorryOutputStream = new ObjectOutputStream(new FileOutputStream("lorry/ConvertedBodyLorry.dat"));
        lorryOutputStream.writeObject(coveredBodyLorries);
        lorryOutputStream.close();
    }

    public Map<String, CoveredBodyLorry> getDatabaseCoveredBodyLorry() throws IOException, ClassNotFoundException {
        try (ObjectInputStream lorryInputStream = new ObjectInputStream(new FileInputStream("lorry/ConvertedBodyLorry.dat"))){
            return  (HashMap<String, CoveredBodyLorry>) lorryInputStream.readObject();
        } catch (EOFException e){
            return null;
        }
    }

    public void showDatabaseCoveredBodyLorry() throws IOException, ClassNotFoundException {
        if (getDatabaseCoveredBodyLorry()!=null){
            for (Map.Entry lorry : getDatabaseCoveredBodyLorry().entrySet()){
                ConsoleHelper.writeMessage(lorry.getValue().toString());
            }
        }
    }

}
