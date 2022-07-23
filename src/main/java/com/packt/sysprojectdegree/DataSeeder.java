package com.packt.sysprojectdegree;

import java.util.HashSet;
import java.util.Set;

import com.packt.sysprojectdegree.role.Role;
import com.packt.sysprojectdegree.role.RoleRepository;
import com.packt.sysprojectdegree.user.User;
import com.packt.sysprojectdegree.user.UserRepository;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder implements ApplicationListener<ContextRefreshedEvent> {

    private final UserRepository userRepository;

    private final RoleRepository roleRepository;

    /**
     * @param userRepository
     * @param roleRepository
     */
    public DataSeeder(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        Role role1 = new Role("Adminitrator");
        Role role2 = new Role("Student");
        
        Role createdRole1 = roleRepository.save(role1);
        Role createdRole2 = roleRepository.save(role2);

        User user = new User("admin", "Admin", "Admin", "admin@email.com", 73024245, "path-to-avatar");
        
        Set<Role> roles = new HashSet<>();
        roles.add(createdRole1);
        roles.add(createdRole2);

        user.setRoles(roles);

        User createdUser = userRepository.save(user);

        createdUser.getRoles().forEach(System.out::println);

    }



} 
