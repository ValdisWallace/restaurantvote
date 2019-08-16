package ru.restaurantvote.web;

import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import ru.restaurantvote.RestaurantsTestData;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class RootControllerTest extends AbstractControllerTest {

    @Test
    public void getRestaurants() throws Exception {
        mockMvc.perform(get("/restaurants"))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(view().name("restaurants"))
                .andExpect(forwardedUrl("/WEB-INF/jsp/restaurants.jsp"));
    }
}
