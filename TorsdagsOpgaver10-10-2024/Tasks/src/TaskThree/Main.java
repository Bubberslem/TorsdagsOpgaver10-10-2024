package TaskThree;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
Room room1 = new Room(3,3);
Room room2 = new Room(2,4);
Room room3 = new Room(4,2);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building = new Building(rooms,4);//Tested with floors lower than rooms, it gave false in IsNormal.


        System.out.println("Total lamps in building: " + countLampsInBuilding(building));
        System.out.println("Total windows in building: " + countWindowsInBuilding(building));
        System.out.println("Total rooms in building: " + countRoomsInBuilding(building));
        System.out.println("Is the building normal?: " + isNormal(building));
    }
    public static int countLampsInBuilding(Building building){
        int totalLamps = 0;
        for (Room room : building.getRooms()){
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }
    public static int countWindowsInBuilding(Building building) {
        int totalWindows = 0;
        for (Room room : building.getRooms()) {
            totalWindows += room.getNumberOfWindows();
        }
        return totalWindows;
    }
    public static int countRoomsInBuilding(Building building) {
        return building.getRooms().size();
    }
    public static boolean isNormal(Building building) {
        return building.getNumberOfFloors() >= countRoomsInBuilding(building);
    }
}
