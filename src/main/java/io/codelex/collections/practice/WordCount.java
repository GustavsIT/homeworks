package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> file = Files.readAllLines(path, charset);
        for (String line : file) {
            lineCount++;
            charCount += line.length();
            String[] words = line.split("\\s+");
            wordCount += words.length;
        }

        System.out.println("Lines = " + lineCount);
        System.out.println("Words = " + wordCount);
        System.out.println("Chars = " + charCount);
    }
}
