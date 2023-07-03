package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class DatePeriod {
    private LocalDate start;
    private LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public DatePeriod intersection(DatePeriod other) {
        if (!(this.end.isBefore(other.start) || this.start.isAfter(other.end))) {
            LocalDate finalStart;
            if (this.start.isAfter(other.start)) {
                finalStart = this.start;
            } else {
                finalStart = other.start;
            }
            LocalDate finalEnd;
            if (this.end.isAfter(other.end)) {
                finalEnd = this.end;
            } else {
                finalEnd = other.end;
            }
            return new DatePeriod(finalStart, finalEnd);
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        LocalDate firstStart = LocalDate.of(2022, 1, 1);
        LocalDate firstEnd = LocalDate.of(2022, 1, 15);
        DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);

        LocalDate secondStart = LocalDate.of(2022, 1, 10);
        LocalDate secondEnd = LocalDate.of(2022, 1, 25);
        DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);

        DatePeriod overlap = firstPeriod.intersection(secondPeriod);

        if (overlap != null) {
            System.out.println("Intersection is from " + overlap.getStart() + " to " + overlap.getEnd());
        } else {
            System.out.println("No intersection between chosen timelines!");
        }
    }

}
