package shelter;


public abstract class VirtualPet {

    protected String tagNumber;
    protected String petDescription;
    protected String petSpecies;
    protected String petName;
    protected String type;
    protected boolean isAlive = true;
    private int petHealth = 80;
    private int petHunger = 30;
    private int petThirst = 20;
    private int petBoredom = 30;
    private int petHygiene = 40;


    public VirtualPet(String petName, String tagNumber, String petSpecies, String type, String petDescription) {
        this.tagNumber = tagNumber;
        this.petName = petName;
        this.petSpecies = petSpecies;
        this.type = type;
        this.petDescription = petDescription;


    }

    public String getPetName() {
        return petName;
    }

    public String getTagNumber() {
        return tagNumber;
    }

    public int getPetHunger() {
        return petHunger;
    }

    public int getPetThirst() {
        return petThirst;
    }

    public int getPetBoredom() {
        return petBoredom;
    }

    public int getPetHygiene() {
        return petHygiene;
    }

    public String getPetSpecies() {
        return petSpecies;
    }

    public String getPetDescription() {
        return petDescription;
    }

    public int getPetHealth() {
        return petHealth;

    }

    public void feed() {
        petHunger -= 20;
        petHygiene += 5;
        petBoredom += 20;
        petHealth -= 10;
    }

    public void water() {
        petThirst -= 20;
        petHealth += 20;
    }

    public void play() {
        petHunger += 20;
        petBoredom -= 20;
        petHealth += 20;
        petHygiene -= 10;
    }

    public void cleanCages() {
        petHealth += 20;
        petHygiene -= 20;
    }

    public void seeVet() {
        petHealth += 20;
        System.out.println("       xXXx\n" +
                "                 (XXXX)\n" +
                "       .xX308XXX..xXXx..XXX308XXXx.\n" +
                "  .xXXX308X308X308X308X308X308X308XXXXx.\n" +
                "   ~`\\XX308X308X308X308X308X308X308X/'~\n" +
                "        ``````/ .\\XXXX /   \\ '''''\n" +
                "             :  <~XXXX(./;  ;\n" +
                "              `. `'XXX:/' ,'\n" +
                "                `:.  `\\ /'\n" +
                "                :  `:. ;\n" +
                "                 :.  :/\n" +
                "               ,' :x.  `.\n" +
                "               :  `XXX /\n" +
                "                `.  `:x\n" +
                "                .'`.  `;\n" +
                "                ;.:XXx:\n" +
                "                  `XX'\n" +
                "                    XX \n");
    }

    public boolean petIsAlive() {
        return isAlive;

    }

    public void gameTick() {
        petHunger += 10;
        petThirst += 10;
        petBoredom += 10;
        petHealth -= 10;
        petHygiene -= 10;


        if (petHunger >= 90) {
            System.out.println("__------__\n" +
                    "                    /~          ~\\\n" +
                    "                   |    //^\\//^\\|         Please feed your pets!\n" +
                    "                 /~~\\  ||  o| |o|:~\\      They are so hungry!\n" +
                    "                | |6   ||___|_|_||:|    /\n" +
                    "                 \\__.  /      o  \\/'   \n" +
                    "                  |   (       O   )       \n" +
                    "         /~~~~\\    `\\  \\         /\n" +
                    "        | |~~\\ |     )  ~------~`\\\n" +
                    "       /' |  | |   /     ____ /~~~)\\\n" +
                    "      (_/'   | | |     /'    |    ( |\n" +
                    "             | | |     \\    /   __)/ \\\n" +
                    "             \\  \\ \\      \\/    /' \\   `\\\n" +
                    "               \\  \\|\\        /   | |\\___|\n" +
                    "                 \\ |  \\____/     | |\n" +
                    "                 /^~>  \\        _/ <\n" +
                    "                |  |         \\       \\\n" +
                    "                |  | \\        \\        \\\n" +
                    "                -^-\\  \\       |        )\n" +
                    "                     `\\_______/^\\______/");
        } else if (petThirst >= 90) {
            System.out.println("|\\    \\ \\ \\ \\ \\ \\ \\      __   \n" +
                    "|  \\    \\ \\ \\ \\ \\ \\ \\   | O~-_\n" +
                    "|   >----|-|-|-|-|-|-|--|  __/\n" +
                    "|  /    / / / / / / /   |__\\  \n" +
                    "|/     / / / / / / /\n" +
                    "The pets are very thirsty!\n");
        } else if (petHygiene >= 60) {
            System.out.println(petName + "Would really like if you cleaned the cages! It stinks in here!");
            System.out.println("💩");
        } else if (petHealth <= 20 && petHygiene <= 20) {
            System.out.println(petName + "Is very sick and needs to see the vet");

        } else if (petHealth < 10 || petHunger >= 100) {
            isAlive = false;
            System.out.println(petName +
                    "                                 _____  _____\n" +
                    "                                <     `/     |\n" +
                    "                                 >          (\n" +
                    "                                |   _     _  |\n" +
                    "                                |  |_) | |_) |\n" +
                    "                                |  | \\ | |   |\n" +
                    "                                |            |\n" +
                    "                 ______.______%_|            |__________  _____\n" +
                    "               _/                                       \\|     |\n" +
                    "              |               Died from neglect             <\n" +
                    "              |_____.-._________              ____/|___________|\n" +
                    "                                |    and      |\n" +
                    "                                |  watching   |\n" +
                    "                                | the Bengals |\n" +
                    "                                |    play     |\n" +
                    "                                |   _        <\n" +
                    "                                |__/         |\n" +
                    "                                 / `--.      |\n" +
                    "                               %|            |%\n" +
                    "                           |/.%%|          -< @%%%\n" +
                    "                           `\\%`@|     v      |@@%@%%    - mfj\n" +
                    "                         .%%%@@@|%    |    % @@@%%@%%%%\n" +
                    "                    _.%%%%%%@@@@@@%%_/%\\_%@@%%@@@@@@@%%%%%%\n");

        }
    }

    public String getName() {
        return petName;
    }

    public abstract void remove(VirtualPet pet);
}