package com.tinyurl.app.dao.impl;

import com.tinyurl.app.dao.TinyUrlDao;
import com.tinyurl.app.entity.TinyUrl;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Repository
public class TinyUrlDaoImpl implements TinyUrlDao {
    @Override
    public List<TinyUrl> findAll() {
        return null;
    }

    @Override
    public List<TinyUrl> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<TinyUrl> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<TinyUrl> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(TinyUrl tinyUrl) {

    }

    @Override
    public void deleteAll(Iterable<? extends TinyUrl> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends TinyUrl> S save(S s) {
        return null;
    }

    @Override
    public <S extends TinyUrl> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<TinyUrl> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends TinyUrl> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<TinyUrl> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public TinyUrl getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends TinyUrl> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends TinyUrl> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends TinyUrl> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends TinyUrl> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends TinyUrl> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends TinyUrl> boolean exists(Example<S> example) {
        return false;
    }
}
