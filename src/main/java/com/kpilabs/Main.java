package com.kpilabs;

// variant 25

// 1. Тип текстових змінних - String
// 2. Дія з текстом - Відсортувати слова заданого тексту за зростанням кількості в них заданої літери.

// Створити клас, який складається з виконавчого методу, що виконує
// дію з текстовим рядком (п.3) використовуючи для цього тип даних
// згідно варіанту (п.3). Необхідно обробити всі виключні ситуації,
// що можуть виникнути під час виконання програмного коду. Всі змінні
// повинні бути описані та значення їх задані у виконавчому методі.
// Код повинен відповідати стандартам Java Code Conventions (або Google Java Style Guide)
// та бути завантаженим на GitHub.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введіть текст: ");
            String text = scanner.nextLine();

            System.out.print("Введіть літеру для підрахунку: ");
            String letterInput = scanner.nextLine();
            if (letterInput.length() != 1 || !Character.isLetter(letterInput.charAt(0))) {
                throw new IllegalArgumentException("Необхідно ввести одну літеру.");
            }
            char letter = letterInput.charAt(0);

            TextSorter sorter = new TextSorter();
            String[] sortedWords = sorter.sortWordsByLetterCount(text, letter);

            System.out.println("Відсортовані слова:");
            for (String word : sortedWords) {
                System.out.println(word);
            }

        } catch (IllegalArgumentException e) {
            System.err.println("Помилка введення: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Виникла непередбачена помилка: " + e.getMessage());
        }
    }
}
