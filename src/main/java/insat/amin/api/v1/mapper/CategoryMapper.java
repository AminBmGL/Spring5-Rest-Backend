package insat.amin.api.v1.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import insat.amin.api.v1.model.CategoryDTO;
import insat.amin.domain.Category;

@Mapper
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);
    
    CategoryDTO categoryToCategoryDTO(Category category);
}
