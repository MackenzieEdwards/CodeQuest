import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
    
public class ValleySort
{
   public static void main (String[] args) throws IOException
   {
      int tempNum = 0;
      ArrayList<Integer> intList = new ArrayList<Integer>();  
      ArrayList<Integer> aList = new ArrayList<Integer>();
      ArrayList<Integer> bList = new ArrayList<Integer>();
      ArrayList<Integer> resultList = new ArrayList<Integer>();
          
      Scanner file = new Scanner( new File( "Prob03.in.txt" ) );
      while (file.hasNextLine()) 
      {
          String s = file.nextLine();
          //System.out.println(i + " line is " + s);
          if(s.length() > 0)
          {
            String []inums = s.split(" ");
            for(int x=0; x < inums.length; x++)
            {
                  tempNum = Integer.parseInt(inums[x]);
                  intList.add(tempNum);        
            }
            //sort list
            Collections.sort(intList, Collections.reverseOrder());
                     
            //add integers to new array lists
            for (int counter = 0; counter < intList.size(); counter++) {           
               if(counter % 2 == 0) //even position
                  aList.add(intList.get(counter));  
               else //odd position
                 bList.add(intList.get(counter));
            } 
            Collections.sort(bList);
             
            //add integers to result list
            for(int temp: aList){
                 resultList.add(temp);
                }
             
            for(int temp : bList){
              resultList.add(temp);
            }
               
            for(int temp: resultList)
            {
              System.out.print(temp);
              System.out.print(" ");
            }
             
            aList.clear();
            bList.clear();
            intList.clear();
            resultList.clear();
          }
        System.out.println();
      } //end of for loop  
   }
}