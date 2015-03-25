public class GeeksString2{
public static void main(String args[]){
String st="153713";
System.out.println("\n result:"+findLength(st.toCharArray()));
}
public static int findLength(char str[])
{
    int n = str.length;
    int maxlen = 0; // Initialize result
	int sum[][]=new int[n][n];
    // Fill the diagonal values for sunstrings of length 1
    for (int i =0; i<n; i++)
        sum[i][i] = str[i]-'0';

    // Fill entries for substrings of length 2 to n
    for (int len=2; len<=n; len++)
    {
        // Pick i and j for current substring
        for (int i=0; i<n-len+1; i++)
        {
            int j = i+len-1;
            int k = len/2;

            // Calculate value of sum[i][j]
            sum[i][j] = sum[i][j-k] + sum[j-k+1][j];
 
            // Update result if 'len' is even, left and right
            // sums are same and len is more than maxlen
            if (len%2 == 0 && sum[i][j-k] == sum[(j-k+1)][j]
                           && len > maxlen)
                 maxlen = len;
        }
    }
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++)
			System.out.print(sum[i][j]+" ");
		System.out.println();
	}	
    return maxlen;
}
}