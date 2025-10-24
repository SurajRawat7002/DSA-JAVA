
class Bit_2 {

    static void binary(int n) {
        int bitMask = 1; // It will used to get the lsb of a number . we will do bitmask & with the num to get lsb
        if ((n & bitMask) == 0) {
            //even
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is odd");
        }
    }

    public static void main(String[] args) {
        //checking if a binary number is odd or even
        binary(2);
    }
}
