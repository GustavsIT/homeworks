package io.codelex.oop.imperialToMetric;

public class Main {
    public static void main(String[] args) {
        double result = MeasurementConverter.convert(10, ConversionType.INCHES_TO_CENTIMETERS);
        System.out.println(result);

        double res2 = MeasurementConverter.convert(20, ConversionType.CENTIMETERS_TO_INCHES);
        System.out.println(res2);

        double res3 = MeasurementConverter.convert(100, ConversionType.KILOMETERS_TO_MILES);
        System.out.println(res3);


    }
}
