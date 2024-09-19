class TemperatureDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("Temperatura Ingresada: Temperature ahora es " + temperature);
    }
}