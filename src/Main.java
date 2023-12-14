public class Main {
    public static void main(String[] args) {
        MovablePoint a1 = new MovablePoint(10, 10);
        System.out.println(a1.getSpeed()[1]);
        System.out.println(a1.getXY()[0]);
        System.out.println(a1);
        a1.move();
        System.out.println(a1);
    }
}