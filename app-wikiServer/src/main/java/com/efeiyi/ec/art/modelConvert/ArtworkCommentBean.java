package com.efeiyi.ec.art.modelConvert;

import com.efeiyi.ec.art.model.Artwork;
import com.efeiyi.ec.art.model.ArtworkComment;
import com.efeiyi.ec.art.organization.model.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/1/25.
 *
 */
public class ArtworkCommentBean  {

    private String id;
    private Artwork artwork;
    private String content;
    private User creator;
    private Date createDatetime;
    private String status;
    private String isWatch;
    private FatherArtworkCommentBean fatherArtworkCommentBean;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Artwork getArtwork() {
        return artwork;
    }

    public void setArtwork(Artwork artwork) {
        this.artwork = artwork;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsWatch() {
        return isWatch;
    }

    public void setIsWatch(String isWatch) {
        this.isWatch = isWatch;
    }

    public FatherArtworkCommentBean getFatherArtworkCommentBean() {
        return fatherArtworkCommentBean;
    }

    public void setFatherArtworkCommentBean(FatherArtworkCommentBean fatherArtworkCommentBean) {
        this.fatherArtworkCommentBean = fatherArtworkCommentBean;
    }
}
