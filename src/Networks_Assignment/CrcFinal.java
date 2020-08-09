package Networks_Assignment;

public class CrcFinal {
    public static void main(String[] args) {

    }
    //function to compute CRC
    public static void CRC(String dataword,String generator){
        int l_gen = generator.length();
        int dword = Integer.parseInt(generator);

        //appends 0 to dividend
        int dividend = dword << (l_gen-1);

        //shft specifies the no. of least
        //significant bits not being XORed
//        int shft = (int) Math.ceil(Math.log(21)(dividend+1));

    }
}
