public class ArrayExample {
    public static String reverse(String nt) {
        char[] arr = nt.toCharArray();
        String ran = "";
        for(int x = arr.length-1;x >= 0;x = x -1){
            char anyone = arr[x];
            ran = ran + anyone;
        }
        return ran;
    }
}
