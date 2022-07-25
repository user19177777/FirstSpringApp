package webapp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    //через поле
    //автоматически подбирает бин(автосвязывание)
    @Autowired
    //уточняет, какой бин выбрать
    @Qualifier("rockMusic")
    private Music music;

    public void play(){
        System.out.println("Now playing "+music.getSong());
    }
}
