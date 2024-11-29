public class Airplane implements Flyer {
    protected String name;
    
    public Airplane(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public void fly() {
        System.out.printf("直升機 %s 在飛%n", name);
    }
}
