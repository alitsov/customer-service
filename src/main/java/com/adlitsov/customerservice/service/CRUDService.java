package com.adlitsov.customerservice.service;

import java.util.UUID;

/**
 * has such strange name because of conflict with spring annotation {@link org.springframework.stereotype.Repository}
 * @param <E> type of stored entity
 */
public interface CRUDService<E> {

    E create(E entity);

    E get(UUID id);

    E put(E entity);

    E patch(E entity);

}
