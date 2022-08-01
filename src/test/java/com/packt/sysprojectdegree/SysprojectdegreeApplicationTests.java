package com.packt.sysprojectdegree;

import com.packt.sysprojectdegree.role.Role;
import com.packt.sysprojectdegree.user.User;
import com.packt.sysprojectdegree.activity.Activity;

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

        EqualsVerifier.forClass(User.class)
            .withIgnoredFields("roles")
            .withPrefabValues(Role.class, new Role("Estudiante"), new Role("Docente"))
            .verify();
        EqualsVerifier.forClass(Role.class)
            .withIgnoredFields("users")
            .withPrefabValues(User.class, new User("franz.mejia", "Franz", "Mejia", "mejiafranz@email.com", 12345678, "path-to-avatar"), new User("julio.cori", "Julio", "Cori", "corijulio@email.com", 23456789, "path-to-avatar"))
            .verify();
        EqualsVerifier.forClass(Activity.class).verify();

    }

}

