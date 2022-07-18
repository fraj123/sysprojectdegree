package com.packt.sysprojectdegree;

import com.packt.sysprojectdegree.user.User;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import nl.jqno.equalsverifier.EqualsVerifier;

@SpringBootTest
class SysprojectdegreeApplicationTests {

	@Test
	void contextLoads() {
	}

    @Test
    public void equalsHashCodeContracts() {
        EqualsVerifier.forClass(User.class).verify();
        
    }

}
