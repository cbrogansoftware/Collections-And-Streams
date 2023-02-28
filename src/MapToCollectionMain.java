import pojos.CameraAccess;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapToCollectionMain {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Map<String, List<CameraAccess>> map = new HashMap<>();

        // populate the map with some data
        map.put("key1", List.of(new CameraAccess("camera1", "orchid1", "user1", "rule1")));
        map.put("key2", List.of(new CameraAccess("camera2", "orchid2", "user2", "rule2")));
        map.put("key3", List.of(new CameraAccess("camera3", "orchid3", "user3", "rule3")));


        map.keySet().forEach(key -> {
            System.out.println("Key: " + key);
            map.get(key).forEach(cameraAccess -> {
                System.out.println("Map CameraAccess: " + cameraAccess.getRule());
            });
        });
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Collection<List<CameraAccess>> values = map.values();

        values.forEach(list -> {
            list.forEach(cameraAccess -> {
                System.out.println("Coll CameraAccess: " + cameraAccess.getRule());
            });
        });

    }
}