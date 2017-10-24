
package lab3;

/**
 *
 * @author Mitch
 */
public class ImproperEntryError extends IllegalArgumentException {

    private static String MSG = "Improper Entry According To Specified Guidlines, Please Try Again";
            
    public ImproperEntryError() {
        super(MSG);
    }

    public ImproperEntryError(String s) {
        super(MSG);
    }

    public ImproperEntryError(String message, Throwable cause) {
        super(MSG, cause);
    }

    public ImproperEntryError(Throwable cause) {
        super(cause);
    }
    
    
    
}
