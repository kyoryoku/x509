public final class Utils {

    private static String exextendString (String s, char c, int count, int pos){

        if (pos == 0){
            //символы дописываются в начало строки
            while (s.length() % count != 0){
                s = c + s;
            }
        } else {
            //символы дописываются в конец строки
            while (s.length() % count != 0){
                s = s + c;
            }
        }
        return s;
    }

    public static String extendStr0Bgn8 (String s){
        return exextendString(s, '0', 8, 0 );
    }

    public static String extendStr0Bgn2 (String s){
        return exextendString(s, '0', 2, 0 );
    }

    public static int toDec(byte[] b){

        String hexStr = "";
        for (int i = 0; i<b.length; i++){
            hexStr += extendStr0Bgn2(Integer.toHexString(b[i]));
        }
        return Integer.parseInt(hexStr, 16);

    }


}
