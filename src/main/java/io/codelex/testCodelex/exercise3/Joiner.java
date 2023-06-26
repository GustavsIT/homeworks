package io.codelex.testCodelex.exercise3;

public class Joiner<T> {
    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... elements) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null) {
                result.append(elements[i].toString());
            }
            if (i < elements.length - 1) {
                result.append(separator);
            }
        }
        return result.toString();
    }
}
