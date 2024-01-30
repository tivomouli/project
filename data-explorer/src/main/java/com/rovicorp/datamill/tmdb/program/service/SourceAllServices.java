package com.rovicorp.datamill.tmdb.program.service;

import com.rovicorp.datamill.domain.*;
import com.rovicorp.datamill.repository.specification.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SourceAllServices {

    private static final Logger logger = LoggerFactory.getLogger(SourceAllServices.class);

    @Autowired
    SourceBaseRepository sourceBaseRepository;

    @Autowired
    IngestCopyTypeXrefRepository ingestCopyTypeXrefRepository;

    @Autowired
    IngestSourceDefaultsRepository ingestSourceDefaultsRepository;

    @Autowired
    SourceProviderXrefRepository sourceProviderXrefRepository;

    @Autowired
    SourceTvRepository sourceTvRepository;

    @Autowired
    SourceTvProfileRepository sourceTvProfileRepository;
public List<SourceBaseEntity> getSourceBaseBySourceId(int sourceId) {
    return sourceBaseRepository.findOneBySourceId(sourceId);
}
    public List<IngestCopyTypeXrefEntity> getIngestCopyTypeXrefBySourceId(int sourceId) {
        return ingestCopyTypeXrefRepository.findOneBySourceId(sourceId);
    }

    public List<IngestSourceDefaultsEntity> getIngestSourceDefaultsBySourceId(int sourceId) {
        return ingestSourceDefaultsRepository.findOneBySourceId(sourceId);
    }

    public List<SourceProviderXrefEntity> getSourceProviderXrefBySourceId(int sourceId) {
        return sourceProviderXrefRepository.findOneBySourceId(sourceId);
    }

    public List<SourceTvEntity> getSourceTvBySourceId(int sourceId) {
        return sourceTvRepository.findOneBySourceId(sourceId);
    }

    public List<SourceTvProfileEntity> getSourceTvProfileBySourceId(int sourceId) {
        return sourceTvProfileRepository.findOneBySourceId(sourceId);
    }
}