package main.java.com.example.anagram;

import java.util.ArrayList;

public class AnagramCreator {
    ArrayList<Character> symbolsArray = new ArrayList<>();
    ArrayList<StringBuilder> resultArray = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    int index = 0;
    char sym = ' ';
    int flag = 0;

    public void createAnagram(String result) {
        String[] array = result.split(" ");
        for (String word: array) {
            for (char symbol : word.toCharArray()) {
                if (!Character.isLetter(symbol)) {
                    index = word.indexOf(symbol);
                    sym = symbol;
                    flag++;
                } else {
                    symbolsArray.add(symbol);
                }
            }
            if (flag != 0) {
                collect();
            } else {
                reverseAndAdd();
            }
        }
        showResult();
    }

    private void collect() {
        symbolsArray.add(symbolsArray.size() - index, sym);
        reverseAndAdd();
        symbolsArray.clear();
    }

    private void reverseAndAdd() {
        for (char token: symbolsArray) {
            sb.append(token);
        }
        sb.reverse();
        resultArray.add(sb);
        symbolsArray.clear();
        sb = new StringBuilder();
    }

    private void showResult() {
        for (StringBuilder element: resultArray) {
            System.out.print(element + " ");
        }
    }
}
