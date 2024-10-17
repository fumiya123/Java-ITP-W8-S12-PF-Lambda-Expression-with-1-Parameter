import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        // definisi ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // tambah elemen ke ArrayList
        languages.add("java");
        languages.add("php");
        languages.add("python");
        System.out.println("ArrayList: " + languages);

        // ubah elemen ArryList ke huruf besar
        languages.replaceAll(e -> e.toUpperCase());
        System.out.println("Updated ArrayList: " + languages);
    }
}
