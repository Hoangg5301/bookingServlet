package booking.service.Impl;

import javax.inject.Inject;

import booking.dao.ICategoryTouristDAO;
import booking.entity.CategoryTouristEntity;
import booking.service.ICategoryTouristService;

public class CategoryTouristService implements ICategoryTouristService{

	@Inject
	private ICategoryTouristDAO categoryTouristDAO;
	@Override
	public CategoryTouristEntity getAll() {

		return null;
	}

}
