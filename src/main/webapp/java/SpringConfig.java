import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//вместо xml
@Configuration
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
