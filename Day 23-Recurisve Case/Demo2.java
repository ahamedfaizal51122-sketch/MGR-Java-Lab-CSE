public class Demo2 {
    static void towerOfHanoi(int n, char source, char helper, char destination){
        if(n == 1){
            System.out.println("take disk" + n + " from " + source + " -> " + destination);
            return;
        }
        towerOfHanoi(n-1, source, destination, helper);
        System.out.println("take disk " + n + " from " + source + " -> " + destination);
        towerOfHanoi(n-1, helper, source, destination);
    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, 'A', 'B', 'C');
    }
}
