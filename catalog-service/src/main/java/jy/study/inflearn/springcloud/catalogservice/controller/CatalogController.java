package jy.study.inflearn.springcloud.catalogservice.controller;

import jy.study.inflearn.springcloud.catalogservice.entity.CatalogEntity;
import jy.study.inflearn.springcloud.catalogservice.service.CatalogService;
import jy.study.inflearn.springcloud.catalogservice.vo.ResponseCatalog;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/catalogs")
@RequiredArgsConstructor
public class CatalogController {

    private final CatalogService catalogService;

    private final ModelMapper mapper;

    @GetMapping
    public ResponseEntity<List<ResponseCatalog>> getCatalogs() {
        Iterable<CatalogEntity> catalogs = catalogService.getAllCatalogs();

        List<ResponseCatalog> result = new ArrayList<>();
        for (CatalogEntity catalogEntity : catalogs) {
            result.add(mapper.map(catalogEntity, ResponseCatalog.class));
        }

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
