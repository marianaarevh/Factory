public class CafeSimpleFactory implements CafeFactory{
    @Override
    public Cafe crearCafe() {
        return new CafeSimple();
    }    
}
