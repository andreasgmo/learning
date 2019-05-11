package me.maloste;

public class HackerSkull {

public static void main(String [] vz){
    String bz =crypt("andreas");
    System.out.println(bz);

     String rt = decrypt(bz);
     System.out.println(rt);
}


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
