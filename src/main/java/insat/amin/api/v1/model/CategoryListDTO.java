package insat.amin.api.v1.model;

import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CategoryListDTO {
    List<CategoryDTO> categories;

	public List<CategoryDTO> getCategories() {
		return categories;
	}

	public void setCategories(List<CategoryDTO> categories) {
		this.categories = categories;
	}
    
    

}