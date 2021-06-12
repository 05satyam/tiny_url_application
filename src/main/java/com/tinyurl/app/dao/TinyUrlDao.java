package com.tinyurl.app.dao;

import com.tinyurl.app.entity.TinyUrl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TinyUrlDao extends JpaRepository<TinyUrl,Long> {
}
