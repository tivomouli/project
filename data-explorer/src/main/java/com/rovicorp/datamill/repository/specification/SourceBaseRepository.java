package com.rovicorp.datamill.repository.specification;

import com.rovicorp.datamill.domain.*;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SourceBaseRepository extends CrudRepository<SourceBaseEntity, Long>, JpaSpecificationExecutor<SourceBaseEntity> {
    @Query(value = "select * from source_base where source_id=:sourceId", nativeQuery = true )
    List<SourceBaseEntity> findOneBySourceId(@Param("sourceId") int sourceId);
}
