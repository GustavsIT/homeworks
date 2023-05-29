package io.codelex.oop.imperialToMetric;

public enum ConversionType {
    METERS_TO_YARDS(value -> value * 1.0936133),
    YARDS_TO_METERS(value -> value * 0.9144),
    CENTIMETERS_TO_INCHES(value -> value * 0.3937008),
    INCHES_TO_CENTIMETERS(value -> value * 2.54),
    KILOMETERS_TO_MILES(value -> value * 0.6213712),
    MILES_TO_KILOMETERS(value -> value * 1.609344);

    private Converter converter;

    ConversionType(Converter converter) {
        this.converter = converter;
    }

    public double convert(double value) {
        return converter.convert(value);
    }

}

interface Converter {
    double convert(double value);
}

