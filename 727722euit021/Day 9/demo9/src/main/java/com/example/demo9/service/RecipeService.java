package com.example.demo9.service;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.example.demo9.model.Recipe;
// import com.example.demo9.repository.RecipeRepo;

// import java.util.List;

// @Service
// public class RecipeService {
//     @Autowired
//     private RecipeRepo recipeRepo;

//     public Recipe addRecipe(Recipe recipe) {
//         return recipeRepo.save(recipe);
//     }

//     public List<Recipe> getRecipesByName(String recipeName) {
//         return recipeRepo.findByRecipeName(recipeName);
//     }

//     public Recipe getRecipeById(int recipeId) {
//         return recipeRepo.findById(recipeId).orElse(null);
//     }
// }
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo9.model.Recipe;
import com.example.demo9.repository.RecipeRepo;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeService
{
    @Autowired
    RecipeRepo recipeRepo;
    public Recipe addRecipes(Recipe recipe)
    {
        return recipeRepo.save(recipe);
    }
    public List<Recipe> getByName(String recipeName)
    {
        return recipeRepo.findByRecipeName(recipeName);
    }
    public Optional<Recipe> getById(int recipeId)
    {
        return recipeRepo.findById(recipeId);
    }
}