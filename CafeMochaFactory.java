public class CafeMochaFactory implements CafeFactory{
    @Override
    public Cafe crearCafe() {
        return new CafeMocha();
    }   
}
