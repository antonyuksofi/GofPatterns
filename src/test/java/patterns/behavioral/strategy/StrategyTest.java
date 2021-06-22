package patterns.behavioral.strategy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StrategyTest {

    private static final String SUN = "sun";
    private static final String COAT = "coat";

    @Test
    public void testPresenceOfAnyClothWithSunSubstringForHotWeather() {
        // given
        Context context = new Context(30, true);

        // when
        List<String> clothesForWeather = context.selectClothes();

        // then
        assertTrue(clothesForWeather.stream()
                .anyMatch(s -> s.contains(SUN)));
    }

    @Test
    public void testPresenceOfCoatForColdWeather() {
        // given
        Context context = new Context();
        context.setStrategy(new ColdWeatherStrategy());

        // when
        List<String> clothesForWeather = context.selectClothes();

        // then
        assertTrue(clothesForWeather.stream()
                .anyMatch(s -> s.contains(COAT)));
    }
}
