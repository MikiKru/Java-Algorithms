package controller;

public class StringController {

    String content = "Example content: Lorem ipsum Lorem ipsum";

    public boolean isCharacter(char c){
        int search = content.indexOf(c);
        return search != -1 ? true : false;
    }
    public int countAllCharacters(char c){
        int charCounter = 0;
        String text = content.toUpperCase();
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == c){
                charCounter++;
            }
        }
        return charCounter;
    }
    public int countUpperCases(){
        int upperCaseCounter = 0;
        for (int i = 0; i < content.length(); i++){
            if((int)content.charAt(i) >= 65 && (int)content.charAt(i) <= 90){
                upperCaseCounter++;
            }
        }
        return upperCaseCounter;
    }
    public String reverse(){
        String _tmp = "";
        for (int i = content.length()-1; i >=0; i--){
            _tmp += content.charAt(i);
        }
        return _tmp;
    }
}
