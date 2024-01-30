package com.rovicorp.datamill.repository.specification;

import com.rovicorp.datamill.domain.*;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngestSourceDefaultsRepository extends CrudRepository<IngestSourceDefaultsEntity, Long>, JpaSpecificationExecutor<IngestSourceDefaultsEntity> {

    @Query(value = "select * from ingest_source_defaults where source_id=:sourceId", nativeQuery = true)
    List<IngestSourceDefaultsEntity> findOneBySourceId(@Param("sourceId") int sourceId);
}
