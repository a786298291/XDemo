package cool.suzi.demo.model.entity;

import java.util.Date;
import java.util.List;

/**
 * id	int
 * title	varchar
 * summary	varchar
 * cover_img	varchar
 * price	int
 * create_time	datetime
 * point	double
 */
public class Video {
    private int id;
    private String title;
    private String summary;
    private String coverImg;
    private int price;
    private Date createTime;
    private int cid;
    private  double point;
    private List<Chapter> chapter;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCover_img() {
        return coverImg;
    }

    public void setCover_img(String cover_img) {
        this.coverImg = cover_img;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getCreate_time() {
        return createTime;
    }

    public void setCreate_time(Date create_time) {
        this.createTime = create_time;
    }

    public int getC_id() {
        return cid;
    }

    public void setC_id(int c_id) {
        this.cid = c_id;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", coverImg='" + coverImg + '\'' +
                ", price=" + price +
                ", createTime=" + createTime +
                ", cid=" + cid +
                ", point=" + point +
                ", chapter=" + chapter +
                '}';
    }

    public List<Chapter> getChapter() {
        return chapter;
    }

    public void setChapter(List<Chapter> chapter) {
        this.chapter = chapter;
    }
}
