class String_6{
    public static void main(String[]args){
        //*******compare to function in java************
      // 1 if output is zero it means equal str
     //  2 if  output is -negative it means str 1 is smaller then str 2

    //   3if output is positive it means str 1 is greater then str2 
        // 4 here output is on the base of lexico graphic comparison
    // 5 A and a are count as different

        // ********** compare to ignore case 
        // here compare and compare to ignore work same but the difference is compare to ignore ignore the case of letter A and a are same  in this case 

        // question practice 
        String fruits[]={"apple","mango","banana","suraj"};
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
}