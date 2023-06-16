package Aula.HashMap;

import java.util.HashMap;


public class ConverterRomano {

    HashMap unidades = new HashMap<>();
    HashMap dezenas = new HashMap<>();
    HashMap centenas = new HashMap<>();

    public void preencherHashMap() {

        unidades.put(0," ");
        unidades.put(1,"I");
        unidades.put(2,"II");
        unidades.put(3,"III");
        unidades.put(4,"IV");
        unidades.put(5,"V");
        unidades.put(6,"VI");
        unidades.put(7,"VII");
        unidades.put(8,"VIII");
        unidades.put(9,"IX");

        dezenas.put(0," ");
        dezenas.put(1,"X");
        dezenas.put(2,"XX");
        dezenas.put(3,"XXX");
        dezenas.put(4,"XL");
        dezenas.put(5,"L");
        dezenas.put(6,"LX");
        dezenas.put(7,"LXX");
        dezenas.put(8,"LXXX");
        dezenas.put(9,"CM");

        centenas.put(0," ");
        centenas.put(1,"C");
        centenas.put(2,"CC");
        centenas.put(3,"CCC");
        centenas.put(4,"CD");
        centenas.put(5,"D");
        centenas.put(6,"DC");
        centenas.put(7,"DCC");
        centenas.put(8,"DCCC");
        centenas.put(9,"CM");
    }
    public String converter(int numero){
        preencherHashMap();
        int unidade = numero % 10;
            int dezena = ((numero /10) % 10);
            int centena = numero/100 % 1000;
            StringBuilder sb = new StringBuilder();
            if(centena != 0)
                sb.append(centenas.get(centena));
            if(dezena != 0)
                sb.append(dezenas.get(dezena));
            if (unidade != 0)
                sb.append(unidades.get(unidade));

            String resultado = sb.toString();
            return resultado;

    }
}

