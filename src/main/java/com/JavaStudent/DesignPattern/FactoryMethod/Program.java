package com.JavaStudent.DesignPattern.FactoryMethod;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory factory = createDeveloperFactoryBySpeciality("Php");
        Developer developer = factory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperFactoryBySpeciality(String speciality){
        if (speciality.equals("Java")){
            return new JavaDeveloperFactory();
        } else if (speciality.equals("Cpp")) {
            return new CppDeveloperFactory();
        } else if (speciality.equals("Php")){
            return new PhpDeveloperFactory();
        } else throw new RuntimeException(speciality + " is unknown speciality.");
    }
}

