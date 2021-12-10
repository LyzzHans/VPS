package shelter;

public class Dog extends VirtualPet{
    public Dog(String name, String tagNumber, String species, String type, String description){
        super(name, tagNumber, species, type, description);
    }

    @Override
    public String getName() {
        return petName;
    }
}
