package enums;

import pojos.CameraAccess;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {

        // create a new cameraAccess object
        CameraAccess cameraAccess = new CameraAccess("camera1", "orchid1", "user1", "rule1");

        // create and populate a list of strings
        List<String> stringList = List.of("camera1", "orchid1", "user1", "rule1");

        // create a map of cameraAccess and stringList
        Map<CameraAccess, List<String>> map = new HashMap<>();

        // populate the map
        map.put(cameraAccess, stringList);

        // get the first key.  CSB has researched it and this looks like the best way to get the first key.
        CameraAccess key = map.keySet().stream().findFirst().get();
        int mapSize = map.size();

        // print the key
        System.out.println("Key: " + key);


    }

}
