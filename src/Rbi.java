public interface Rbi {

    void withDraw();

}

interface Rbi1 {
    void deposit();
}

class Sbi implements Rbi,Rbi1{

    @Override
    public void withDraw() {
        System.out.println("Sbi withdraw");
    }

    @Override
    public void deposit() {
        System.out.println("Sbi deposit");
    }
}

class MainCheck1{
    public static void main(String[] args) {

       Sbi r=new Sbi();
        r.withDraw();
        r.deposit();
    }
}