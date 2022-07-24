package webapp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    Music music;
    // через конструктор
    //автоматически подбирает бин(автосвязывание)
    @Autowired
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void play(){
        System.out.println("Now playing "+music.getSong());
    }
}
