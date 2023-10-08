public class Animal {

    private String family, name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        setFamily(family);
        setName(name);
        setAge(age);
        setIsMammal(isMammal);
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        if (!family.isEmpty()) {
            this.family = family;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0)
            System.out.println("The age must a positive number");
        else
            this.age = age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setIsMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal:" + "\n"
                + "name: " + name + "\n"
                + "Family: " + family + "\n"
                + "age: " + age + "\n"
                + "Mammal: " + isMammal;
    }
}
