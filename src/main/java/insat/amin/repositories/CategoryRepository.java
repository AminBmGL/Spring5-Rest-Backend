package insat.amin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import insat.amin.domain.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
    
	Category findByName(String name);

}
