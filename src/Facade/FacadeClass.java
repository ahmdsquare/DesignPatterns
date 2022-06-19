package Facade;

public class FacadeClass {
    public String getBeefMenu() {
        BeefRes beef = new BeefRes();
        return beef.getMenu();
    }

    String getVegMenu() {
        VegRes veg = new VegRes();
        return veg.getMenu();
    }

}
