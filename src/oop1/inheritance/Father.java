package oop1.inheritance;

public class Father extends GrandFather {
    public String favoriteDish = "Biriany";
    public String favoriteSportsTeam = "NY Jets";
    public String FatherSSN = "99988889";

    private String FatherAccountNumber = "5467764469";

    public Father() {
    }

    public Father(String favoriteDish) {
        this.favoriteDish = favoriteDish;
    }

    public Father(String favoriteDish, String favoriteSportsTeam) {
        this.favoriteDish = favoriteDish;
        this.favoriteSportsTeam = favoriteSportsTeam;
    }

    public Father(String favoriteDish, String favoriteSportsTeam, String grandFatherSSN) {
        this.favoriteDish = favoriteDish;
        this.favoriteSportsTeam = favoriteSportsTeam;
        this.FatherSSN = FatherSSN;
    }

    public String getFatherAccountNumber() {
        return FatherAccountNumber;
    }

    public void setFatherAccountNumber(String fatherAccountNumber) {
        FatherAccountNumber = fatherAccountNumber;
    }

    public void playCricket() {
        System.out.println("Father can play Cricket");

    }

    public void swim() {
        System.out.println("Father can swim");
    }

    public void educate() {
        System.out.println("Father can educate others");
    }
}
