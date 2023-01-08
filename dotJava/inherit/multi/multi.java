// 2. Write a Java program that uses interface to support multiple inheritance.
package inherit.multi;

class Father {

    public String fatherName() {

        String name = "Dad.";
        return name;

    }
}

interface Mother {
    
    public String motherName();
}

class Child extends Father implements Mother {

    public String motherName() {
    
        String name = "Mom";
        return name;
    }
   
  
}

public class multi {
    public static void main(String[] args) {
        Child my = new Child();
        System.out.print("\nHi! I'm child of my "+my.motherName()+" & "+my.fatherName());
      
    }
}
