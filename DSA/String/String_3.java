import java.util.*;
class String_3{
    static float getShortestPath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='E'){
                x++;
            }else if(path.charAt(i)=='W'){
                x--;
            }else if(path.charAt(i)=='N'){
                y++;
            }else {
                y--;
            }
        }
        float displacement=(float)Math.sqrt(((x-0)*(x-0))+((y-0)*(y-0)));
        return displacement;

    }
    public static void main(String[]args){
        String path="WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}