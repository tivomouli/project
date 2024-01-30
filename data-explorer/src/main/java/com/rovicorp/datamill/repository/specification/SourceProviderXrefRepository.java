package com.rovicorp.datamill.repository.specification;
import com.rovicorp.datamill.domain.*;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SourceProviderXrefRepository extends CrudRepository<SourceProviderXrefEntity, Long>, JpaSpecificationExecutor<SourceProviderXrefEntity> {
    @Query(value = "select * from source_provider_xref where source_id=:sourceId", nativeQuery = true )
    List<SourceProviderXrefEntity> findOneBySourceId(@Param("sourceId") int sourceId);
}
