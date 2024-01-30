package com.rovicorp.datamill.repository.specification;

import com.rovicorp.datamill.domain.*;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IngestCopyTypeXrefRepository extends CrudRepository<IngestCopyTypeXrefEntity, Long>, JpaSpecificationExecutor<IngestCopyTypeXrefEntity> {

    @Query(value = "select * from ingest_copy_type_xref where source_id=:sourceId", nativeQuery = true )
    List<IngestCopyTypeXrefEntity> findOneBySourceId(@Param("sourceId") int sourceId);

}