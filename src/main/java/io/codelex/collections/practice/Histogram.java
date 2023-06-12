package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        displayHistogram(scores);
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }

    private static void displayHistogram(String scores) {
        Map<String, Integer> histogram = new HashMap<>();
        String[] scoreArray = scores.split(" ");
        for (String score : scoreArray) {
            int num = Integer.parseInt(score);
            int range = (num / 10) * 10;
            String key = String.format("%02d-%02d:", range, range + 9);
            histogram.put(key, histogram.getOrDefault(key, 0) + 1);
        }

        for (int i = 0; i < 10; i++) {
            String key = String.format("%02d-%02d:", i * 10, i * 10 + 9);
            int count = histogram.getOrDefault(key, 0);
            StringBuilder histogramLine = new StringBuilder(key);
            histogramLine.append(" ");
            for (int j = 0; j < count; j++) {
                histogramLine.append("*");
            }
            System.out.println(histogramLine);
        }
        String perfectScoreKey = "100:";
        int perfectScoreCount = histogram.getOrDefault(perfectScoreKey, 0);
        StringBuilder perfectScoreLine = new StringBuilder(perfectScoreKey);
        perfectScoreLine.append(" ");
        for (int i = 0; i <= perfectScoreCount; i++) {
            perfectScoreLine.append("*");
        }
        System.out.println(perfectScoreLine);
    }
}
