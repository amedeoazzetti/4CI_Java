public abstract class Item {
    private double damageMod, fireMod;

    public Item(double damageMod, double fireMod) {
        this.damageMod = damageMod;
        this.fireMod = fireMod;
    }

    public double getDamageMod() {
        return damageMod;
    }

    public double getFireMod() {
        return fireMod;
    }

    
}