/* write a method to replace all spaces in a string with "%20". 
   Assuming that the string has sufficient space at the end. Can you do it inplace(use char array). **/
package crackingTheCodingInterview.ArraysAndStrings;

public class URLify {
   public static char[] replaceSpaces(char[] str, int trueLength) {
      int spaceCount = 0, index, i = 0;
      for (i = 0; i < trueLength; i++) {
         if (str[i] == ' ')
            spaceCount++;
      }
      index = trueLength + spaceCount * 2;
      System.out.println(index);
      if (trueLength < str.length)
         str[trueLength] = '\0';

      for (i = trueLength - 1; i >= 0; i--) {
         if (str[i] == ' ') {
            str[index - 1] = '0';
            str[index - 2] = '2';
            str[index - 3] = '%';
            index = index - 3;
         } else {
            str[index - 1] = str[i];
            index--;
         }
      }
      return str;
   }

   public static void main(String[] args) {
      // char[] str = { 'm', 'r', ' ', 'j', 'o', 'h', 'n', ' ', 's', 'm', 'i', 't',
      // 'h', ' ', ' ', ' ', ' ' };
      String str = " Mr John Smith      ";
      int trueLength = 14;
      char[] res = replaceSpaces(str.toCharArray(), trueLength);
      for (char ch : res) {
         System.out.print(ch);
      }
   }
}
