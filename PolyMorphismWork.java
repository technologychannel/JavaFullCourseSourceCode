public class PolyMorphismWork {
    public static void main(String[] args) {
    Mic m1 = new Mic();
    m1.printInfo();

    Boya b1 = new Boya();
    b1.printInfo();

    Rode r1 = new Rode();
    r1.printInfo();

    }
}

class Mic{
    void printInfo(){
        System.out.println("This is default mic.");
    }
}

class Boya extends Mic{
    void printInfo(){
        System.out.println("This is boya mic.");
    }
}

class Rode extends Mic{

}

