class Oops_1{
    public static void main(String[] args) {
        //Creating object using classes
        Pen pen1=new Pen();
        pen1.setColor("Red");
        pen1.setNib(4);
        pen1.setPrice(15);
        System.out.println(pen1.color);
        System.out.println(pen1.nib);
        System.out.println(pen1.price);

        //Creating a useraccount object with access modifiers
        BankAccount user1=new BankAccount();
        user1.name="SurajRawat";
        System.out.println(user1.name);
        // user1.password="suraj#rawat"; //here password is private in class cannot be accessed outside the class
        user1.setPass("suraj#rawat");
        System.out.println(user1.passSetter());
    }}


// Creating Classes Here
class Pen{
    String color;
    int price;
    int nib;
    void setColor(String newColor){
        color=newColor;
    }
    void setPrice(int newPrice){
        price=newPrice;
    }
    void setNib(int newNib){
        nib=newNib;
    }
}


//Access modifiers (Four types private default protected and public)

class BankAccount{
    public String name;
    private String password;
    void setPass(String pwd){
        password=pwd;
    }

    String passSetter(){
        return password;
    }
}