
class Animals {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animals {
    
    void sound() {
        System.out.println("Dog barks");
    }
}


public class test {
    public static void main(String[] args) {
        Animals a = new Animals();
        Animals b= new Dog(); 
        a.sound();  
        b.sound();
    }
}