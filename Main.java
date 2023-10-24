public class Main {
        public static void main(String[] args){

        CafeFactory factory = new CafeSimpleFactory();
        Cafe cafe = factory.crearCafe();
        System.out.println(cafe.getDescripcion() + " - Precio: $" + cafe.getCosto());

        factory = new CafeConLecheFactory();
        cafe = factory.crearCafe();
        System.out.println(cafe.getDescripcion() + " - Precio: $" + cafe.getCosto());

        factory = new CafeMochaFactory();
        cafe = factory.crearCafe();
        System.out.println(cafe.getDescripcion() + " - Precio: $" + cafe.getCosto());

        factory = new CafeCarameloFactory();
        cafe = factory.crearCafe();
        System.out.println(cafe.getDescripcion() + " - Precio: $" + cafe.getCosto());
    }
}
