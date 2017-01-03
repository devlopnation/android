package imagestudio.devlopnation.com.imagestudio;

/**
 * Created by asus on 1/2/2017.
 */

public class Album {
    String id;
    Long coverID;
    public int count;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCoverID() {
        return coverID;
    }

    public void setCoverID(Long coverID) {
        this.coverID = coverID;
    }

    String name;
}
