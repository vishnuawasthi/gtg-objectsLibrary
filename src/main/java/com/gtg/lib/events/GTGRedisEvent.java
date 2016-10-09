package com.gtg.lib.events;

import java.io.Serializable;
import java.util.List;

import com.gtg.lib.dto.UserDTO;

public class GTGRedisEvent implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserDTO userDTO;
	private List<UserDTO> users;

	public UserDTO getUserDTO() {
		return userDTO;
	}

	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}

	

	public List<UserDTO> getUsers() {
		return users;
	}

	public void setUsers(List<UserDTO> users) {
		this.users = users;
	}

}
