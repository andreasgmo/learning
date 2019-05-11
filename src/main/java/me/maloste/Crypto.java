package me.maloste;

public class Crypto {




    public static String crypt(String vsr) {
        char[] sist = vsr.toCharArray();
        String resultado = "";
        for (int v = 0; v < vsr.length(); v++) {
            char e = (char)(sist[v] + 13);
            resultado = resultado + e;
        }
        return resultado;
    }
    public static String decrypt(String vsr) {
        char[] sist = vsr.toCharArray();
        String resultado = "";
        for (int v = 0; v < vsr.length(); v++) {
            char e = (char)(sist[v] - 13);
            resultado = resultado + e;
        }
        return resultado;
    }




}
