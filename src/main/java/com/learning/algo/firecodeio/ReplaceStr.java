package com.learning.algo.firecodeio;

public class ReplaceStr {

  public static void main(String[] args) {
    System.out.println(replace("This is a test","/"));
  }
  public static String replace(String a, String b) {
   final StringBuffer buff = new StringBuffer();
   final char[] charArr = a.toCharArray();
   for(int i = 0; i < charArr.length; i++){
     if(charArr[i] == ' '){
       buff.append(b);
     }else{
       buff.append(charArr[i]);
     }
   }
   return buff.toString();
 }
}
