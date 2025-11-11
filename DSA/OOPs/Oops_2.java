public class Oops_2 {
    public static void main(String[]args){
        //Creating an Object of pen
        Pen pen1= new Pen();
        pen1.setColor("Red");
        pen1.setNib(3);
        
        System.out.println(pen1.getColor());
        System.out.println(pen1.getNib());
    }
}


//Classes with Access modifiers , setters and getters

class Pen{
    private String color;
    private int nib;

    //setter( to set the value for variables)
    void setColor(String color){
        this.color=color;  //Here this refers to the current object 
    }    

    void setNib(int  nib){
        this.nib=nib;
    }

    //Getters (to get the value of variables)
    String getColor(){
        return this.color;
    }

    int getNib(){
        return this.nib;
    }
}