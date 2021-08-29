import java.util.ArrayList;
import java.util.List;

public class FuntionalPrograming {

    private static List<Integer> l;

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(12);
        l.add(9);
        l.add(13);
        l.add(4);
        l.add(9);
        l.add(2);
        l.add(4);
        l.add(12);
        l.add(15);
        System.out.println(l);
        //printElStructured(l);
        printElFunctional(l);
    }

    static void printElFunctional(List<Integer> l) {
        l.stream().forEach(t -> System.out.print(t + " "));
       // public static void printElStructured (List < Integer > l) {
            // FuntionalPrograming.l = l;
          //  for (Integer w : l) {
             //   System.out.print(w + " --> ");
            }

        }
