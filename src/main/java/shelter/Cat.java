package shelter;

public class Cat extends VirtualPet {
    public Cat(String name, String tagNumber, String species, String type, String description){
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
