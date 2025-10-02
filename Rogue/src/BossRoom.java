public class BossRoom extends Room{
    
    
    public BossRoom(Passive passive) {
        super(passive);
    }
    
    @Override
    public void indentify() {
        System.out.println("I'm a Boss");
    }
    
    
}
