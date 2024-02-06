import java.util.ArrayList;
import java.util.Scanner;
import static converter.Converter.transformaNumeroEmLista;
import static converter.Converter.converterBinaryToDecimal;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("> Type a binary number to be converted in decimal: ");
        String binary = sc.next();

        ArrayList<Integer> numbers = transformaNumeroEmLista(binary);
        converterBinaryToDecimal(numbers, binary);

    }

}