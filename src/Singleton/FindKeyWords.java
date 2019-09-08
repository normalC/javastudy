public class FindKeyWords{
   public static void main (String[] args) {
     String text = "An array is a data structure that stores a collection of "+"values of the same type.You access each individual value"+"through an integer index.For example,if a is an array"+"of integers,then a[i] is the ith integer in the array.";
     int arrayCount = 0;
     int index = -1;
     String arrayStr = "array";
     index = text.indexOf(arrayStr);
     while(index ______ 0){
       ++arrayCount;
       index+=arrayStr.length();
       index=text.indexOf(arrayStr,index);
 }
 System.out.println("The text contains "+arrayCount+" arrays");
   }
}