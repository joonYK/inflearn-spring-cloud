package jy.study.inflearn.springcloud.catalogservice.service;

import jy.study.inflearn.springcloud.catalogservice.entity.CatalogEntity;

public interface CatalogService {

    Iterable<CatalogEntity> getAllCatalogs();

}
