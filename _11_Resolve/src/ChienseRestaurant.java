public class ChienseRestaurant {
    String name;
    String location;
    int numOfTables;

    public ChienseRestaurant(String name, String locatoin, int nemOfTables){
        this.name = name;
        this.location = location;
        this.numOfTables = nemOfTables;
    }
    public void serveJJ(){
        System.out.println("짜장면을 서빙합니다!");
    }
    public void serveJp(){
        System.out.println("짬뽕을 서빙합니다!");
    }
    public void serveTS(){
        System.out.println("탕수육을 서빙합니다!");
    }
    public String toString(){
        return "중화요리집 이름 : " + name + ", 위치 : " + location + ", 테이블 수 : " +numOfTables;
    }
}
