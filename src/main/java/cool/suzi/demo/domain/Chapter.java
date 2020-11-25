package cool.suzi.demo.domain;

import java.util.Date;

/**
 *   -章-
 * 数据库字段
 * id	int
 * video_id	int
 * title	varchar
 * ordered	int
 * create_time	datetime
 */
public class Chapter {
    private Integer id;
    private Integer videoId;
    private String title;
    private Integer ordered; //订单数量
    private Date createTime;  //创建时间
    private Episode episode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getOrdered() {
        return ordered;
    }

    public void setOrdered(Integer ordered) {
        this.ordered = ordered;
    }

    public Date getDatetime() {
        return createTime;
    }

    public void setDatetime(Date datetime) {
        this.createTime = datetime;
    }

    public Episode getEpisode() {
        return episode;
    }

    public void setEpisode(Episode episode) {
        this.episode = episode;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "id=" + id +
                ", videoId=" + videoId +
                ", title='" + title + '\'' +
                ", ordered=" + ordered +
                ", datetime=" + createTime +
                ", episode=" + episode +
                '}';
    }
}
