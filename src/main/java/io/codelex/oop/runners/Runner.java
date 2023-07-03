package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(0, 200),
    INTERMEDIATE(200, 800),
    ADVANCED(800, 2000);

    private int minTime;
    private int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public int getMinTime() {
        return minTime;
    }

    public void setMinTime(int minTime) {
        this.minTime = minTime;
    }

    public int getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(int maxTime) {
        this.maxTime = maxTime;
    }

    public static Runner getFitnessLevel(int marathonTime) {
        for (Runner runner : Runner.values()) {
            if (marathonTime >= runner.getMinTime() && marathonTime <= runner.getMaxTime()) {
                return runner;
            }
        }
        return null;
    }
}
