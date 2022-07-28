import org.springframework.beans.factory.annotation.Value;

public class MusicPlayer {
    Music music;
    @Value("${musicPlayer.volume}")
    private int volume;

    public int getVolume() {
        return volume;
    }

    // через конструктор
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void play(){
        System.out.println("Now playing "+music.getSong());
    }
}
