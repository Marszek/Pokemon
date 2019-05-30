//Klasa, która definiuje pola w klasie Pokemon.
public class Pokemon {

    private String name;
    private String type;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() { return type; }


    public Pokemon(){}

    public Pokemon(String name, String type)
    {
        this.name=name;
        this.type=type;
    }
}
