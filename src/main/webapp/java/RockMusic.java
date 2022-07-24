public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Rock_music";
    }
    public void doMyInit(){
        System.out.println("Init_method");
    }
    public void doMyDestroy(){
        System.out.println("Destroy_method");
    }
}
