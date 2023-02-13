
public class statics {

    static int count = 0;
    
    statics() {
        count++;
    }
    void display(){
        System.out.println(count);
    }

    public static void main(String[] args) {
        // statics c1 = new statics();
        // statics c3 = new statics();
        statics c2 = new statics();
        c2.display(); 
    }
}


