package com.app.core.service;

import com.app.core.dto.SignUpRequest;
import com.app.core.dto.UserResponse;

public interface IUserService {
	UserResponse registerUser(SignUpRequest request);
}
