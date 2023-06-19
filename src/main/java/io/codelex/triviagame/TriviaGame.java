package io.codelex.triviagame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class TriviaGame {
    private Set<String> usedQuestions;
    private int correctQuestions;
    private Question currentQuestion;

    public TriviaGame() {
        usedQuestions = new HashSet<>();
        correctQuestions = 0;
        currentQuestion = null;
    }


    private int readUserAnswer() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your answer(1-4):");
        if (in.hasNextInt()) {
            return in.nextInt();
        }
        return -1;
    }

    private boolean checkAnswer(int userAnswer) {
        List<String> answers = currentQuestion.getAnswers();
        String selectedAnswer = answers.get(userAnswer - 1);
        String correctAnswer = currentQuestion.getCorrectAnswer();
        

        boolean isCorrect = selectedAnswer.equals(correctAnswer);

        if (!isCorrect) {
            System.out.println("You answered incorrectly. The correct answer is: " + correctAnswer);
        }

        return isCorrect;
    }

    public void gameStart() throws IOException {
        System.out.println("Welcome to TRIVIA game!");
        System.out.println("You will have to guess the number according to given statement!");
        System.out.println("Guess number that:");

        while (correctQuestions < 20) {
            getTriviaQuestion();
            if (currentQuestion == null) {
                System.out.println("Ooppsie...Error happened...Sorry bro, couldn't get the question from the server!");
                return;
            }

            System.out.println(currentQuestion.getQuestion());
            List<String> answers = currentQuestion.getAnswers();
            Collections.shuffle(answers);

            for (int i = 0; i < answers.size(); i++) {
                System.out.println((i + 1) + ". " + answers.get(i));
            }

            int userAnswer = readUserAnswer();
            if (userAnswer < 0) {
                System.out.println("Error, choose from the options you had!");
                return;
            }

            if (checkAnswer(userAnswer)) {
                System.out.println("Nice job! You got it right!");
                correctQuestions++;
            } else {
                System.out.println("Ee-eeeh, nice try, but it's wrong!");
                System.out.println("You answered correctly to " + correctQuestions + " question(s)!");
                System.out.println("The right answer was: " + currentQuestion.getAnswers().get(answers.size() - 1));
                return;
            }
        }

        System.out.println("Dammn, that is impressive! You answered correctly to all 20 questions!");
    }


    private List<String> generateRandomAnswers(String correctAnswer) {
        List<String> answers = new ArrayList<>();

        answers.add(correctAnswer);

        Random random = new Random();
        int max = random.nextInt(1000) + 1;

        while (answers.size() < 4) {
            int randomAnswer = random.nextInt(max) + 1;
            String answer = String.valueOf(randomAnswer);
            if (!answers.contains(answer)) {
                answers.add(answer);
            }
        }

        Collections.shuffle(answers);
        return answers;
    }

    private void getTriviaQuestion() throws IOException {
        String apiUrl = "http://numbersapi.com/random/trivia?min=0&max=infinity";
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String response = reader.readLine();

        if (connection.getResponseCode() == HttpURLConnection.HTTP_OK && response != null) {
            if (!usedQuestions.contains(response)) {
                String[] parts = response.split(" ", 2);
                if (parts.length == 2) {
                    String numberPart = parts[0];
                    String triviaPart = parts[1];

                    List<String> answers = generateRandomAnswers(numberPart);
                    currentQuestion = new Question(triviaPart, answers, numberPart);
                    usedQuestions.add(response);
                } else {
                    getTriviaQuestion();
                }
            } else {
                getTriviaQuestion();
            }
        } else {
            getTriviaQuestion();
        }
    }

}
