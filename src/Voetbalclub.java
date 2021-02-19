public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub(String naam){
        this.naam = naam;
    }
    public String getNaam(){
        return naam;
    }
    public int getTotaalGewonnen(){
        return aantalGewonnen;
    }
    public int getTotaalGelijk(){
        return aantalGelijk;
    }
    public int getTotaalVerloren(){
        return aantalVerloren;
    }
    public void verwerkResultaat(char ch){
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }
    public int aantalGespeeld(){
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }
    public int aantalPunten(){
       int puntenGewonnen = aantalGewonnen * 3;
       int puntenGelijk = aantalGelijk * 1;
        return puntenGewonnen + puntenGelijk;
    }
    public String toString(){
        return naam + " " + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk
                + " " + aantalVerloren + " " + aantalPunten();

    }

}
