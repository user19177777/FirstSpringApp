import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
          SpringConfig.class
        );
        MusicPlayer player = context.getBean("musicPlayer",MusicPlayer.class);
        player.play();
        System.out.println(player.getVolume());
        context.close();
    }
}
