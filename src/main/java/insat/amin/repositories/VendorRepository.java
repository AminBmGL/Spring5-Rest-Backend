package insat.amin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import insat.amin.domain.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
