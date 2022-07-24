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

            //каждый раз при вызове getBean() создает новый объект
            Music music1 = context.getBean("rockMusic",RockMusic.class);
            Music music2 = context.getBean("rockMusic",RockMusic.class);
            System.out.println(music1 == music2);
            System.out.println(music1.toString());
            System.out.println(music2.toString());

            context.close();
    }
}
