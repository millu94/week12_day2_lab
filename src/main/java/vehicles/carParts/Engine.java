package vehicles.carParts;

public class Engine {

    private int ccLevel;
    private EngineType engineType;

    public Engine (int ccLevel, EngineType engineType){
        this.ccLevel = ccLevel;
        this.engineType = engineType;
    }

    public int getCcLevel() {
        return ccLevel;
    }

    public EngineType getEngineType() {
        return engineType;
    }
}
