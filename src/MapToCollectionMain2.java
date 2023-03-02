import pojos.CameraAccess;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToCollectionMain2 {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Map<String, List<CameraAccess>> map = new HashMap<>();

        // populate the map with some data
        map.put("key1", List.of(new CameraAccess("camera1", "orchid1", "user1", "rule1")));
        map.put("key2", List.of(new CameraAccess("camera2", "orchid2", "user2", "rule2")));
        map.put("key3", List.of(new CameraAccess("camera3", "orchid3", "user3", "rule3")));

        // get the key object
        String key = map.keySet().stream().findFirst().get();
        System.out.println("Key: " + key);


        // copy the list of cameraAccess objects into a new list
        List<CameraAccess> cameraAccessList = map.values().stream()
                .flatMap(Collection::stream)
                .toList();

        // print the list
        cameraAccessList.forEach(cameraAccess -> {
            System.out.println("CameraAccess: " + cameraAccess.getRule());
        });

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // copy the list of cameraAccess objects into a new list using getRule()
        List<String> cameraAccessList2 = map.values().stream()
                .flatMap(Collection::stream)
                .map(CameraAccess::getRule)
                .toList();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // copy the list of cameraAccess objects into a new collection using getRule()
        Collection<String> cameraAccessCollection = map.values().stream()
                .flatMap(Collection::stream)
                .map(CameraAccess::getRule)
                .collect(Collectors.toList());

    }


}