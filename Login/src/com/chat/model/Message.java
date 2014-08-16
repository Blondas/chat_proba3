package com.chat.model;

// Generated Aug 16, 2014 6:32:23 PM by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Message generated by hbm2java
 */
@Entity
@Table(name = "message", catalog = "chat_ver1")
public class Message implements java.io.Serializable {

	private Integer id;
	private Message message;
	private int senderId;
	private String text;
	private Date created;
	private Set<User> users = new HashSet<User>(0);
	private Set<Message> messages = new HashSet<Message>(0);

	public Message() {
	}

	public Message(int senderId, Date created) {
		this.senderId = senderId;
		this.created = created;
	}

	public Message(Message message, int senderId, String text, Date created,
			Set<User> users, Set<Message> messages) {
		this.message = message;
		this.senderId = senderId;
		this.text = text;
		this.created = created;
		this.users = users;
		this.messages = messages;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_message_id")
	public Message getMessage() {
		return this.message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	@Column(name = "sender_id", nullable = false)
	public int getSenderId() {
		return this.senderId;
	}

	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}

	@Column(name = "text", length = 65535)
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created", nullable = false, length = 19)
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "message_receiver", catalog = "chat_ver1", joinColumns = { @JoinColumn(name = "message_id", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "receiver_id", nullable = false, updatable = false) })
	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "message")
	public Set<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(Set<Message> messages) {
		this.messages = messages;
	}

}
