package com.app.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.core.pojos.Package;

public interface PackageRepository extends JpaRepository<Package, Integer> {

}
