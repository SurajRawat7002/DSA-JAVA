class String_1{
    public static void main(String[]args){
        //Char arr in java
        char arr[]={'a','b','c','d'};
        // System.out.println(arr[0]);

        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+ " ");
        // }


        // *********************** string 

        String name="suraj";
        String lastname="rawat";
        String fullName=name + lastname;
        System.out.println(fullName.length()); // length method of string

        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));  /// charAt method for string 
        }

    }
}