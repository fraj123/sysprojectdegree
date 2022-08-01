package com.packt.sysprojectdegree.user;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.packt.sysprojectdegree.activity.Activity;

@Entity
@Table(name = "users_activities")
public class UserActivity {
    
    @EmbeddedId
    private UserActivityId id = new UserActivityId();

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("userId")
    private User user;

    @ManyToOne
    @MapsId("activityId")
    private Activity activity;

    @Column(nullable = false)
    private String status;

    public UserActivity() {}

    /**
     * @param id
     * @param status
     */
    public UserActivity(UserActivityId id, String status) {
        this.id = id;
        this.status = status;
    }

    /**
     * @return the id
     */
    public UserActivityId getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(UserActivityId id) {
        this.id = id;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the activity
     */
    public Activity getActivity() {
        return activity;
    }

    /**
     * @param activity the activity to set
     */
    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "UserActivity [activity=" + activity + ", id=" + id + ", status=" + status + ", user=" + user + "]";
    }


    @Embeddable
    public static class UserActivityId implements Serializable {
        
        private static final long serialVersionUID = 1L;

        private long userId;
        private long activityId;

        public UserActivityId() {}

        public UserActivityId(long userId, long activityId) {
            super();
            this.userId = userId;
            this.activityId = activityId;
        }

        public long getUserId() {
            return userId;
        }

        public long getActivityId() {
            return activityId;
        }

        public void setUserId(long userId) {
            this.userId = userId;
        }

        public void setActivityId(long activityId) {
            this.activityId = activityId;
        }

        @Override
        public String toString(){
            return "UserActivityId{" + "userIdi=" + userId + ", activityId=" + activityId + "}";
        }

        
    }



    
}
