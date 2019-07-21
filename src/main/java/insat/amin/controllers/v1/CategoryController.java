package insat.amin.controllers.v1;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import insat.amin.api.v1.model.CategoryDTO;
import insat.amin.api.v1.model.CategoryListDTO;
import insat.amin.services.CategoryService;

@RestController
@RequestMapping(CategoryController.BASE_URL)
public class CategoryController {

    public static final String BASE_URL = "/api/v1/categories";

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public CategoryListDTO getallCatetories(){
        return new CategoryListDTO(categoryService.getAllCategories());
    }

    @GetMapping("{name}")
    @ResponseStatus(HttpStatus.OK)
    public CategoryDTO getCategoryByName(@PathVariable String name){
        return categoryService.getCategoryByName(name);
    }
}
//@Controller
//@RequestMapping(CategoryController.BASE_URL)
//public class CategoryController {
//
//    public static final String BASE_URL = "/api/v1/categories";
//
//    private final CategoryService categoryService;
//
//    public CategoryController(CategoryService categoryService) {
//        this.categoryService = categoryService;
//    }
//
//    @GetMapping
//    public ResponseEntity<CategoryListDTO> getAllCategories(){
//
//        return new ResponseEntity<CategoryListDTO>(
//                new CategoryListDTO(categoryService.getAllCategories()), HttpStatus.OK);
//    }
//
//    @GetMapping("{name}")
//    public ResponseEntity<CategoryDTO> getCategoryByName( @PathVariable String name){
//        return new ResponseEntity<CategoryDTO>(
//                categoryService.getCategoryByName(name), HttpStatus.OK
//        );
//        
//    }
//}
