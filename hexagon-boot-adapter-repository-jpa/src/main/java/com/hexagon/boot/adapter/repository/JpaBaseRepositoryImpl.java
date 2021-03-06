package com.hexagon.boot.adapter.repository;

import com.hexagon.boot.domain.BaseEntity;
import com.hexagon.boot.domain.BaseRepository;
import com.hexagon.boot.domain.feedback.model.FeedBackEntity;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class JpaBaseRepositoryImpl<E extends BaseEntity, D extends E> implements BaseRepository<E> {
    protected JpaBaseRepositoryFacade<D, Long> jpaCrudRepository;

    protected abstract D translateDao(E entity);
    protected abstract E translateEntity(D dao);

    @Override
    public E insert(E entity) {
        return jpaCrudRepository.save(translateDao(entity));
    }
    @Override
    public E update(E entity) {
        return jpaCrudRepository.save(translateDao(entity));
    }
    @Override
    public E write(E entity) {
        return jpaCrudRepository.save(translateDao(entity));
    }

    @Override
    public List<E> insertAll(List<E> var1) {
        List<E> target = new ArrayList<>();
        jpaCrudRepository.saveAll(var1.stream()
                .map(this::translateDao)
                .collect(Collectors.toList()))
                .forEach(target::add);
        return target;
    }

    @Override
    public void deleteAll(List<E> deleteList) {
        jpaCrudRepository.deleteAll(deleteList.stream()
                .map(this::translateDao)
                .collect(Collectors.toList()));
    }

    @Override
    public void delete(E entity) {
        jpaCrudRepository.delete(translateDao(entity));
    }

    @Override
    public E findById(Long id) {
        return jpaCrudRepository.findById(id).orElse(null);
    }

    @Override
    public boolean existsById(Long id) {
        return jpaCrudRepository.existsById(id);
    }

    @Override
    public List<E> findAll() {
        List<E> target = new ArrayList<>();
        jpaCrudRepository.findAll().forEach(target::add);
        return target;
    }

    @Override
    public List<E> findAllByIds(List<Long> ids) {
        List<E> target = new ArrayList<>();
        jpaCrudRepository.findAllById(ids).forEach(target::add);
        return target;
    }

    @Override
    public long count() {
        return jpaCrudRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        jpaCrudRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        jpaCrudRepository.deleteAll();
    }


    @Override
    public E findByParam(Map<String, Object> params) {
        return null;
    }

    @Override
    public List<E> findPage(Map<String, Object> params, Integer pageNum, Integer pageSize, String order) {
        return null;
    }
}
