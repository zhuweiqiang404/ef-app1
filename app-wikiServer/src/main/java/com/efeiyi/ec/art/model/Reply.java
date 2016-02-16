package com.efeiyi.ec.art.model;

import com.efeiyi.ec.art.organization.model.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2016/1/25.
 *
 */
@Entity
@Table(name = "app_reply")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class Reply implements Serializable{
    private String id;
    private String content;
    private User fromUser;
    private User targetUser;
    private Date createDatetime;

    @Id
    @GenericGenerator(name = "id", strategy = "com.ming800.core.p.model.M8idGenerator")
    @GeneratedValue(generator = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fromUser_id")
    public User getFromUser() {
        return fromUser;
    }

    public void setFromUser(User fromUser) {
        this.fromUser = fromUser;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "targetUser_id")
    public User getTargetUser() {
        return targetUser;
    }

    public void setTargetUser(User targetUser) {
        this.targetUser = targetUser;
    }
    @Column(name = "createDatetime")
    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }
}




