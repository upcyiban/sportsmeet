package cn.edu.upc.yb.sportsmeet.model;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by 易班技术开发部 on 2016/5/18.
 */
public interface CompetitionDao extends CrudRepository<Competition,Integer>{
    public Iterable<Competition> findAll(Sort sort);
}
