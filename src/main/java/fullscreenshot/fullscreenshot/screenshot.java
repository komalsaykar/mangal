package fullscreenshot.fullscreenshot;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver =  new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Screenshot scr = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);
		ImageIO.write(scr.getImage(), "PNG", new File("C:\\Users\\HP\\eclipse-workspace\\TestNG_endtoend\\FullScreenshot\\a1.png"));
		

	}


	}


