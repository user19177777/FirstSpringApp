import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
        public static void main(String[] args) {
            //инициализируем контекст
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                    "appContext.xml"
            );
            //достаем бин из контекста
            MusicPlayer player = context.getBean("musicPlayer",MusicPlayer.class);
            player.play();
            context.close();
    }
}
