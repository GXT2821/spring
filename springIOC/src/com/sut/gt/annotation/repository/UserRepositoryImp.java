package com.sut.gt.annotation.repository;

import org.springframework.stereotype.Repository;

@Repository("userRepository")
public class UserRepositoryImp implements UserRepository {

	@Override
	public void save() {
		System.out.println("UserRepository Save...");

	}

}
