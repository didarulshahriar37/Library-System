class Student extends Person{
    
    // Parameterized constructor
    Student(String name, String email){
        super(name, email);
    }

    // 

    @Override
    void displayDetails(){
        System.out.println("------Student Details------\n");
        System.out.println("Name: " + name + "\n");
        System.out.println("Email: " + email + "\n");
    }
}
