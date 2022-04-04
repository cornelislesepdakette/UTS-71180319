public class Main {
    public static void main(String[] args) {
        Engine dieselEngine = new Engine("solar", 3500);
        Transmission manualTransmission = new Transmision("Manual", 6);
        Tire trailTire = new Tire("Traill", 309, 70, 20);
        Wheel truckWheel = new Wheel(8, 18);
        Truck truckMino = new Truck(dieselEngine, manualTransmision, trailTire, truckWheel, 4500);
        truckMino.setVehicleName("HINO DUTRO CARGO 110 SD");
        system.out.printn("Nama Kendaraan : "+ truckMino.getVehicleName());
        system.out.printn("CC mesin : "+ truckMino.getEngine().getCapacity());
        system.out.printn("Tipe transmisi: "+ truckMino.getTransmition().getTransType());
        system.out.printn("Tipe ban : "+ truckMino.getTire().getTiretype());
        system.out.printn("Diameter Roda : R"+truckMino.getWheel().getDiameter());

    }
}
