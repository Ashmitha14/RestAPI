package com.example.demo9.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// @Entity
// @Table(name="Recipe")
// public class Recipe {
//     @Id
//     @GeneratedValue(strategy =GenerationType.IDENTITY)
//     int recipeId;
//     String title,ingredients,instructions,recipeName;
//     public Recipe(int recipeId, String title, String ingredients, String instructions, String recipeName) {
//         this.recipeId = recipeId;
//         this.title = title;
//         this.ingredients = ingredients;
//         this.instructions = instructions;
//         this.recipeName = recipeName;
//     }
//     public int getRecipeId() {
//         return recipeId;
//     }
//     public void setRecipeId(int recipeId) {
//         this.recipeId = recipeId;
//     }
//     public String getTitle() {
//         return title;
//     }
//     public void setTitle(String title) {
//         this.title = title;
//     }
//     public String getIngredients() {
//         return ingredients;
//     }
//     public void setIngredients(String ingredients) {
//         this.ingredients = ingredients;
//     }
//     public String getInstructions() {
//         return instructions;
//     }
//     public void setInstructions(String instructions) {
//         this.instructions = instructions;
//     }
//     public String getRecipeName() {
//         return recipeName;
//     }
//     public void setRecipeName(String recipeName) {
//         this.recipeName = recipeName;
//     }
    
// }

@Entity
@Table(name="recipe")
public class Recipe
{
    @Id
    int recipeId;
    String title;
    String ingredients;
    String instructions;
    String recipeName;
    public int getRecipeId() {
        return recipeId;
    }
    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getIngredients() {
        return ingredients;
    }
    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
    public String getInstructions() {
        return instructions;
    }
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
    public String getRecipeName() {
        return recipeName;
    }
    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }
    
}