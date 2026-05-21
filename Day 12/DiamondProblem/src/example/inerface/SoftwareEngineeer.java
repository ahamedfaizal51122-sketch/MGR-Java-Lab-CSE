package example.inerface;

public class SoftwareEngineeer extends Parent implements OfficeRules,TrafficRules{

    @Override
    void work() {
        System.out.println("working as SoftwareEngineer");
    }

    @Override
    public void wear_formals() {
        System.out.println("wearing formals");
    }

    @Override
    public void work_8_hours() {
        System.out.println("working 8 hours");
    }

    @Override
    public void wear_Id() {
        System.out.println("I'll wear i'd cards");
    }

    @Override
    public void go_left_side() {
        System.out.println("go left side");
    }

    @Override
    public void wear_helmet() {
        System.out.println("wearing helmet");
    }

    @Override
    public void go_slow() {
        System.out.println("i'll go slow");
    }

    public static void main(String[] args){
        SoftwareEngineeer softwareEngineeer=new SoftwareEngineeer();
        softwareEngineeer.work();
        softwareEngineeer.wear_formals();
        softwareEngineeer.work_8_hours();
        softwareEngineeer.wear_Id();
        softwareEngineeer.go_left_side();
        softwareEngineeer.wear_helmet();
        softwareEngineeer.go_slow();
        System.out.println(TrafficRules.fineAmount);
        System.out.println(OfficeRules.no_of_leaves);

    }
}
