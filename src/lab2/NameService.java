package lab2;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * @throws IllegalArgumentException if fullName is null or empty or has 
     * fewer than two parts
     */
   
   
        public final String extractLastName(String fullName) throws IllegalArgumentException{
        
        String lastName = null;
        String result[] = fullName.split(" ");

        if(result.length <= 1 || result.length >= 4){
            throw new IllegalArgumentException("Really?.. Cmon chief enter your full name properly (use Format: first last):");
        }else if(result.length == 2){
            lastName = result[1];
        }else if(result.length == 3){
            lastName = result[2];
        }
        return lastName;
       
    
    }
    

    
    
}
