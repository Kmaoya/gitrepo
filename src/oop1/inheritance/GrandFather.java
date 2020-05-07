package oop1.inheritance;

public class GrandFather {

   public String favoriteDish="Steak";
   public String favoriteSportsTeam="NY Jets";
   public String grandfatherSSN="99988889";

   private String grandFatherAccountNumber="5467764469";

    public String getGrandFatherAccountNumber() {
        return grandFatherAccountNumber;
    }

    public void setGrandFatherAccountNumber(String grandFatherAccountNumber) {
        this.grandFatherAccountNumber = grandFatherAccountNumber;
    }

    //Default constructor
    public GrandFather() {
    }

    //Parameter constructor
    public GrandFather(String favoriteDish) {
        this.favoriteDish = favoriteDish;
    }

    public GrandFather(String favoriteDish, String favoriteSportsTeam) {
        this.favoriteDish = favoriteDish;
        this.favoriteSportsTeam = favoriteSportsTeam;
    }

    public GrandFather(String favoriteDish, String favoriteSportsTeam, String grandfatherSSN) {

        this.favoriteDish = favoriteDish;
        this.favoriteSportsTeam = favoriteSportsTeam;
        this.grandfatherSSN = grandfatherSSN;
    }

    public void height() {
        System.out.println("Grand Father Height is 6.2");

    }
    public void weight() {
        System.out.println("Grand Father weight is 160");

    }
    public void jump() {
        System.out.println("Grand Father can jump");

    }
    public void playGame() {
        System.out.println("Grand Father can play Football");

    }

}

