public class Swiftie {
    private String song;
    private String albumEra;
    private int playMusic;
    

    public Swiftie(String song,String albumEra, int playMusic ){
        this.song = song;
        this.albumEra = albumEra;
        this.playMusic = playMusic;
      
    }
    
    public void setSong(String song){
        this.song = song;
    }

    public String getSong(){
        return song;
    }


    public int getplayMusic(){
        return playMusic;
    }

    public void setplayMusic(int playMusic){
        this.playMusic = playMusic;
    }

    public String getAlbum_era(){
        return albumEra;
    }

    public void setAlbum_era(String albumEra){
        this.albumEra = albumEra;
    }

    void Preview(){
        System.out.println("The song " + this.getSong() + " under the album of " + this.getAlbum_era() + " is currently playing on the Code Device: " + this.getplayMusic());
    }

    void changePlay(int playMusic){
        setplayMusic(playMusic);
    }
    public int getChangePlay(){
        return playMusic;
    }
}
