import java.util.*;
class String_7{
    public static void main(String[]args){
        // String Builder
        StringBuilder sb=new StringBuilder("Suraj");

        // ********printing sb using index and charAt function

        // System.out.println(sb.charAt(0));

        // **********setChatAt function to change the char in stringBuilder

        // sb.setCharAt(4,'t');
        // System.out.println(sb);

        // **********insert function to inserting a char in stringbuilder

        // sb.insert(1,'u');
        // System.out.println(sb);


        // ***********delete char from string

        // sb.delete(0,3); // 3 is not included
        // System.out.println(sb);


        // *********** append function to appedn a char in string

        sb.append("singh");
        System.out.println(sb);

    }
}