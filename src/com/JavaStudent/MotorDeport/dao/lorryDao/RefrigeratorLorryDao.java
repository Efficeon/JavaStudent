package com.JavaStudent.MotorDeport.dao.lorryDao;

import com.JavaStudent.MotorDeport.model.ConsoleHelper;
import com.JavaStudent.MotorDeport.model.lorry.RefrigeratorLorry;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class RefrigeratorLorryDao implements Serializable {
    private Map<String, RefrigeratorLorry> refrigeratorLorries = new HashMap<>();
    private ObjectOutputStream lorryOutputStream;
    public RefrigeratorLorry createRefrigeratorLorry(String licensePlate, double carryingCapacity,
                                                  double lengthOfBody, double widthOfBody, double heightOfBody,
                                                  boolean technicalDiagnostics) throws IOException, ClassNotFoundException {

        RefrigeratorLorry lorry = null;

        if (getDatabaseRefrigeratorLorry()!=null){
            refrigeratorLorries = getDatabaseRefrigeratorLorry();
        }

        if (refrigeratorLorries.containsKey(licensePlate)){
            lorry = refrigeratorLorries.get(licensePlate);
        } else {
            lorry = new RefrigeratorLorry(licensePlate, carryingCapacity, lengthOfBody,
                    widthOfBody, heightOfBody, technicalDiagnostics);

            refrigeratorLorries.put(lorry.getLicensePlate(), lorry);
            addToDatabaseLorry();
        }
        return lorry;
    }

    public void addToDatabaseLorry() throws IOException {
        lorryOutputStream = new ObjectOutputStream(new FileOutputStream("lorry/RefrigeratorLorry.dat"));
        lorryOutputStream.writeObject(refrigeratorLorries);
        lorryOutputStream.close();
    }

    public Map<String, RefrigeratorLorry> getDatabaseRefrigeratorLorry() throws IOException, ClassNotFoundException {
        try (ObjectInputStream lorryInputStream = new ObjectInputStream(new FileInputStream("lorry/RefrigeratorLorry.dat"))){
            return  (HashMap<String, RefrigeratorLorry>) lorryInputStream.readObject();
        } catch (EOFException e){
            return null;
        }
    }

    public void showDatabaseRefrigeratorLorry() throws IOException, ClassNotFoundException {
        if (getDatabaseRefrigeratorLorry()!=null){
            for (Map.Entry lorry : getDatabaseRefrigeratorLorry().entrySet()){
                ConsoleHelper.writeMessage(lorry.getValue().toString());
            }
        }
    }

}

