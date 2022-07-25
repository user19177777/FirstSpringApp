package webapp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    //через поле
    //автоматически подбирает бин(автосвязывание)
    @Autowired
    private Music music;

    public void play(){
        System.out.println("Now playing "+music.getSong());
    }
}
