import java.lang.reflect.Array;

public class DATA_LENGTH {

    public int length;
    public int form;
    public int bytesForForm;

    public void getForm (byte b) {



        if (b > 127){
            //Длинная форма
            bytesForForm = b & 0x7F;
            form = 1;
        } else if (b == 0x80) {
            //короткая форма
            form = 0;
            length = b & 0x7F;
        }

            //неопределенная форма

    }

    public void getLengthLongForm (byte[] b){

        length = Utils.toDec(b);

    }


}
