public class Furniture {

    private String name;
    private String scope;

    public Furniture(String name, String scope) {
        this.name = name;
        this.scope = scope;
    }

    public String getName() {
        return name;
    }

    public void open(){
        System.out.println("All drawers and doors are open!");
    }

    public void open(int drawerNo){

    }

    public void open(String door){

    }

    public void close(){
        System.out.println("All drawers and doors are closed!");
    }
}
