public class Main {
    public static void main(String[] args) {
        Club zamalek = new Club("Zamalek");
        zamalek.addPlayer(new Player("Fergani Sasi",90,150000,"Midfielder","tunisian"));
        zamalek.addPlayer(new Player("kasongo kabongo",88,2000,"Stricker","kungolian"));
        zamalek.addBuilding(new Building("zamora ",50,5));
        zamalek.addStadium(new Stadium("zamora stadium",20000));

    }
}
