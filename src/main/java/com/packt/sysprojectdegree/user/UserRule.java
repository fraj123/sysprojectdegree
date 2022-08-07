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


import com.packt.sysprojectdegree.rule.Rule;

@Entity
@Table(name = "users_rules")
public class UserRule {

	@EmbeddedId
	private UserRuleId id = new UserRuleId();
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("userId")
	private User user;
	
	@ManyToOne
	@MapsId("ruleId")
	private Rule rule;
	
	@Column(nullable = false)
	private String VoBo;
	
	public UserRule() {}
	
	public UserRule(UserRuleId id, String voBo) {
		super();
		this.id = id;
	
		VoBo = voBo;
	}


	

	public UserRuleId getId() {
		return id;
	}

	public void setId(UserRuleId id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Rule getRule() {
		return rule;
	}

	public void setRule(Rule rule) {
		this.rule = rule;
	}

	public String getVoBo() {
		return VoBo;
	}

	public void setVoBo(String voBo) {
		VoBo = voBo;
	}




	@Embeddable
    public static class UserRuleId implements Serializable {
        
        private static final long serialVersionUID = 1L;

        private long userId;
        private long ruleId;

        public UserRuleId() {}

        public UserRuleId(long userId, long activityId) {
            super();
            this.userId = userId;
            this.ruleId = activityId;
        }

        public long getUserId() {
            return userId;
        }

        public long getRuleId() {
            return ruleId;
        }

        public void setUserId(long userId) {
            this.userId = userId;
        }

        public void setActivityId(long ruleId) {
            this.ruleId = ruleId;
        }

        @Override
        public String toString(){
            return "UserRuleId{" + "userIdi=" + userId + ", ruleId=" + ruleId + "}";
     
        }
	
	}
        
}
