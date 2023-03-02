package enums;

public class CameraEnum {

// create enum with constants
    enum CameraAccessEnum {
        CAMERA_ID("cameraId"),
        ORCHID_ID("orchidId"),
        USER_ID("userId"),
        RULE("rule");

        private final String value;

        CameraAccessEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        // create a static method to return the enum constant
        public static CameraAccessEnum getEnum(String value) {
            for (CameraAccessEnum v : values())
                if (v.getValue().equalsIgnoreCase(value)) return v;
            throw new IllegalArgumentException();
         }
    }
}
