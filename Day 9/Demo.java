public class Demo{
    public static void main(String[] args) {
        byte a=5;
        switch (a) {
            case 1:a++;
            case 2:++a;
            case 3:--a;
            case 4:++a;
            case 5:a--;
            default:
        }
        System.out.println(a);
    }
}