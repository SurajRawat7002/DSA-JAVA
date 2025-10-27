class Bit_3{
        //Get Ith Bit
    static void getIthBit(int n ,int i){


        int bitMask=1;
        if((n&(1<<i))==0){
            System.out.println("The " + i + " index is 0");
        }else{
            System.out.println("The " + i + " index is 1");
        }
    }

    // Set Ith Bit 
    static int setIthBit(int n, int i){
        int bitMask=1<<i;
        return n|bitMask;
    }

    // Clear Ith Bit 
    static int clearIthBit(int n, int i){
        int bitMaskNot=~(1<<i);
        return n & bitMaskNot;
    }
     
     //Update ith bit

     static int updateIthBit(int n, int i, int newBit){
        // if(newBit==0){
        //     return clearIthBit(n, i);
        // }else{
        //     return setIthBit(n, i);
        // }

        //second approach

        n=clearIthBit(n, i);
        int bitMask=newBit<<i;
        return n|bitMask;
     }


     //Clear last i bits (-1<<i) also (~0)
     static int clearIBit(int n, int i){
        int bitMask=((-1<<i));
        return n & bitMask;
     }

     //clear bit in range 

     static int clearInRange(int n, int i, int j){
        int a=(~0<<j+1);
        int b=(1<<i)-1;
        int bitMask=a|b;
        return n  & bitMask;
     }
     // check if a number is power of 2 or not
     static void checkPower(int n){
        if((n & (n-1))==0){
            System.out.println("The given number is power of 2");
        }else{
            System.out.println("The given number is not power of 2");
        }
     }
        // Count Set Bits  in a Number
        static int countSetBit(int n){
            int count=0;
            while(n>0){
                if((n&(1<<0))!=0){
                    count++;
                    n=n>>1;
                }else{
                    n=n>>1;
                }
            }
            return count;
        }


        //Fast Exponentiation 
        static int fastExpo(int a, int n){
            int ans=1;
            while(n>0){
               if((n & 1) !=0){
                ans=ans*a;
               }
                a=a*a;
                n= n>>1;
            }
            return ans;
        }
    public static void main(String[]args){ 
        // getIthBit(10,2);
        // System.out.println(setIthBit(7,2));
        // System.out.println(clearIthBit(10, 1));
        // System.out.println(updateIthBit(10,2,1));
        // System.out.println(clearIBit(15,2));
        // System.out.println(clearInRange(15,1,2));
        // checkPower(16);
        // System.out.println(countSetBit(10));
        System.out.println(fastExpo(5, 324342));
    }
}