import java.io.*;

public class BigInt {
  int[] digits; 
  int size; 
  public BigInt(String n) {
    size = n.length();
    digits = new int[size];
    for (int i=0; i<size; i++)
      digits[i] = (int)(n.charAt(size-1-i) - '0');
  }
  public BigInt(int[] dig) {
    if (zero(dig)) {
      size = 1;
      digits[0] = 0;
    }
    else {
      size = dig.length;
      while (dig[size-1] == 0)
        size--;
      digits = new int[size];
      for (int i=0; i<size; i++)
        digits[i] = dig[i];
    }
  }

  public static boolean zero(int[] numbers) {
    for (int i=0; i<numbers.length; i++)
      if (numbers[i] != 0)
        return false;
    return true;
  }

  public BigInt add(BigInt other) {
    int newsize = max(size, other.size) + 1;
    int [] tempdigits = new int[newsize];
    int result=0, carry=0;
    for (int i=0; i<newsize-1; i++) {
      int temp = 0;
      if (i < size)
        temp += digits[i];
      if (i < other.size)
        temp += other.digits[i];
      temp += carry;
      tempdigits[i] = temp % 10;
      carry = temp/10;
    }
    if (carry == 1)
      tempdigits[newsize-1] = 1;
    else
      tempdigits[newsize-1] = 0;
    return new BigInt(tempdigits);
  }
  
  public BigInt sub(BigInt other) {
    int [] tempdigits = new int[size];
    int result=0, carry=0;
    for (int i=0; i<size; i++) {
      int temp = digits[i];
    if (i < other.size)
        temp -= other.digits[i];
      temp -= carry;      
      carry = 0; 
      if (temp < 0) {
        temp = temp + 10;
        carry = 1;
      }
      
      tempdigits[i] = temp;
    }
    return new BigInt(tempdigits);
  }

  public int compare(BigInt other) {
    if (size < other.size)
      return -1;
    else if (size > other.size)
      return 1;
    for (int i=size-1; i>=0; i--) {
      if (digits[i] < other.digits[i])
        return -1;
      else if (digits[i] > other.digits[i])
        return 1;
    }
    return 0;
  }

  public static int max(int a, int b) {
    if (a > b)
      return a;
    else
      return b;
  }

  public String toString() {
    String ans = new String();
    for (int i=0; i<size; i++)
      ans = charToString((char)(digits[i]+'0')) + ans;
    return ans;
  }

  public static String charToString(char c) {
    char[] temp = new char[1];
    temp[0] = c;
    return new String(temp);
  }

  public static void main(String[] args) throws IOException {
	BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
	String st1=buffer.readLine();
    BigInt one1 = new BigInt(st1);
    BigInt one2 = new BigInt(st1);
	String st=buffer.readLine();
    BigInt two=new BigInt(st);
	one1=one1.add(two);
	one2=one2.sub(two);
	System.out.println(one1);
	System.out.println(one2);
  }
}