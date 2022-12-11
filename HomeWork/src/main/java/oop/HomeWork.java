package oop;

import java.util.*;

public class HomeWork {
    public static boolean Valid(String parens)
    {
        ArrayDeque stack = new ArrayDeque();
        for (char c : parens.toCharArray()) {                           //проходим циклам по элементам строки
            if (c == '(' || c == '{' || c == '[') {                     // если встречаем ({[ то записываем их в ArrayDeque
                stack.push(String.valueOf(c));
            }
            if((c == ')' && stack.peek().equals("("))               //если встречаем )}] и при в начале очереди есть открывающаяся скобка, то вытаскивает и удаляет первый в очереди
                        || (c == '}' && stack.peek().equals("{"))
                        || (c == ']' && stack.peek().equals("["))) {
                    stack.pop();
            }
            else {
                return false;
            }
        }
        return stack.isEmpty();                                         //проверяем на пустоту строки
    }


    private static void printMap(Map<String,Integer> map){
        for (String key : map.keySet()){
            System.out.println("Word: " + key + " Count: " + map.get(key));
        }
    }

    //Просто метод
   public static void WordCount(String line){
       String[] word = line.toLowerCase().replaceAll("\\p{Punct}","").split(" ");
       Map<String,Integer> words = new HashMap<>();
       for (int j = 0; j < word.length; j++) {
           if (words.containsKey(word[j])){
               words.put(word[j], words.get(word[j]) + 1);
           }
           else{
               words.put(word[j], 1);
           }
       }
       printMap(words);
    }

    //добавил цикл проверки производных слов
    public static void WordCount2(String line){
        String[] word = line.toLowerCase().replaceAll("\\p{Punct}","").split(" ");
        Map<String,Integer> words = new HashMap<>();
        for (int i = 0; i < word.length; i++){
            if (words.containsKey(word[i])){
                words.put(word[i], words.get(word[i]) + 1);
            }
            else {
                words.put(word[i], 1);
            }
            for (int j = 0; j < word.length; j++){
                if (i != j && word[i].length() < word[j].length() && word[j].replaceAll(word[i],"").length() <= 4){
                    word[j] = word[i];
                }
            }

        }
        printMap(words);
    }




    //hashCode && equals

}







