class ArrayOutput
{
    public static void main(String s[])
    {
        int[] input = {3, 5, 6, 7};
        int result = 0;
        int output = multiplyEveryElement(input, result);
        System.out.print("Result of multiplying every element = " + output + ".");
    }

    public static int multiplyEveryElement(int[] input, int result)
    {
        for(int i = 0; i < input.length - 1; i++)
        {
            result *= input[i];
        }
        return result;
    }
}