package com.sist.web.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sist.web.entity.VideoEntity;
@Repository
public interface VideoDAO extends JpaRepository<VideoEntity, Integer>{
	@Query(value="SELECT * FROM video "
			+ "ORDER BY cno ASC "
			+ "LIMIT :start,12",nativeQuery = true)
	public List<VideoEntity> videoListData(@Param("start") Integer start);
	
	@Query(value = "SELECT CEIL(COUNT(*)/12.0) FROM video")
	public int videoTotalPage();
}
