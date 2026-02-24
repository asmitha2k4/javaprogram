import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
          s = s.trim();
        
        // if string is empty
        if(s.length() == 0){
            System.out.println(0);
        }
        else{
            // split using non alphabet characters
            String[] tokens = s.split("[^A-Za-z]+");
            
            System.out.println(tokens.length);
            
            for(int i = 0; i < tokens.length; i++){
                System.out.println(tokens[i]);
            }
        }
        
        scan.close();
    }
}

