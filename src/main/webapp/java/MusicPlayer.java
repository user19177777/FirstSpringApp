public class MusicPlayer {
    Music music;
    private String name;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // через конструктор
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void play(){
        System.out.println("Now playing "+music.getSong());
    }
}
