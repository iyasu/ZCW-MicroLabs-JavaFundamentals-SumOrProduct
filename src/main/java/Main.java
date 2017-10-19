import com.sun.tools.internal.ws.wsdl.document.jaxws.Exception;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){


        try {
            System.out.println(guassianOrFactorial(4, "fdf"));

        } catch (InvalidMethodException e){
            System.out.println("Failed due to: " + e);
        }
    }


    public static int guassianOrFactorial(int n, String function) throws InvalidMethodException{
        int answer;

        switch (function){
            case "guassian":
                answer = guassian(n);
                break;
            case "factorial":
                answer = factorial(n);
                break;
            default:
                 throw new InvalidMethodException(function);

        }

        return answer;
    }


    public static int guassian(int n){
        int sum = 0;

        for(int i = n; i > 0; i--){
            sum += i;
        }
        return sum;
    }

    public static int factorial(int n){
        int factorial = 1;

        for(int i = n; i > 0; i--){
            factorial *= i;
        }

        return factorial;
    }
}
