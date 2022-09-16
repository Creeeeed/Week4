import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PaldomeChecker {
    public static boolean checker(String canidate ){
        return true;

    }
    public static void main(String[] args) throws FileNotFoundException {

        FileReader reader = new FileReader( "palidome.txt");
        try{
            Scanner scan = new Scanner(reader);
            while(scan.hasNext()){
                String value = scan.nextLine();
                checker(value);
            }

        }
        catch (Exception e){
            e.getMessage();
        }

    }
}
