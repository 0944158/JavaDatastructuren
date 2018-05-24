public class Student {

    private int studentnummer;
    private String naam;
    private int leeftijd;
    private String geslacht;

    public int getStudentnummer(){
        return studentnummer;
    }

    public void setStudentnummer(int studentnummer) {
        this.studentnummer = studentnummer;
    }

    public String getNaam(){
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd(){
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public String getGeslacht(){
        return geslacht;
    }

    public void setGeslacht(String geslacht) {
        this.geslacht = geslacht;
    }

    public void printStudent(){
        System.out.print("Studentnummer:" +studentnummer);
        System.out.print("Naam:" +naam);
        System.out.print("Leeftijd:" +leeftijd);
        System.out.print("Geslacht:" +geslacht);
    }

    public String toString(){
        String gegevens = studentnummer + "/" + naam + "/" + leeftijd + "/" + geslacht;
        return gegevens;
    }










}
