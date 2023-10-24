public class CafeCarameloFactory implements CafeFactory{
    @Override
    public Cafe crearCafe() {
        return new CafeCaramelo();
    }   
}
