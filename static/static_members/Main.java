public class Main {
    public static void main(String[] args) {
        // accessing non-static members
        HondaCity hondaCity = new HondaCity();
        System.out.println("Non static field a: " + hondaCity.a);
        System.out.println("Non static field b: " + hondaCity.b);

        // accessing static field and method
        System.out.println(HondaCity.price);
        HondaCity.onRoadPrice("london");
    }
}