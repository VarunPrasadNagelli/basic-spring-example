package com.tight.coupling.springtightcoupling;


import com.tight.coupling.springtightcoupling.enterprise.example.controller.MyWebController;
import com.tight.coupling.springtightcoupling.game.GameRunner;
import com.tight.coupling.springtightcoupling.game.MarioGame;
import com.tight.coupling.springtightcoupling.game.superContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringTightCouplingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringTightCouplingApplication.class, args);
//		GameRunner runner = context.getBean(GameRunner.class);
		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());
//		runner.run();
	}

}
