package by.epam.aggregetion01.entity;

import java.util.Objects;

public class Text {
    private String header;
    private String body = "";

    public Text(){
    }

    public Text(String header){
        this.header = header;
    }

    public Text(Word word){
        header = word.getWord();
    }

    public Text(Sentence sentence){
        header = sentence.getSentence();
    }

    public String getBody(){
        return body;
    }

    public String getHeader(){
        return header;
    }

    public void addBody(Word word){
        System.out.println(body += "" + word.getWord());

    }

    public void addBody(Sentence sentence){
        System.out.println(body += "" + sentence.getSentence());
    }

    public void output(String header){
        System.out.println(getHeader());
    }

    @Override
    public int hashCode(){
        return Objects.hash(header, body);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Text other = (Text)obj;
        return Objects.equals(header, other.header) && Objects.equals(body, other.body);
    }

    @Override
    public String toString(){
        return "Text [header = " + header + " ,body= " + body + "]";
    }
}



