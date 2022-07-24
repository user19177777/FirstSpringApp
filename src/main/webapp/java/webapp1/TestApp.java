package webapp1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        MusicPlayer player = context.getBean("musicPlayer",MusicPlayer.class);
        player.play();
        context.close();

    }
}
