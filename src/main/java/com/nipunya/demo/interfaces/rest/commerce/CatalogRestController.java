package com.nipunya.demo.interfaces.rest.commerce;

import com.nipunya.demo.domain.commerce.CatalogService;
import com.nipunya.demo.domain.commerce.Category;
import com.nipunya.demo.domain.commerce.Product;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/catalog")
@AllArgsConstructor
public class CatalogRestController {

    private CatalogService catalogService;

    @GetMapping("/categories")
    public List<Category> getCategories() {
        return catalogService.getCategories();
    }

    @GetMapping("/{categoryId}/products")
    public List<Product> getCateogryProducts(@PathVariable Integer categoryId) {
        return catalogService.getProductsByCategory(categoryId);
    }
}
