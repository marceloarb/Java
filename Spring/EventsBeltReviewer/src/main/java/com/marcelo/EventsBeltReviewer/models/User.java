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
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="users")
public class User {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	@NotNull(message="Field cannot be blank")
	private String firstname;
	@NotNull(message="Field cannot be blank")
	private String lastname;
    @Email(message="Email must be valid")
    private String email;
    @Size(min=2, message="Field must be 2 character")
    private String location;
    @NotNull(message="Field cannot be blank")
	private String state;
    @Size(min=5, message="Password must be 5 character or longer")
    private String password;
    @Transient
    private String passwordConfirmation;
    @Transient
    private boolean duplicate;
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-mm-dd")
    private Date createdAt;
    private Date updatedAt;
    
    @OneToMany(mappedBy="user", fetch = FetchType.LAZY)
    private List<Event> events;
    
    @OneToMany(mappedBy="user", fetch = FetchType.LAZY)
    private List<Message> messages;
    

    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
		name = "user_event",
		joinColumns = @JoinColumn(name = "user_id"),
		inverseJoinColumns = @JoinColumn(name = "event_id")
    		
    )
    private List<Event> user_event;
    public User() {
    	
    }
	
    
    
    
	

	



	




	public User(@NotNull(message = "Field cannot be blank") String firstname,
			@NotNull(message = "Field cannot be blank") String lastname,
			@Email(message = "Email must be valid") String email,
			@Size(min = 2, message = "Field must be 2 character") String location,
			@NotNull(message = "Field cannot be blank") String state,
			@Size(min = 5, message = "Password must be 5 character or longer") String password,
			String passwordConfirmation) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.location = location;
		this.state = state;
		this.password = password;
		this.passwordConfirmation = passwordConfirmation;
	}















	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getFirstname() {
		return firstname;
	}




	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}




	public String getLastname() {
		return lastname;
	}




	public void setLastname(String lastname) {
		this.lastname = lastname;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getLocation() {
		return location;
	}




	public void setLocation(String location) {
		this.location = location;
	}




	public String getState() {
		return state;
	}




	public void setState(String state) {
		this.state = state;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}




	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
	}




	public boolean isDuplicate() {
		return duplicate;
	}




	public void setDuplicate(boolean duplicate) {
		this.duplicate = duplicate;
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




	public List<Event> getEvents() {
		return events;
	}




	public void setEvents(List<Event> events) {
		this.events = events;
	}




	public List<Event> getUser_event() {
		return user_event;
	}




	public void setUser_event(List<Event> user_event) {
		this.user_event = user_event;
	}

	


	




	public List<Message> getMessages() {
		return messages;
	}




	public void setMessages(List<Message> messages) {
		this.messages = messages;
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