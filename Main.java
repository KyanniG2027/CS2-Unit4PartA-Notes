public class Main {

   public static void main(String []args) {
     
      // 1D ARRAY is a block of memory that stores a COLLECTION 
      //of data items (elements)
      //UNDER ONE VARIABLE NAME!!

      //How to DECLARE an ARRAY VARIABLE 
      String[] apCompsci = new String[13]; 
      double[] prices = new double[5]; //default values: 0.0
      String[] names = new String[5]; //defult values: null
      int[] uckyNums= new int[10]; //default values: 0
      boolean[] yesNo = new boolean[3]; // default values: false 

      //How to ACCESS an item in an Array
      System.out.println( prices[0]);

      //Use the same syntax to SET a value in an Array 
      luckyNums [0] = 13;
      luckyNums [5] = 7; 
      System.out.println(luckyNums[0]);
      System.out.println(luckyNums [5]);
      System.out.println(luckyNums[3]); 

      //Create an array win values using an INITIALIZER LIST
      String[] table = {"Matthew", "Danny", "Kyanni"};
      System.out.println(table[1]);
      System.out.println(table [2]); 

      //The .length ATTRIBUTE gets the NUMBER OF ITEMS in array 
      int lengthOfTableArray = table.length; 
      System.out.println(lengthOfTableArray);
      //To get the LAST INDEX use: [arrayName.length -1];
      int finalIndex = table.length -1; 
      System.out.println(finalIndex); //2 is the final index 
      System.out.println(table [finalIndex]); 
      System.out.println(table [table.length -1]); 

      double[] scores = {100.0, 100.0, 100.0, 91.54};
      //look at one item using index 
      System.out.println(scores[1]); 







   }//ends the main method
} //ends the Main CLASS
