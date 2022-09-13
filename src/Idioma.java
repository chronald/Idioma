import java.util.Locale;

public class Idioma {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println("O idioma do seu sistema está em : ");
        System.out.println(loc.getDisplayLanguage());
        System.out.println(loc.getLanguage());
    }

}
