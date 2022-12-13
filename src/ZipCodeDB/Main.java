package ZipCodeDB;

public class Main {
    public static void main(String[] args) {
        Zipcode z1 = new Zipcode("13617", "NY", "Canton", 75.16, 44.59, 11781);
        // z1 is a reference to an object

        Zipcode z2 = new Zipcode("13656", "NY", "LaFargeville", 75.96, 44.20, 2443);
        System.out.println(z1);
        System.out.println(z2.toString()); // toString not needed

        Database db = new Database();

        System.out.println(db.findByZip("12901"));
        System.out.println(db.findByZip("hello"));

        System.out.println(db.search("13617"));
        System.out.println(db.search("43221"));

        WeatherObservation wob = db.search("13617").getWeatherData();
        System.out.println(wob);
        return;
    }
}
