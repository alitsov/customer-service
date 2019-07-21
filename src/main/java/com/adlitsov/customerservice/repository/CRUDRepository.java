package com.adlitsov.customerservice.repository;

import java.util.UUID;

/**
 * has such strange name because of conflict with spring annotation {@link org.springframework.stereotype.Repository}
 * @param <E> type of stored entity
 */
public interface CRUDRepository<E> {

    E create(E entity);

    E get(UUID id);

    E put(E entity);

    E patch(E entity);

}
