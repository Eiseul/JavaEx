public class Song {
// 필드(멤버 변수) 선언
    private String title;                   // 노래 제목
    private String artist;                  // 가수
    private String album;                   // 앨범 제목
    private String composer;                // 작곡가
    private int year;                       // 발표연도
    private int track;                      // 앨범 내 트랙 번호

    // 생성자
    public Song(String title, String artist, String album, String composer, int year, int track) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.composer = composer;
        this.year = year;
        this.track = track;
    }

    // Getter 메서드들
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public String getAlbum(){
        return album;
    }
    public String gerComposer(){
        return composer;
    }
    public int getYear(){
        return year;
    }
    public int getTrack(){
        return track;
    }

    // Setter 메서드들 (필요에 따라)
    public void setTitle(String title){
        this.title = title;
    }
    public void setArtist(String Artist){
        this.artist = artist;
    }
    public void setAlbum(String Album){
        this.album = album; 
    }
    public void setComposer(String Composer){
        this.composer = composer;
    }
    public void setYear(int Year){
        this.year = year;
    }
    public void setTrack(){
        this.track = track;
    }

    // toString 오버라이드 : 객체 상태를 문자열로 보기좋게 표현
    @Override
    public String toString(){
        return"Song(" + "title'" + title + '\'' + ", artist ='" + '\'' + ', album'" + album = " + "    }
}
