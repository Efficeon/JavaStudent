package com.JavaStudent.MotorDeport.model.lorry;

import java.io.Serializable;

public class CoveredBodyLorry extends Lorry implements Serializable {
    static final long serialVersionUID = 5037585225066001448L;
    public CoveredBodyLorry(String licensePlate, double carryingCapacity, double lengthOfBody, double widthOfBody,
                            double heightOfBody, boolean technicalDiagnostics) {
        super(licensePlate, carryingCapacity, lengthOfBody, widthOfBody, heightOfBody, technicalDiagnostics);
    }

    @Override
    public String toString(){
    return  "Грузовой автомобиль(Крытый кузов): " +
            "Автомобильные номера: " + this.getLicensePlate() + "; " +
            "Грузоподъемность: " + this.getCarryingCapacity() + "; " +
            "Длинна: " +this.getLengthOfBody() + "; " +
            "Ширина: " + this.getWidthOfBody() + "; " +
            "Высота " + this.getHeightOfBody() + ";\n" +
            "Техническая диагностика: " + this.isTechnicalDiagnostics() + "; " +
            "Закрепленный водитель: " + this.getDriver() +
            "\n-----------------------------------------------------------------------------------" +
            "---------------------------------------------------------";
}
}
