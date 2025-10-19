import java.util.*;
class String_5{
    static String subString(String str, int si, int ei){
        String subStr="";
        for(int i=si;i<ei;i++){
            subStr+=str.charAt(i);
        }
        return subStr;
    }
    public static void main(String[]args){
//substring 
String str="Hello World";
// System.out.println(subString(str,0,5));

// *************predefine substring function in java 
System.out.println(str.substring(0,5));
    }
}