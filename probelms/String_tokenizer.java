import java.util.*;
public class String_tokenizer {
    public static void main(String[] args){
        String_tokenizer X= new String_tokenizer();
        X.count("Hello world");
        word("My name is Hamim");
    }
    // count word using tokenizer
    public void count(String a){
        StringTokenizer str = new StringTokenizer(a);
        System.out.println(str.countTokens());
    }
    // word print one by one from a String
    public static void word(String b){
        StringTokenizer str2 = new StringTokenizer(b);
        for (int i = 0; i < b.length(); i++) {
            System.out.println(str2.nextToken());
        }
    }
}
