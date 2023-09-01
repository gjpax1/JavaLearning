import java.util.ArrayList;

public class Player implements ISaveable {

    private boolean isAlive;
    private String weapon;


    @Override
    public ArrayList<String> valuesToSave() {
        return null;
    }

    @Override
    public String returnToString() {
    }
}
