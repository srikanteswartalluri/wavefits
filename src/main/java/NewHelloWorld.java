import org.openqa.selenium.chrome.ChromeDriver;

public class NewHelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.setProperty("webdriver.chrome.driver", "/Users/stalluri/Downloads/chromedriver");
        ChromeDriver cd = new ChromeDriver();
        cd.get("https://google.com");
        System.out.println(cd.getTitle());

    }
}
