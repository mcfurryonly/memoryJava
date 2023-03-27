public class Person {
    private String name;
    private String surname;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void changePerson(Person person) {
        person.name = "Ilya";
        person.surname = "Lagutenko";


    }
    @Override
    public String toString() {
        return name + " " + surname;
    }
}
