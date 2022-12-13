package ZipCodeDB;

public class Main {

    public static void main(String[] args) {
        Zipcode z1 = new Zipcode("05477", "VT", "Richmond", 72.993256, 44.399846, 3758);

        //System.out.println(z1);

        Zipcode z2 = new Zipcode("05482","VT","Shelburne",73.217124,44.389967,5871);

        //System.out.println(z2);

        DataBase db = new DataBase();


        //System.out.println(db.findByZip("03445"));

        //System.out.println(db.search("43221"));

        WeatherObservation wob = db.search("05477").getWeatherData();

        System.out.println(wob);

        return;

    }
}
