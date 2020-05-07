package oop1.inheritance;

public class Son extends Father {
    public String favoriteDish = "Pizza";
    public String favoriteSportsTeam = "VA Jets";
    public String sonSSN = "79988889";

    private String sonAccountNumber="345678888";

    public Son() {
    }

    public Son(String favoriteDish, String favoriteSportsTeam) {
        this.favoriteDish = favoriteDish;
        this.favoriteSportsTeam = favoriteSportsTeam;
    }

    public Son(String favoriteDish, String favoriteSportsTeam, String sonSSN) {
        this.favoriteDish = favoriteDish;
        this.favoriteSportsTeam = favoriteSportsTeam;
        this.sonSSN = sonSSN;
    }

    public String getSonAccountNumber() {
        return sonAccountNumber;
    }

    public void setSonAccountNumber(String sonAccountNumber) {
        this.sonAccountNumber = sonAccountNumber;
    }

    public void bodyBuilder() {
        System.out.println("Good Fitted Body");
    }
    public void bookReader() {
        System.out.println("Love to read book");
    }

    public void developer() {
        System.out.println("Love to develop application");
    }




}
