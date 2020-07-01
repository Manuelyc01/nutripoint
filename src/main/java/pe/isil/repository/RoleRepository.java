package pe.isil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.isil.model.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
