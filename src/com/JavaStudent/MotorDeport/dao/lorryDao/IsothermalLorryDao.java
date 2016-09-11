package com.JavaStudent.MotorDeport.dao.lorryDao;

import com.JavaStudent.MotorDeport.model.ConsoleHelper;
import com.JavaStudent.MotorDeport.model.lorry.IsothermalLorry;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class IsothermalLorryDao implements Serializable{
        private Map<String, IsothermalLorry> isothermalLorries = new HashMap<>();
        private ObjectOutputStream lorryOutputStream;
        public IsothermalLorry createIsothermalLorry(String licensePlate, double carryingCapacity,
                                                        double lengthOfBody, double widthOfBody, double heightOfBody,
                                                        boolean technicalDiagnostics) throws IOException, ClassNotFoundException {

            IsothermalLorry lorry = null;

            if (getDatabaseIsothermalLorry()!=null){
                isothermalLorries = getDatabaseIsothermalLorry();
            }

            if (isothermalLorries.containsKey(licensePlate)){
                lorry = isothermalLorries.get(licensePlate);
            } else {
                lorry = new IsothermalLorry(licensePlate, carryingCapacity, lengthOfBody,
                        widthOfBody, heightOfBody, technicalDiagnostics);

                isothermalLorries.put(lorry.getLicensePlate(), lorry);
                addToDatabaseLorry();
            }
            return lorry;
        }

        public void addToDatabaseLorry() throws IOException {
            lorryOutputStream = new ObjectOutputStream(new FileOutputStream("lorry/IsothermalLorry.dat"));
            lorryOutputStream.writeObject(isothermalLorries);
            lorryOutputStream.close();
        }

        public Map<String, IsothermalLorry> getDatabaseIsothermalLorry() throws IOException, ClassNotFoundException {
            try (ObjectInputStream lorryInputStream = new ObjectInputStream(new FileInputStream("lorry/IsothermalLorry.dat"))){
                return  (HashMap<String, IsothermalLorry>) lorryInputStream.readObject();
            } catch (EOFException e){
                return null;
            }
        }

        public void showDatabaseIsothermalLorry() throws IOException, ClassNotFoundException {
            if (getDatabaseIsothermalLorry()!=null){
                for (Map.Entry lorry : getDatabaseIsothermalLorry().entrySet()){
                    ConsoleHelper.writeMessage(lorry.getValue().toString());
                }
            }
        }

}

