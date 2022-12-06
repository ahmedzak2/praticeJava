package finalPrioject;

public class Player extends Coin{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String  name;

    public String getGuss() {
        return guss;
    }

    public void  setGuss(String guss) {
        this.guss = guss;
    }

    public String guss;
   Player(String name){
    setName(name);
}

}
