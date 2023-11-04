// Jeremi Toroj 4.11.2023

public class Thief implements Visitor<Integer, String> {
    @Override
    public boolean shouldRemove(Integer key, String value) {
        // thief steals everything worth more than 1000
        return key >= 1000;
    }
}
