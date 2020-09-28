import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Paths;

public class Lab2 {

    public static void main(String[] args) {

        try {
            // создать экземпляр объекта сопоставления
            ObjectMapper mapper = new ObjectMapper();

            // преобразовать строку JSON в объект name
            Cat name = mapper.readValue(Paths.get("C:\\Users\\KP\\IdeaProjects\\JSON\\src\\name.json").toFile(), Cat.class);

            // print name
            String html = ("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <title>Titels</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    name+"\n" +
                    "</body>\n" +
                    "</html>");

            File file1 = new File("data.html");
            FileOutputStream fos = new FileOutputStream(file1);

            fos.write(html.getBytes("utf-8"));

            fos.flush();

            fos.close();




        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

import java.util.HashMap;
import java.util.Map;
import java.lang.*;

public class Cat {

    public String lname;
    public String fname;
    public String mname;
    public String data_rozd;



    public Cat() {

    }

    public Cat(String lname, String fname, String mname, String data_rozd) {
        this.lname = lname;
        this.fname = fname;
        this.mname = mname;
        this.data_rozd = data_rozd;

    }

    static class name {

        private static final Map<String, String> letters = new HashMap<String, String>();

        static {
            letters.put("А", "A");
            letters.put("Б", "B");
            letters.put("В", "V");
            letters.put("Г", "G");
            letters.put("Д", "D");
            letters.put("Е", "E");
            letters.put("Ё", "E");
            letters.put("Ж", "Zh");
            letters.put("З", "Z");
            letters.put("И", "I");
            letters.put("Й", "I");
            letters.put("К", "K");
            letters.put("Л", "L");
            letters.put("М", "M");
            letters.put("Н", "N");
            letters.put("О", "O");
            letters.put("П", "P");
            letters.put("Р", "R");
            letters.put("С", "S");
            letters.put("Т", "T");
            letters.put("У", "U");
            letters.put("Ф", "F");
            letters.put("Х", "Kh");
            letters.put("Ц", "C");
            letters.put("Ч", "Ch");
            letters.put("Ш", "Sh");
            letters.put("Щ", "Sch");
            letters.put("Ъ", "'");
            letters.put("Ы", "Y");
            letters.put("Ь", "");
            letters.put("Э", "E");
            letters.put("Ю", "Yu");
            letters.put("Я", "Ya");
            letters.put("а", "a");
            letters.put("б", "b");
            letters.put("в", "v");
            letters.put("г", "g");
            letters.put("д", "d");
            letters.put("е", "e");
            letters.put("ё", "e");
            letters.put("ж", "zh");
            letters.put("з", "z");
            letters.put("и", "i");
            letters.put("й", "i");
            letters.put("к", "k");
            letters.put("л", "l");
            letters.put("м", "m");
            letters.put("н", "n");
            letters.put("о", "o");
            letters.put("п", "p");
            letters.put("р", "r");
            letters.put("с", "s");
            letters.put("т", "t");
            letters.put("у", "u");
            letters.put("ф", "f");
            letters.put("х", "h");
            letters.put("ц", "c");
            letters.put("ч", "ch");
            letters.put("ш", "sh");
            letters.put("щ", "sch");
            letters.put("ъ", "'");
            letters.put("ы", "y");
            letters.put("ь", "");
            letters.put("э", "e");
            letters.put("ю", "yu");
            letters.put("я", "ya");
        }


        public static String toname(String text) {
            StringBuilder sb = new StringBuilder(text.length());
            for (int i = 0; i < text.length(); i++) {
                String l = text.substring(i, i + 1);
                if (letters.containsKey(l)) {
                    sb.append(letters.get(l));
                } else {
                    sb.append(l);
                }
            }
            return sb.toString();
        }


    }


    public String toString() {

        return "Eng->"+name.toname(lname) + " " + name.toname(fname) + " " + name.toname(mname)+"<br>"+"Rus->"+lname + " " + fname + " " + mname +"<br>"+ data_rozd;

    }
}
FIO.json
{

  "lname":"Пушкин",

  "fname":"Александр",

  "mname":"Сергеевич",

  "bdate":"06.06.1799"

}
