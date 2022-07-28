package webapp1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//вместо xml
@Configuration
//подключение внешнего файла
@PropertySource("musicPlayer.properties")
//где смотреть классы для бинов для autowiring
@ComponentScan("webapp1")
public class SpringConfig {

}
