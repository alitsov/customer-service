package com.adlitsov.customerservice.web;

import java.util.UUID;

public interface CRUDController<E> {

    E create(E entity);

    E get(UUID id);

    E put(UUID id, E entity);

    E patch(UUID id, E entity);

}
