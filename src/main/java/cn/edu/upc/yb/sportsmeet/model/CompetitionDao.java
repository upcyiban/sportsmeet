package cn.edu.upc.yb.sportsmeet.model;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;


public interface CompetitionDao extends CrudRepository<Competition,Integer>{
    public Iterable<Competition> findAll(Sort sort);
}
