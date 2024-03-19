package ru.vaziev.firstTask;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * 1.1. Искомая программа считывает содержимое из файла, каждую считанную строку добавляет в объект
 * StringBuilder, далее объект преобразуется в строку и разбивается с помощью разделителей.
 * Сформированный массив проверяется на наличие повторяющихся строк, а уникальные значения добавляются в список.
 * Элементы списка сортируются в лексографическом порядке и выводятся в консоль, каждое значение с новой строки.
 *
 * 1.2. Достоинства - исходный код разделен логически и легчо читается. Недостатки - низкая производительность,
 * сложные регулярные выражения (возможно лучше использовать (\\W+)), целесообразно закрывать поток чтения в
 * блоке finnaly, не обрабатываются различные исключительные ситуации.
 *
 * 1.3. Метод main ниже считывает содержимое из файла, разбивает содержимое на слова по разделителям, формирует
 * коллекцию с уникальными значениями, формирует новую коллекцию с отсортированными значениеями, выводит в консоль
 * каждое значение с новой строки. Выводит ошибку в консоль при ее возникновении.
 */
class FirstTask {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/test.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while (null != (line = br.readLine())) {
                sb.append(line).append("\n");
            }
            String[] words = sb
                    .toString()
                    .split("\\s|\\(|\\)|\\.|\\[|\\]|,|\\+|;|\\\\|\"|!|\\||/|=|\\*|@|<|>");
            Set<String> resultSet = new HashSet<>();
            for (String word : words) {
                resultSet.add(word);
            }
            List<String> resultList = new ArrayList<>(resultSet);
            Collections.sort(resultList);
            resultList.forEach(System.out::println);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}