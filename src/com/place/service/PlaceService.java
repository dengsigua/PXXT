package com.place.service;

import java.util.List;

import com.place.pojo.Place;

public interface PlaceService {

	List<Place> findPlace(Place place, int index, Integer rows);

	int selectCount(Place place);

	void insertPlace(Place place);

	void updatePlaceInfo(Place place);

	void deletePlaceById(Long id);

}
