class Faculty extends Person{
    
    // Parameterized contructor
    Faculty(String name, String email){
        super(name, email);
    }



    @Override
    void displayDetails(){
        System.out.println("------Faculty Details------\n");
        System.out.println("Name: " + name + "\n");
        System.out.println("Email: " + email + "\n" );
    }
}