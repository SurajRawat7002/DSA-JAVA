class String_8{
        public static void main(String[] args) {
       StringBuilder sb=new StringBuilder("hi i am suraj ");
      for(int i=0;i<sb.length();i++){
          if(i==0){
              char lower=sb.charAt(i);
              char upper=Character.toUpperCase(lower);
              sb.setCharAt(i,upper);
          }else{
              if(sb.charAt(i)== ' ' && i<sb.length()-1){
                  char lower=sb.charAt(i+1);
                  char upper=Character.toUpperCase(lower);
                  sb.setCharAt(i+1,upper);
              }
          }
      }
      System.out.println(sb);

    }
}