public class ID {

    //Формат идентификатора

    // -------------------------------------------------
    // |  8  |  7  |  6  |  5  |  4  |  3  |  2  |  1  |
    // -------------------------------------------------
    // |   класс   | тип |              тег            |
    // -------------------------------------------------

    public byte klass;
    public byte type;
    public byte tag;
    public String tagName;

    public ID (byte b){

        tag = (byte)(b & 0x1F);
        type = (byte)((b >> 5) & 0x01);
        klass = (byte)((6 >> 5) & 0x03);

        String[] name = {
                "End-of-Content",
                "BOOLEAN ",
                "INTEGER",
                "BIT STRING",
                "OCTET STRING",
                "NULL",
                "OBJECT IDENTIFIER",
                "Object Descriptor",
                "EXTERNAL",
                "REAL",
                "ENUMERATED",
                "EMBEDDED PDV",
                "UTF8String",
                "RELATIVE-OID",
                "(reserved)",
                "(reserved)",
                "SEQUENCE",
                "SET",
                "NumericString",
                "PrintableString",
                "T61String",
                "VideotexString",
                "IA5String",
                "UTCTime",
                "GeneralizedTime",
                "GraphicString",
                "VisibleString",
                "GeneralString",
                "UniversalString",
                "CHARACTER STRING",
                "BMPString",
                "(длинная форма)"};

        tagName = name[tag];
    }

    public ID (int i){
        this((byte)i);
    }

    public void Print(){

        System.out.println("Class     : " + klass);
        System.out.println("Type      : " + type);
        System.out.println("Tag       : " + tag);
        System.out.println("Tag  Name : " + tagName);


    }

}
