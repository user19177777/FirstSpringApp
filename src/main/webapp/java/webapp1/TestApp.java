package webapp1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        MusicPlayer player = context.getBean("musicPlayer",MusicPlayer.class);
        player.play();
        System.out.println(player.getVolume());
        //создает один объект и потом использует его ссылку
        Music music1 = context.getBean("rockMusic",RockMusic.class);
        Music music2 = context.getBean("rockMusic",RockMusic.class);
        System.out.println(music1 == music2);
        System.out.println(music1.toString());
        System.out.println(music2.toString());
        context.close();

    }
}
