public class CafeConLecheFactory implements CafeFactory {
    @Override
    public Cafe crearCafe() {
        return new CafeConLeche();
    }   
}
