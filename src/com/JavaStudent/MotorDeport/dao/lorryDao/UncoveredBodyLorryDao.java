package com.JavaStudent.MotorDeport.dao.lorryDao;

import com.JavaStudent.MotorDeport.model.ConsoleHelper;
import com.JavaStudent.MotorDeport.model.lorry.UncoveredBodyLorry;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class UncoveredBodyLorryDao implements Serializable {
    private static Map<String, UncoveredBodyLorry> uncoveredBodyLorries = new HashMap<>();
    private ObjectOutputStream lorryOutputStream;

    public UncoveredBodyLorry createUncoveredBodyLorry(String licensePlate, double carryingCapacity,
                                                        double lengthOfBody, double widthOfBody, double heightOfBody,
                                                        boolean technicalDiagnostics) throws IOException, ClassNotFoundException {

        UncoveredBodyLorry lorry = null;

        if (getDatabaseUncoveredBodyLorry() != null) {
            uncoveredBodyLorries = getDatabaseUncoveredBodyLorry();
        }

        if (uncoveredBodyLorries.containsKey(licensePlate)) {
            lorry = uncoveredBodyLorries.get(licensePlate);
        } else {
            lorry = new UncoveredBodyLorry(licensePlate, carryingCapacity, lengthOfBody,
                    widthOfBody, heightOfBody, technicalDiagnostics);

            uncoveredBodyLorries.put(lorry.getLicensePlate(), lorry);
            addToDatabaseLorry();
        }
        return lorry;
    }

    public void addToDatabaseLorry() throws IOException {
        lorryOutputStream = new ObjectOutputStream(new FileOutputStream("lorry/UncoveredBodyLorry.dat"));
        lorryOutputStream.writeObject(uncoveredBodyLorries);
        lorryOutputStream.close();
    }

    public Map<String, UncoveredBodyLorry> getDatabaseUncoveredBodyLorry() throws IOException, ClassNotFoundException {
        try (ObjectInputStream lorryInputStream = new ObjectInputStream(new FileInputStream("lorry/UncoveredBodyLorry.dat"))) {
            return (HashMap<String, UncoveredBodyLorry>) lorryInputStream.readObject();
        } catch (EOFException e) {
            return null;
        }
    }

    public void showDatabaseUncoveredBodyLorry() throws IOException, ClassNotFoundException {
        if (getDatabaseUncoveredBodyLorry() != null) {
            for (Map.Entry lorry : getDatabaseUncoveredBodyLorry().entrySet()) {
                ConsoleHelper.writeMessage(lorry.getValue().toString());
            }
        }
    }
}
