package webapp1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//по умолчанию singleton
@Scope("singleton")
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Rock_music";
    }
}
