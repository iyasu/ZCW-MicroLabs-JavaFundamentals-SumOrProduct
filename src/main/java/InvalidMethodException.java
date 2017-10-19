/**
 * Created by iyasuwatts on 10/19/17.
 */
public class InvalidMethodException extends Exception {

    InvalidMethodException(String s){
        super("\"" + s + "\"" + " is not a valid method of the program");
    }
}
