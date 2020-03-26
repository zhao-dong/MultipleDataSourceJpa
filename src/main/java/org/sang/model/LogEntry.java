package org.sang.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name = "APP_LOGS")
public class LogEntry {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
    private Long id;

	@Column(name = "INSTANCENAME") 
	private String instanceName;
	
	@Column(name = "HOSTNAME") 
	private String hostName;
	
	@Column(name = "THREAD") 
	private String thread;
	
	@Column(name = "THROWABLE") 
	private String throwable;
	
	@Column(name = "MESSAGE") 
	private String message;
	
	@Column(name = "LOGGER") 
	private String logger;

	@Column(name = "LEVEL") 
	private String level;

	@Column(name = "EVENT_DATE") 
	private Timestamp eventDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getInstanceName() {
		return instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getThread() {
		return thread;
	}

	public void setThread(String thread) {
		this.thread = thread;
	}

	public String getThrowable() {
		return throwable;
	}

	public void setThrowable(String throwable) {
		this.throwable = throwable;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getLogger() {
		return logger;
	}

	public void setLogger(String logger) {
		this.logger = logger;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Timestamp getEventDate() {
		return eventDate;
	}

	public void setEventDate(Timestamp eventDate) {
		this.eventDate = eventDate;
	}

	@Override
	public String toString() {
		return "LogEntry [id=" + id + ", instanceName=" + instanceName + ", hostName=" + hostName + ", thread=" + thread
				+ ", throwable=" + throwable + ", message=" + message + ", logger=" + logger + ", level=" + level
				+ ", eventDate=" + eventDate + "]";
	}
	
}
