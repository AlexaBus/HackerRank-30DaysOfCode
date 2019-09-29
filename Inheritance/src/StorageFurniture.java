public class StorageFurniture extends Furniture {

    private boolean hasDrawers;
    private boolean hasDoors;
    private int drawers;
    private int width;
    private int height;
    private int depth;

    public StorageFurniture(String name, String scope, boolean hasDrawers, boolean hasDoors, int drawers, int width, int height, int depth) {
        super(name, scope);
        this.hasDrawers = hasDrawers;
        this.hasDoors = hasDoors;
        this.drawers = drawers;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public void open(int drawerNo) {
        if (drawerNo <= drawers) {
            System.out.println("Drawer #" + drawerNo + " is open!");
        } else {
            System.out.println(getName() + " only has " + drawers + " drawers!");
        }
    }

    @Override
    public void open(String door) {
        if (!hasDoors) {
            System.out.println("This sink cabinet has no doors!");
        } else {
            System.out.println(getName() + " " + door + " door is open!");
        }
    }

    public double getVolume(){
        return width * height * depth;
    }


}
