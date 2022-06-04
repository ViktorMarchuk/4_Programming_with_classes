package by.epam.aggregetion01.main;
/*
1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста.
 */

import by.epam.aggregetion01.entity.Sentence;
import by.epam.aggregetion01.entity.Text;
import by.epam.aggregetion01.entity.Word;


public class Main {
    public static void main(String[] args){
        Text text = new Text("Name");

        Word word1 = new Word("Everyday I am");
        Word word2 = new Word(" walking.");

        Sentence sentence = new Sentence();
        sentence.addWord(word1);
        sentence.addWord(word2);
        System.out.println("Header:");
        text.output(text.getHeader());
        System.out.println("Text:");
        text.addBody(sentence);
    }
}
/*
Header:
Name
Text:
Everyday I am walking.
 */