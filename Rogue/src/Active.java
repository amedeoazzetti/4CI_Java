
public class Active extends Item {

    int chargeLevel;
    final int MaxCharge;

    public Active(String name, double damageMod, double fireMod, int chargeLevel, int maxCharge) {
        // Chiamata al super costruttore obbligatoria!
        super(name, damageMod, fireMod);

        MaxCharge = maxCharge;
        chargeLevel = MaxCharge;

    }

    public Boolean isLoaded() {
        if (chargeLevel > 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getMaxCharge() {
        return MaxCharge;
    }

    public void reload(){
        chargeLevel = MaxCharge;
    }

}
