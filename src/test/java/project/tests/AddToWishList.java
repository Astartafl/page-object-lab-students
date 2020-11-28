package project.tests;

import components.TopBar;
import components.enums.TopMenuComponents;
import org.junit.Before;
import org.junit.Test;
import project.pages.MainPage;
import project.pages.MyAccountPage;

import static components.enums.TopMenuComponents.COMPONENTS;
import static org.assertj.core.api.Assertions.assertThat;

public class AddToWishList extends BaseTest {
    static MainPage mainPage;
    private MyAccountPage myAccountPage;

    @Before
    public void successfulLoginTest() {
        String email = "accountfortestinglogin@mailinator.com";
        String password = "111111";

        mainPage = new MainPage();
        mainPage.openMainPage();

        myAccountPage = mainPage.openMainPage()
                .getTopBar()
                .myAccountButtonClick()
                .loginPageClick()
                .setEmail(email)
                .setPassword(password)
                .submitLoginForm();
    }

    @Test
    public void AddToWishListTest() {
        myAccountPage.getTopMenu()
                .selectCategoryFromDropDown(COMPONENTS)
                .selectSubmenuMonitors();

    }

}

/*всё - объекты
продукт - объект
компоненты - класс под отдельный продукт
в класе есть: драйвер (создается)private static WebDriverWait wait;
конструктор, который инициализирует драйвер
геттер ПродуктБокс
Создаются поля для каждого свойства продукта (цена, картинка и тд)
второй конструктор - сетает все элементы (поля продукта), которые у нас есть
альт+инсерт - конструктор (на вход принимает цена, картинка и тд)
метод гетоллайтемс (все продукты на странице, возвращает лист)
publ List<ProductBox> getAllItems(By boxContainers) ---- by.xpath[div class = "... thumb]
лист продуктбокс = нью еррейлист
цикл переменная имя (ищем в боксЭлементе по хпасу имени (.//h4//a)
нашли имя элемента (эпл синема 30)
ищем кнопку AddToWishList и кликаем
продуктбокс продуктбокс = нью ПродуктБокс(имя, аддТовишЛистБаттон)
продуктБоксес.адд(продуктбокс)ж
ретурн продуктбокс









 */