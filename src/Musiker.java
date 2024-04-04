public class Musiker implements IGitarrenspieler,ISänger {


    @Override
    public void singen() {
        System.out.println("Ich singe");

    }

    @Override
    public void gitarreSpielen() {
        System.out.println("Ich spiele Gitarre");

    }
}
