package tamilnadu.chennai.mgr;
public class College {
    protected void lab(){
        System.out.println("hi-tech lab");
    }
    public void admission(){
        System.out.println("admission is going on");
    }
    protected void canteen(){
        System.out.println("health fodds are here");
    }
    protected void auditorium(){
        System.out.println("over 1000 can be sit in the hall");
    }
    private void cabin_principal(){
        System.out.println("in principal cabin");
    }
    public static void main(String[] args) {
        College mgr=new mgr();
        mgr.lab();
        mgr.admission();
        mgr.canteen();
        mgr.auditorium();
        mgr.cabin_principal();
    }
}
