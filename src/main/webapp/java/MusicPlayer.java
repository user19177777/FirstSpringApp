public class MusicPlayer {
    Music music;
    // через конструктор
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void play(){
        System.out.println("Now playing "+music.getSong());
    }
}
