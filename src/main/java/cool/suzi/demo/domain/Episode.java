package cool.suzi.demo.domain;

/**
 *  -节-
 * id	int
 * title	varchar
 * num	int
 * ordered	int
 * play_url	varchar
 * chapter_id	int
 * free	tinyint
 * video_id	int
 * create_time	datetime
 */

public class Episode {
    private Integer id;
    private  String title;
    private  Integer num;
    private Integer ordered;
    private String playUrl;
    private Integer free;
    private Integer videoId;
    private String createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getOrdered() {
        return ordered;
    }

    public void setOrdered(Integer ordered) {
        this.ordered = ordered;
    }

    public String getPlayUrl() {
        return playUrl;
    }

    public void setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
    }

    public Integer getFree() {
        return free;
    }

    public void setFree(Integer free) {
        this.free = free;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "episode{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", num=" + num +
                ", ordered=" + ordered +
                ", playUrl='" + playUrl + '\'' +
                ", free=" + free +
                ", videoId=" + videoId +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
