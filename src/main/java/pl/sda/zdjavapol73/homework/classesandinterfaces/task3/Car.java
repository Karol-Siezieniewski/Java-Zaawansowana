package pl.sda.zdjavapol73.homework.classesandinterfaces.task3;

public class Car {

    private String model;
    private String type;
    private Engine engine;

    public Car(String model, String type) {
        this.model = model;
        this.type = type;
        engine = new Engine();
        this.engine.setEngine(this.type);
    }

    public String getModel() {
        return model;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public String getType() {
        return type;
    }

    public Car setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", engine=" + engine +
                '}';
    }

    class Engine{
        private String engineType;

        public void setEngine(String type){
            switch (type){
                case "economy" :
                    engineType = "diesel";
                    break;
                case "luxury" :
                    engineType = "electric";
                    break;
                default:
                    engineType = "petrol";
                    break;
            }
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "engineType='" + engineType + '\'' +
                    '}';
        }
    }
}

