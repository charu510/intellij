package Networks_Assignment;

public class GlobalMembers
{
    // function to convert integer to binary string 
    public static String toBin(long num)
    {
        String bin = "";
        while (num != 0)
        {
            if ((num & 1) != 0)
            {
                bin = "1" + bin;
            }
            else
            {
                bin = "0" + bin;
            }
//C++ TO JAVA CONVERTER WARNING: The right shift operator was not replaced by Java's logical right shift operator since the left operand was not confirmed to be of an unsigned type, but you should review whether the logical right shift operator (>>>) is more appropriate:
            num = num >> 1;
        }
        return bin;
    }

    // function to convert binary string to decimal 
    public static long toDec(String bin)
    {
        long num = 0;
        for (int i = 0; i < bin.length(); i++)
        {
            if (bin.charAt(i) == '1')
            {
                num += 1 << (bin.length() - i - 1);
            }
        }
        return num;
    }

    // function to compute CRC and codeword 
    public static void CRC(String dataword, String generator)
    {
        int l_gen = generator.length();
        long gen = toDec(generator);

        long dword = toDec(dataword);

        // append 0s to dividend 
        long dividend = dword << (l_gen - 1);

        // shft specifies the no. of least  
        // significant bits not being XORed 
        int shft = (int) Math.ceil(Math.log(dividend+1)/Math.log(2)) - l_gen;
        long rem;

        while ((dividend >= gen) || (shft >= 0))
        {


            rem = (dividend >> shft) ^ gen;
            dividend = (dividend & ((1 << shft) - 1)) | (rem << shft);

            // change shft variable 
            shft = (int) Math.ceil(Math.log(dividend+1)/Math.log(2)) - l_gen;
        }

        // finally, AND the initial dividend with the remainder (=dividend) 
        long codeword = (dword << (l_gen - 1)) | dividend;
        System.out.print("Remainder: ");
        System.out.print(toBin(dividend));
        System.out.print("\n");
        System.out.print("Codeword : ");
        System.out.print(toBin(codeword));
        System.out.print("\n");
    }

    public static void main(String[] args)
    {
        String dataword;
        String generator;
        dataword = "10011101";
        generator = "1001"; //Entered the key obtained from previous
                               // result
        CRC(dataword,generator);
    }
}
