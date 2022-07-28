package webapp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
   @Autowired
    Music music;
    @Value("${musicPlayer.volume}")
    private int volume;

    public int getVolume() {
        return volume;
    }

    // через конструктор
   // public MusicPlayer(Music music) {this.music = music;}

    public void play(){
        System.out.println("Now playing "+music.getSong());
    }
}
