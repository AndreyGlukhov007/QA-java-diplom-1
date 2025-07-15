import org.junit.jupiter.api.Test;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BurgerTest {

    @Test
    public void testBurgerMethodRemoveIngredient(){
        Burger burger = new Burger();
        Bun bun = new Bun("Тестовая строка 1", 123.00F);
        burger.setBuns(bun);
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Тестовая строка 2", 321.00F);
        burger.addIngredient(ingredient);
        burger.removeIngredient(0);
    }

    @Test
    public void testBurgerMethodMoveIngredient(){
        Burger burger = new Burger();
        Bun bun = new Bun("Тестовая строка 1", 123.00F);
        burger.setBuns(bun);
        Ingredient ingredient1 = new Ingredient(IngredientType.SAUCE, "Тестовая строка 2", 321.00F);
        Ingredient ingredient2 = new Ingredient(IngredientType.SAUCE, "Тестовая строка 2", 321.00F);
        burger.addIngredient(ingredient1);
        burger.addIngredient(ingredient2);
        burger.moveIngredient(0, 1);
    }

    @Test
    public void testBurgerMethodGetPrice(){
        Burger burger = new Burger();
        Bun bun = new Bun("Тестовый бургер 1", 200.00F);
        burger.setBuns(bun);
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Тестовая строка", 100.00F);
        burger.addIngredient(ingredient);
        Float priceTest = burger.getPrice();
        assertEquals(500, priceTest);
    }

    @Test
    public void testBurgerMethodGetReceipt(){
        Burger burger = new Burger();
        Bun bun = new Bun("Тестовая строка 1", 123.00F);
        burger.setBuns(bun);
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Тестовая строка 2", 321.00F);
        burger.addIngredient(ingredient);
        burger.getReceipt();
    }

}
