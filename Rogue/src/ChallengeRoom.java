public class ChallengeRoom extends Room {

    public ChallengeRoom(Passive passive) {
        super(passive);
    }

    @Override
    public void indentify() {
        System.out.println("I'm a challenge room");
    }

}