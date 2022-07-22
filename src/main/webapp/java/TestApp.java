import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
        public static void main(String[] args) {
            //инициализируем контекст
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                    "appContext.xml"
            );
            //достаем бин из контекста
            Music music = context.getBean("music",ClassicMusic.class);
            MusicPlayer player = context.getBean("musicPlayer",MusicPlayer.class);
            player.play();
            context.close();
    }
}
