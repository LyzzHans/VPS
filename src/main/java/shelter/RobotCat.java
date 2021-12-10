package shelter;

public class RobotCat extends VirtualPet{
    public RobotCat(String name, String tagNumber, String species, String type, String description){
        super(name, tagNumber, species, type, description);
    }

    @Override
    public String getName() {
        return petName;
    }

    @Override
    public void remove(VirtualPet pet) {

    }
}
