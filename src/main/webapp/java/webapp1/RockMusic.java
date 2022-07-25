package webapp1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//prototype
@Scope("prototype")
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Rock_music";
    }
}
