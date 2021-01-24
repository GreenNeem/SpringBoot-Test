package com.example.demo;

import static org.mockito.Mockito.when;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
@AutoConfigureMockMvc
// @WebMvcTest(controllers = HelloController.class)
class DemoApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext wac;

	@MockBean
	private PostMapping innerClass;

	@InjectMocks
	private HelloController helloController;

	@Autowired
	private WebClient webClient;

    @BeforeEach
    void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		//It loads all the application beans and controllers into the context.
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }
	// @Test
	// void helloTesting() {

	// }




	@Test
    void whenNoRequestParam_returnDefault() throws Exception {
		String strReplace="Replace Inner statements.";
		when(innerClass.Greetings()).thenReturn(strReplace);
		Model model = new ExtendedModelMap();
		String output=helloController.index(model);
		Assertions.assertEquals("home", output);
		
		HtmlPage page = this.webClient.getPage("/index.html");
		

        // this.mockMvc.perform(get("/api/people/"))
        //     .andExpect(status().isOk())
        //     // .andExpect(content().string(containsString("Hello world!")))
		// 	.andDo(print());
		
		System.out.print("hello from inner stest:");

	}

}
