package pojos;

public class CameraAccess {
    private String cameraId;
    private String orchidId;
    private String userId;
    private String rule;

    public CameraAccess(String cameraId, String orchidId, String userId, String rule) {
        this.cameraId = cameraId;
        this.orchidId = orchidId;
        this.userId = userId;
        this.rule = rule;
    }

    // Getters and Setters for the fields
    public String getCameraId() {
        return cameraId;
    }

    public void setCameraId(String cameraId) {
        this.cameraId = cameraId;
    }

    public String getOrchidId() {
        return orchidId;
    }

    public void setOrchidId(String orchidId) {
        this.orchidId = orchidId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    @Override
    public String toString() {
        return "CameraAccess{" + "cameraId=" + cameraId + ", orchidId=" + orchidId + ", userId=" + userId + ", rule=" + rule + '}';
    }
}
