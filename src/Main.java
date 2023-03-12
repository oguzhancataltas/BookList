import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> arrayList = new ArrayList<>();
        ArrayList<Book> pageList = new ArrayList<>();
        Map<String, String > mapList = new HashMap<>();

        arrayList.add(new Book("Simyacı", 184, "Paulo Coelho", "28.09.2021"));
        arrayList.add(new Book("Zeytindağı", 176, "Falih Rıfkı Atay", "01.09.2013"));
        arrayList.add(new Book("Semerkant", 318, "Amin Maalouf", "23.09.2021"));
        arrayList.add(new Book("Huzur", 419, "Ahmet Hamdi Tanpınar", "01.09.2013"));
        arrayList.add(new Book("Osmancık", 376, "Tarık Buğra", "21.02.2023"));
        arrayList.add(new Book("Şibumi", 432, "Trevanian", "14.12.2022"));
        arrayList.add(new Book("Yalnızız", 416, "Peyami Safa", "01.11.2022"));
        arrayList.add(new Book("Amat", 239, "İhsan Oktay Anar", "03.08.2021"));
        arrayList.add(new Book("Kelebek", 565, "Henri Charriere", "01.01.2010"));
        arrayList.add(new Book("Çankaya", 656, "Falih Rıfkı Atay", "31.08.2021"));

//        for (int i = 0; i <arrayList.size(); i++){
//            mapList.put(arrayList.get(i).getBookName(), arrayList.get(i).getAuthorName());
//        }

        arrayList.stream().forEach(num -> mapList.put(num.getBookName(), num.getAuthorName()));
        arrayList.stream().filter(num -> num.getPageNumber()>250).forEach(pageList::add);

        mapList.forEach((key, value) -> System.out.println("--------------------\n" + "Kitap İsmi : " + key + "\nYazar İsmi : " + value));
        pageList.stream().forEach(num -> System.out.println("--------------------\n" + "Kitap İsmi : " + num.getBookName() + "\nYazar İsmi : " + num.getAuthorName() + "\nSayfa Sayısı : " + num.getPageNumber() + "\nYayın Tarihi : " + num.getReleaseDate()));



    }
}
