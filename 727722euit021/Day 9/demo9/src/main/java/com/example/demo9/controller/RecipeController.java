package com.example.demo9.controller;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;

// import com.example.demo9.model.Recipe;
// import com.example.demo9.service.RecipeService;

// import java.util.List;

// @RestController
// @RequestMapping("/api/recipe")
// public class RecipeController {
//     @Autowired
//     private RecipeService recipeService;

//     @PostMapping
//     public ResponseEntity<Recipe> createRecipe(@RequestBody Recipe recipe) {
//         try {
//             Recipe savedRecipe = recipeService.addRecipe(recipe);
//             return new ResponseEntity<>(savedRecipe, HttpStatus.CREATED);
//         } catch (Exception e) {
//             return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//         }
//     }

//     @GetMapping("/byname")
//     public ResponseEntity<List<Recipe>> getRecipesByName(@RequestParam String recipeName) {
//         try {
//             List<Recipe> recipes = recipeService.getRecipesByName(recipeName);
//             return new ResponseEntity<>(recipes, HttpStatus.OK);
//         } catch (Exception e) {
//             return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//         }
//     }
    
//     @GetMapping("/{recipeId}")
//     public ResponseEntity<Recipe> getRecipeById(@PathVariable int recipeId) {
//         Recipe recipe = recipeService.getRecipeById(recipeId);
//         if (recipe != null) {
//             return new ResponseEntity<>(recipe, HttpStatus.OK);
//         } else {
//             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//         }
//     }
// }

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo9.model.Recipe;
import com.example.demo9.service.RecipeService;

@RestController
public class RecipeController
{
@Autowired
RecipeService recipeService;
@PostMapping("/api/recipe")
public ResponseEntity<?> addRecipes(@RequestBody Recipe recipe)
{
    
    return ResponseEntity.status(201).body(recipeService.addRecipes(recipe));
}
@GetMapping("/api/recipe/byname")
public ResponseEntity<?> getRecipeByName(@RequestParam String recipeName)
{
    try{
        return ResponseEntity.status(200).body(recipeService.getByName(recipeName));
    }
    catch(Exception e)
    {
        return ResponseEntity.status(500).build();
    }
}
@GetMapping("/api/recipe/{recipeId}")
public ResponseEntity<?> getRecipeById(@PathVariable int recipeId)
{
    try{
        return ResponseEntity.status(200).body(recipeService.getById(recipeId));
    }
    catch(Exception e)
    {
        return ResponseEntity.status(500).build();
    }
}


}