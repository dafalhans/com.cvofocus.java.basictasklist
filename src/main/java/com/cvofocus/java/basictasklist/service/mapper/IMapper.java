package com.cvofocus.java.basictasklist.service.mapper;

import java.util.ArrayList;
import java.util.List;

public interface IMapper<E,D>{

    public E toEntity(D d);
    public D toDTO(E e);

    default List<E> toEntity(List<D> ds) {
        List<E> result = new ArrayList<>();
        ds.forEach(d -> result.add(toEntity(d)));
        return result;
    }

    default List<D> toDTO(List<E> es) {
        List<D> result = new ArrayList<>();
        es.forEach(e -> result.add(toDTO(e)));
        return result;
    }

}
