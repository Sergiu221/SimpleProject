package com.sergiu.lofo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.sergiu.lofo.entity.view.AddViewEntity;

@Repository
public class AddRepositoryImp implements AddRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<AddViewEntity> getAddViews() {
		String hql = "FROM AddViewEntity as view ORDER BY view.date";
		List<AddViewEntity> resultList = entityManager.createQuery(hql).getResultList();
		return resultList;
	}

}
