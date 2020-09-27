package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExemple {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Dima");
        arrayList.add("Zina");
        arrayList.add("Violina");
        arrayList.add("Maria");
        arrayList.add("Serghei ");

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() );
        }
    }
}
