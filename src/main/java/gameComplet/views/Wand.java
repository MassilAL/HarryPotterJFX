package gameComplet.views;

import java.util.List;

import static gameComplet.Jeux.GameConsole.random;

public class Wand {

    private int size;
    private Core core;
    static List<Core> ListCore=Core.getValues();

    public Wand(){
        this.size= random.nextInt(10, 30);
        this.core= ListCore.get(random.nextInt(ListCore.size()));
    }
    public int getSize() {return size;}

    public Core getCore() {
        return core;
    }
}
