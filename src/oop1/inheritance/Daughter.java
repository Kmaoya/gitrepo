package oop1.inheritance;

public class Daughter extends Father {
    public String favoriteDish = "Masala";
    public String favoriteSportsTeam = "FL Jets";
    public String daughterSSN = "29988889";

    private String daughterAccountNumber="545678888";

    public Daughter() {
    }

    public Daughter(String favoriteDish, String favoriteSportsTeam) {
        this.favoriteDish = favoriteDish;
        this.favoriteSportsTeam = favoriteSportsTeam;
    }

    public Daughter(String favoriteDish, String favoriteSportsTeam, String daughterSSN) {
        this.favoriteDish = favoriteDish;
        this.favoriteSportsTeam = favoriteSportsTeam;
        this.daughterSSN = daughterSSN;
    }

    public String getDaughterAccountNumber() {
        return daughterAccountNumber;
    }

    public void setDaughterAccountNumber(String daughterAccountNumber) {
        this.daughterAccountNumber = daughterAccountNumber;
    }

    public void mindReader() {
        System.out.println("Can read mind easily");
    }
    public void sing() {
        System.out.println("Can sing");
    }



}
