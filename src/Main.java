import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer value = 33;
        changeValue(value);
        System.out.println(value);
        Integer[] arr = new Integer[]{3, 4};
        changeValue(arr);
        System.out.println(Arrays.toString(arr));


        Person person = new Person("Lyapis", "Trubetskoy");
        person.changePerson(person);
        System.out.println(person);



    }

    private static void changeValue(Integer value) {
        value = 22;
    }

    private static void changeValue(Integer[] value) {
        value[0] = 99;
    }
}