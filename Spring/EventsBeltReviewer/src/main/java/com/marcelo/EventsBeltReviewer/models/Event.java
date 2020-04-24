package com.marcelo.EventsBeltReviewer.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="events")
public class Event {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	@Size( min=2,message="Field cannot be blank")
	private String name;
	@Future
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date date;
	@NotNull(message="Field cannot be blank")
	private String state;
	@Size(min=2, message="Field must be 2 character")
    private String location;
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-mm-dd")
    private Date createdAt;
    private Date updatedAt;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
		
		name = "user_event",
		joinColumns = @JoinColumn(name = "event_id"),
		inverseJoinColumns = @JoinColumn(name = "user_id")
    		
    		
	)
    private List<User> user_event;
    
 
    
    
    public Event() {
    	
    }
    
    
    
   


    
    
	public Event(@NotNull(message = "Field cannot be blank") String name, @FutureOrPresent Date date,
			@NotNull(message = "Field cannot be blank") String state,
			@Size(min = 2, message = "Field must be 2 character") String location, User user) {
		this.name = name;
		this.date = date;
		this.state = state;
		this.location = location;
		this.user = user;
	}








	



	public Long getId() {
		return id;
	}








	public void setId(Long id) {
		this.id = id;
	}








	public String getName() {
		return name;
	}








	public void setName(String name) {
		this.name = name;
	}








	public Date getDate() {
		return date;
	}








	public void setDate(Date date) {
		this.date = date;
	}








	public String getState() {
		return state;
	}








	public void setState(String state) {
		this.state = state;
	}








	public String getLocation() {
		return location;
	}








	public void setLocation(String location) {
		this.location = location;
	}








	public Date getCreatedAt() {
		return createdAt;
	}








	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}








	public Date getUpdatedAt() {
		return updatedAt;
	}








	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}








	public User getUser() {
		return user;
	}








	public void setUser(User user) {
		this.user = user;
	}








	public List<User> getUser_event() {
		return user_event;
	}








	public void setUser_event(List<User> user_event) {
		this.user_event = user_event;
	}








	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    
    }
}
