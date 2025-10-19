import java.util.*;
class String_2{
    static boolean pallindrome(String word){
       int start=0;
       int end=word.length()-1;
       for(int i=0;i<word.length()/2;i++){
        if(word.charAt(i)!=word.charAt(word.length()-1-i)){
            return false;
        }
  
       }
             return true;
    }

    public static void main(String[]args){
        String word="nitin";
        System.out.println(pallindrome(word));
        
}
}