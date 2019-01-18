import java.lang.reflect.Array;

public class DATA_LENGTH {

    public int length;
    public int form;
    public String formName;
    public int bytesForForm;

    public void getForm (byte b) {


        if ( b == 0x80){
            //длинная, не определенная
            form = 2;
            bytesForForm = -1;
            length = -1;
            formName = "Длинная неопределенная";
        } else if (b > 128) {
            //Длинная форма
            bytesForForm = b & 0x7F;
            form = 1;
            formName = "Длинная определенная";
            length = -1;
        } else {
            //короткая форма
            form = 0;
            bytesForForm = 0;
            length = b & 0x7F;
            formName = "Короткая";
        }
    }


    public void getForm (int i) {
        this.getForm((byte)i);
    }


    public void getLengthLongForm (byte[] b){
        length = Utils.toDec(b);
    }

    public void print(){

        System.out.println("Форма длины данных    : " + formName);
        System.out.println("Индекс формы          : " + form);
        System.out.println("Количество байт длины : " + bytesForForm);
        System.out.println("Значение длины данных : " + length);

    }


}
