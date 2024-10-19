package LearnSolid.Liskov;

public class Car extends EngineVehicle{
    @Override
    public Integer getNumberOfWeels() {
        return 4;
    }
}
