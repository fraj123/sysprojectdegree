package com.packt.sysprojectdegree;

import com.packt.sysprojectdegree.role.Role;
import com.packt.sysprojectdegree.user.User;

//import java.time.Instant;
//import java.time.LocalDateTime;

import com.packt.sysprojectdegree.activity.activity;
import com.packt.sysprojectdegree.cronograma.Cronograma;
import com.packt.sysprojectdegree.project.Project;

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

        EqualsVerifier.forClass(Project.class)
            .withIgnoredFields("cronogramas")
            //.withPrefabValues(Cronograma.class, new Cronograma("perfil", 5, Instant.now()), new Cronograma("borrador", 9, Instant.now()))
            .withPrefabValues(Project.class, new Project("perfil"), new Project("borrador"))
            .verify();

        EqualsVerifier.forClass(Cronograma.class)
            .withIgnoredFields("project")
            .withPrefabValues(Project.class, new Project("perfil"), new Project("borrador"))
            .verify();

        EqualsVerifier.forClass(activity.class).verify();

    }

}

