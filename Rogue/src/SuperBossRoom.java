public class SuperBossRoom extends BossRoom {
    
    
    public SuperBossRoom(Passive passive) {
        super(passive);
    }
    
    @Override
    public void indentify() {
        System.out.println("I'm a SuperBoss");
    }
}
