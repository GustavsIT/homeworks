package io.codelex.enums;

public class FirstExeEnum {

    enum CardinalPoints {
        NORTH,
        SOUTH,
        EAST,
        WEST
    }

    public static void main(String[] args) {
        CardinalPoints direction = CardinalPoints.NORTH;
        for (CardinalPoints point : CardinalPoints.values()) {
            String udlr = switch (point) {
                case NORTH -> "up";
                case SOUTH -> "down";
                case EAST -> "right";
                case WEST -> "left";
                default -> "unknown";
            };

            System.out.println(point + ":" + udlr + ":" + point.ordinal());
        }
    }
}