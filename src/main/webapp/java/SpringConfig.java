import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//вместо xml
@Configuration
//подключение внешнего файла
@PropertySource("musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicMusic classicMusic(){
        return new ClassicMusic();
    }
    //зависимость в конструкторе
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(classicMusic());
    }
}
