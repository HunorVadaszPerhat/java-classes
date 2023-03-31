public class HondaCity {

    // static field
    static long price = 10;
    int a, b;

    // static method
    static double onRoadPrice(String city){
        switch (city) {
            case "delhi":
                return price;
            case "london":
                return price;
            default:
                return price;
        }
    }
}
