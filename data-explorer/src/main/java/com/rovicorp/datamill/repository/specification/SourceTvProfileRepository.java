package com.rovicorp.datamill.repository.specification;

import com.rovicorp.datamill.domain.*;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SourceTvProfileRepository extends CrudRepository<SourceTvProfileEntity, Long>, JpaSpecificationExecutor<SourceTvProfileEntity> {
    @Query(value = "select * from source_tv_profile where source_id=:sourceId", nativeQuery = true )
    List<SourceTvProfileEntity> findOneBySourceId(@Param("sourceId") int sourceId);
}
