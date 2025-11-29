abstract class Person {
    protected String name;
    protected String email;

    // Parameterized Constructor
    Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Defualt Constructor
    Person() {
        this.name = "Name";
        this.email = "email123@gmail.com";
    }

    abstract void displayDetails();
}