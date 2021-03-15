package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.h2.dto.Fabricante;

/**
 * @author Jose
 *
 */
public interface IFabricanteDAO extends JpaRepository<Fabricante, Long>{

}
