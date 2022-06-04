package by.epam.aggregetion01.entity;

import java.util.Objects;

public class Sentence {
    private String sentence = "";

    public Sentence(){
    }

    public void addWord(Word word){
        sentence += "" + word.getWord();
    }

    public String getSentence(){
        return sentence;
    }

    public void setSentence(String sentence){
        this.sentence = sentence;
    }

    @Override
    public int hashCode(){
        return Objects.hash(sentence);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Sentence other = (Sentence)obj;
        return Objects.equals(sentence, other.sentence);
    }

    @Override
    public String toString(){
        return "Sentence { sentence = " + sentence + "}";
    }
}