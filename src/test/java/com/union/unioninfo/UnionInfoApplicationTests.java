package com.union.unioninfo;

import com.union.unioninfo.dao.UserDao;
import com.union.unioninfo.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UnionInfoApplicationTests {
	@Autowired
	private UserDao userDao;
	@Test
	public void testDao() {
		UserEntity userEntity = userDao.selectByPrimaryKey(3);
		System.out.println(userEntity.toString());
	}

}
