package insat.amin.services;

import java.util.List;

import insat.amin.api.v1.model.CategoryDTO;

public interface CategoryService {

    List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryByName(String name);
}
