import me.maloste.Crypto;

public class CryptoEx {
    public static void main(String [] vz){
        String bz = Crypto.crypt("andreas");
        System.out.println(bz);

        String rt = Crypto.decrypt(bz);
        System.out.println(rt);
    }
}
