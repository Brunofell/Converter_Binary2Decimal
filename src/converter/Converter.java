package converter;

import java.util.ArrayList;

public class Converter {

    public static void converterBinaryToDecimal(ArrayList<Integer> number, String binary){
        double base = 2;
        double cont = 0;
        ArrayList<Integer> novaLista = new ArrayList<>();
        for(int i = number.size() -1; i >= 0; i--){
            novaLista.add((int) Math.pow(base, i));
        }
        for(int i = 0; i < number.size(); i++){
            cont += novaLista.get(i) * number.get(i);
        }
        System.out.println("> The binary number " + binary + " is equal to " + cont );
    }

    public static ArrayList<Integer> transformaNumeroEmLista(String numeroBinario) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i < numeroBinario.length(); i++){
            list.add(Character.getNumericValue(numeroBinario.charAt(i)));
        }
        return list;
    }
}
