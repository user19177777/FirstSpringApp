package webapp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music;
    // через конструктор
    public MusicPlayer(Music music) {
        this.music = music;
    }
    //через сеттер
    //автоматически подбирает бин(автосвязывание)
    @Autowired
    public void setMusic(Music music) {
        this.music = music;
    }

    public void play(){
        System.out.println("Now playing "+music.getSong());
    }
}
