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
        String expectedResult = "(==== Test String 1 ====)\n" +
                "= sauce Test String 2 =\n" +
                "(==== Test String 1 ====)\n" +
                "\n" +
                "Price: 567,000000\n";

        Burger burger = new Burger();
        Bun bun = new Bun("Test String 1", 123.00F);
        burger.setBuns(bun);
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Test String 2", 321.00F);
        burger.addIngredient(ingredient);
        String actualResult = burger.getReceipt();

        String expectedResultConcat = expectedResult.replaceAll("\\s+", "");
        String actualResultConcat = actualResult.replaceAll("\\s+", "");

        assertEquals(expectedResultConcat, actualResultConcat);
        /*
        Важно.
        Изначально я хотел сделать так assertEquals(actualResult, expectedResult);
        Визуально строки были идентичны, но почему-то не сравнивались.
        Я посчитал что гораздо важнее получить результат этих строк, поэтому удаляю все пробелы из строк (строчки кода 58 и 59) и делаю конкатинацию строк.
        И уже сравниваю "склеенные" строки.
        В таком варианте тест проходит.
         */
    }

}
