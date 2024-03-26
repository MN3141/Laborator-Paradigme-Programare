import java.util.Objects;

public class Person {
    String nume;
    String prenume;

    Person(String nume,String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(nume, person.nume) && Objects.equals(prenume, person.prenume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, prenume);
    }

    @Override
    public String toString() {
        return "Person" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\''
                ;
    }
}
