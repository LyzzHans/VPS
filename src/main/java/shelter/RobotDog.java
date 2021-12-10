package shelter;

public class RobotDog extends  VirtualPet{
    public RobotDog(String name, String tagNumber, String species, String type, String description){
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
