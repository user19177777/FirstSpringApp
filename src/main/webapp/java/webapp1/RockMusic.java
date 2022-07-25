package webapp1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Rock_music";
    }
    @PostConstruct
    public void doMyInit(){
        System.out.println("Init_method");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Destroy_method");
    }
}
