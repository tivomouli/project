package com.rovicorp.datamill.tmdb.program.controller;

import com.rovicorp.datamill.tmdb.program.service.SourceAllServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/source")

public class SourceAllController {
    @Autowired
    private SourceAllServices sourceAllServices;
    @GetMapping("/{sourceId}")
    public ResponseEntity<Map<String, List<?>>> getAllDataBySourceId(@PathVariable int sourceId) {
        Map<String, List<?>> result = new HashMap<>();

        result.put("sourceBase", sourceAllServices.getSourceBaseBySourceId(sourceId));
        result.put("ingestCopyTypeXref", sourceAllServices.getIngestCopyTypeXrefBySourceId(sourceId));
        result.put("ingestSourceDefaults", sourceAllServices.getIngestSourceDefaultsBySourceId(sourceId));
        result.put("sourceProviderXref", sourceAllServices.getSourceProviderXrefBySourceId(sourceId));
        result.put("sourceTv", sourceAllServices.getSourceTvBySourceId(sourceId));
        result.put("sourceTvProfile", sourceAllServices.getSourceTvProfileBySourceId(sourceId));

        return ResponseEntity.ok().header("Access-Control-Allow-Origin", "*").body(result);
    }
}
