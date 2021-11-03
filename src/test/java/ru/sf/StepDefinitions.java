package ru.sf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.assertEquals;


/**
 * Варинаты запуска сценариев:
 * Команда 'mvn clean test' в консоли
 * Через UI intellij IDEA
 */
public class StepDefinitions {

    public static final WebDriver webDriver;
    public static final ChooseStartPage chooseStartPage;
    public static final AdresStartPage adresStartPage;
    public static final ChooseCoursesPage chooseCoursesPage;
    public static final ActiveCoursesPage activeCoursesPage;
    public static final ChooseAssPage chooseAssPage;
    public static final ActiveAssPage activeAssPage;
    public static final ChooseFreePage chooseFreePage;
    public static final ActiveFreePage activeFreePage;
    public static final CheckNumber checkNumber;
    public static final ActiveNumber activeNumber;
    public static final ChooseCoursesDatasciencePage chooseCoursesDatasciencePage;
    public static final ActiveCoursesDatasciencePage activeCoursesDatasciencePage;
    public static final ChooseCoursesAnalitikaDannyhPage chooseCoursesAnalitikaDannyhPage;
    public static final ActiveCoursesAnalitikaDannyhPage activeCoursesAnalitikaDannyhPage;
    public static final ChooseCoursesProgrammirovaniePage chooseCoursesProgrammirovaniePage;
    public static final ActiveCoursesProgrammirovaniePage activeCoursesProgrammirovaniePage;
    public static final ChooseCoursesWebrazrabotkaPage chooseCoursesWebrazrabotkaPage;
    public static final ActiveCoursesWebrazrabotkaPage activeCoursesWebrazrabotkaPage;
    public static final ChooseCoursesBackendRazrabotkaPage chooseCoursesBackendRazrabotkaPage;
    public static final ActiveCoursesBackendRazrabotkaPage activeCoursesBackendRazrabotkaPage;
    public static final ChooseCoursesTestirovaniePage chooseCoursesTestirovaniePage;
    public static final ActiveCoursesTestirovaniePage activeCoursesTestirovaniePage;
    public static final ChooseCoursesRazrabotkaMobilnyhPrilozheniyPage chooseCoursesRazrabotkaMobilnyhPrilozheniyPage;
    public static final ActiveCoursesRazrabotkaMobilnyhPrilozheniyPage activeCoursesRazrabotkaMobilnyhPrilozheniyPage;
    public static final ChooseCoursesKiberbezopasnostPage chooseCoursesKiberbezopasnostPage;
    public static final ActiveCoursesKiberbezopasnostPage activeCoursesKiberbezopasnostPage;
    public static final ChooseCoursesInfrastructurePage chooseCoursesInfrastructurePage;
    public static final ActiveCoursesInfrastructurePage activeCoursesInfrastructurePage;
    public static final ChooseCoursesMarketingPage chooseCoursesMarketingPage;
    public static final ActiveCoursesMarketingPage activeCoursesMarketingPage;
    public static final ChooseCoursesRazrabotkaIgrPage chooseCoursesRazrabotkaIgrPage;
    public static final ActiveCoursesRazrabotkaIgrPage activeCoursesRazrabotkaIgrPage;
    public static final ChooseCoursesDesignPage chooseCoursesDesignPage;
    public static final ActiveCoursesDesignPage activeCoursesDesignPage;
    public static final ChooseCoursesUpravleniePage chooseCoursesUpravleniePage;
    public static final ActiveCoursesUpravleniePage activeCoursesUpravleniePage;
    public static final ChoosePartnersPage choosePartnersPage;
    public static final ActivePartnersPage activePartnersPage;
    public static final ChooseCorporatePage chooseCorporatePage;
    public static final ActiveCorporatePage activeCorporatePage;

    //Процесс инициализации необходимых ресурсов
    static {
        System.setProperty("webdriver.chrome.driver", "D:\\SFWebTest\\Web_Test_38.1\\src\\test\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        webDriver.manage().window().maximize();
        chooseStartPage = new ChooseStartPage(webDriver);
        adresStartPage = new AdresStartPage(webDriver);
        chooseCoursesPage = new ChooseCoursesPage(webDriver);
        activeCoursesPage = new ActiveCoursesPage(webDriver);
        chooseAssPage = new ChooseAssPage(webDriver);
        activeAssPage = new ActiveAssPage(webDriver);
        chooseFreePage = new ChooseFreePage(webDriver);
        activeFreePage = new ActiveFreePage(webDriver);
        checkNumber = new CheckNumber(webDriver);
        activeNumber = new ActiveNumber(webDriver);
        activeCoursesDatasciencePage = new ActiveCoursesDatasciencePage(webDriver);
        chooseCoursesDatasciencePage = new ChooseCoursesDatasciencePage(webDriver);
        activeCoursesAnalitikaDannyhPage = new ActiveCoursesAnalitikaDannyhPage(webDriver);
        chooseCoursesAnalitikaDannyhPage = new ChooseCoursesAnalitikaDannyhPage(webDriver);
        activeCoursesProgrammirovaniePage = new ActiveCoursesProgrammirovaniePage(webDriver);
        chooseCoursesProgrammirovaniePage = new ChooseCoursesProgrammirovaniePage(webDriver);
        activeCoursesWebrazrabotkaPage = new ActiveCoursesWebrazrabotkaPage(webDriver);
        chooseCoursesWebrazrabotkaPage = new ChooseCoursesWebrazrabotkaPage(webDriver);
        activeCoursesBackendRazrabotkaPage = new ActiveCoursesBackendRazrabotkaPage(webDriver);
        chooseCoursesBackendRazrabotkaPage = new ChooseCoursesBackendRazrabotkaPage(webDriver);
        activeCoursesTestirovaniePage = new ActiveCoursesTestirovaniePage(webDriver);
        chooseCoursesTestirovaniePage = new ChooseCoursesTestirovaniePage(webDriver);
        activeCoursesRazrabotkaMobilnyhPrilozheniyPage = new ActiveCoursesRazrabotkaMobilnyhPrilozheniyPage(webDriver);
        chooseCoursesRazrabotkaMobilnyhPrilozheniyPage = new ChooseCoursesRazrabotkaMobilnyhPrilozheniyPage(webDriver);
        activeCoursesKiberbezopasnostPage = new ActiveCoursesKiberbezopasnostPage(webDriver);
        chooseCoursesKiberbezopasnostPage = new ChooseCoursesKiberbezopasnostPage(webDriver);
        activeCoursesInfrastructurePage = new ActiveCoursesInfrastructurePage(webDriver);
        chooseCoursesInfrastructurePage = new ChooseCoursesInfrastructurePage(webDriver);
        activeCoursesMarketingPage = new ActiveCoursesMarketingPage(webDriver);
        chooseCoursesMarketingPage = new ChooseCoursesMarketingPage(webDriver);
        activeCoursesRazrabotkaIgrPage = new ActiveCoursesRazrabotkaIgrPage(webDriver);
        chooseCoursesRazrabotkaIgrPage = new ChooseCoursesRazrabotkaIgrPage(webDriver);
        activeCoursesDesignPage = new ActiveCoursesDesignPage(webDriver);
        chooseCoursesDesignPage = new ChooseCoursesDesignPage(webDriver);
        activeCoursesUpravleniePage = new ActiveCoursesUpravleniePage(webDriver);
        chooseCoursesUpravleniePage = new ChooseCoursesUpravleniePage(webDriver);
        activePartnersPage = new ActivePartnersPage(webDriver);
        choosePartnersPage = new ChoosePartnersPage(webDriver);
        activeCorporatePage = new ActiveCorporatePage(webDriver);
        chooseCorporatePage = new ChooseCorporatePage(webDriver);
    }

    @Given("url of StartPage {string}")
    public void url_of_StartPage(String url) {
        chooseStartPage.go();

    }

    @Then("assert that chosen adres is {string}")
    public void assert_that_сhosen_adres_is(String expectedAdres) {
        final var currentActivePage = adresStartPage.getCurrentActiveStartPage();
        assertEquals(expectedAdres, currentActivePage);
    }

    @Then("assert that user got message {string}")
    public void assert_that_user_got_message(String errorMessage) {
        final var StartPageNotFoundMessage = chooseStartPage.getStartPageNotFoundMessage();
        assertEquals(errorMessage, StartPageNotFoundMessage);
    }

    /////////////////////////////////////////////////////////////////////////////
    @Given("url of CoursesPage {string}")
    public void url_of_courses_page(String string) {
        chooseCoursesPage.go();
    }

    @Then("chose courses {string}")
    public void chose_courses(String courses) {
        chooseCoursesPage.searchCoursesPage(courses);
    }

    @Then("assert that chosen courses is {string}")
    public void assert_that_chosen_courses_is(String expectedAdresСourses) {
        final var currentActiveCoursesPage = activeCoursesPage.getCurrentActiveCoursesPage();
        assertEquals(expectedAdresСourses, currentActiveCoursesPage);
    }

    @Then("assert that user got message Сourses {string}")
    public void assert_that_user_got_message_Сourses(String errorMessage) {
        final var СoursesPageNotFoundMessage = chooseCoursesPage.getСoursesPageNotFoundMessage();
        assertEquals(errorMessage, СoursesPageNotFoundMessage);
    }

    ////////////////////////////////////////////////////////////////////////
    @Given("url of AssPage {string}")
    public void url_of_ass_page(String string) {
        chooseAssPage.go();
    }

    @Then("chose chatAssistant {string}")
    public void chose_chat_assistant(String chatAssistant) {
        chooseAssPage.searchAssPage(chatAssistant);
    }

    @Then("assert that chosen chatAssistant is {string}")
    public void assert_that_chosen_chatAssistant_is(String expectedchatAssistant) {
        final var currentActiveAssPage = activeAssPage.getCurrentActiveAssPage();
        assertEquals(expectedchatAssistant, currentActiveAssPage);
    }

    @Then("assert that user got message chatAssistant {string}")
    public void assert_that_user_got_message_chatAssistant(String errorMessage) {
        final var chatAssistantPageNotFoundMessage = chooseAssPage.getchatAssistantPageNotFoundMessage();
        assertEquals(errorMessage, chatAssistantPageNotFoundMessage);
    }

    ///////////////////////////////////////////////////////////////////////*
    @Given("url of FreePage {string}")
    public void url_of_free_page(String string) {
        chooseFreePage.go();
    }

    @Then("chose FreePage {string}")
    public void chose_free_page(String FreePage) {
        chooseFreePage.searchFreePage(FreePage);
    }

    @Then("assert that chosen FreePage is {string}")
    public void assert_that_chosen_freePage_is(String expectedfreepage) {
        final var currentActiveFreePage = activeFreePage.getCurrentActiveFreePage();
        assertEquals(expectedfreepage, currentActiveFreePage);
    }

    @Then("assert that user got message FreePage {string}")
    public void assert_that_user_got_message_freePage(String errorMessage) {
        final var freePageNotFoundMessage = chooseFreePage.getFreePageNotFoundMessage();
        assertEquals(errorMessage, freePageNotFoundMessage);

    }

    //////////////////////////////////////////////////////////////
    @Given("url of PhoneNumber {string}")
    public void url_of_phone_number(String string) {
        checkNumber.go();
    }

    @Then("assert that chosen PhoneNumber is {string}")
    public void assert_that_chosen_phone_number_is(String expectedNumber) {
        final var currentActiveNumber = activeNumber.getCurrentNumber();
        assertEquals(expectedNumber, currentActiveNumber);
    }

    @Then("assert that user got message PhoneNumber {string}")
    public void assert_that_user_got_message_number(String errorMessage) {
        final var getNumberNotFoundMessage = checkNumber.getNumberNotFoundMessage();
        assertEquals(errorMessage, getNumberNotFoundMessage);
    }

    //////////////////////////////////////////////////////////////////////////////////
    @Given("url of CoursesPageD {string}")
    public void url_of_courses_page_d(String url) {
        chooseCoursesDatasciencePage.go();
    }

    @Then("chose CoursesPageD {string}")
    public void chose_courses_page_d(String Courses) {
        chooseCoursesPage.searchCoursesPage(Courses);
    }

    @Then("chose CoursesDatasciencePage {string}")
    public void chose_courses_datascience_page(String CoursesDatascience) {
        chooseCoursesDatasciencePage.searchCoursesDatasciencePage(CoursesDatascience);
    }

    @Then("assert that chosen CoursesDatasciencePage is {string}")
    public void assert_that_chosen_courses_datascience_page_is(String expectedСoursesDatascience) {
        final var currentActiveCoursesDatasciencePage = activeCoursesDatasciencePage.getCurrentActiveCoursesDatasciencePage();
        assertEquals(expectedСoursesDatascience, currentActiveCoursesDatasciencePage);
    }

    @Then("assert that user got message CoursesDatasciencePage{string}")
    public void assert_that_user_got_message_CoursesDatasciencePage(String errorMessage) {
        final var СoursesDatasciencePageNotFoundMessage = chooseCoursesDatasciencePage.getСoursesDatasciencePageNotFoundMessage();
        assertEquals(errorMessage, СoursesDatasciencePageNotFoundMessage);

    }

    /////////////////////////////////////////////////////////////////////////////////
    @Given("url of CoursesPageA {string}")
    public void url_of_courses_page_a(String url) {
        chooseCoursesAnalitikaDannyhPage.go();
    }

    @Then("chose CoursesPageA {string}")
    public void chose_courses_page_a(String Courses) {
        chooseCoursesPage.searchCoursesPage(Courses);
    }

    @Then("chose CoursesAnalitikaDannyhPage {string}")
    public void chose_courses_analitika_dannyh_page(String CoursesAnalitikaDannyh) {
        chooseCoursesAnalitikaDannyhPage.searchCoursesAnalitikaDannyhPage(CoursesAnalitikaDannyh);
    }

    @Then("assert that chosen CoursesAnalitikaDannyhPage is {string}")
    public void assert_that_chosen_courses_AnalitikaDannyh_page_is(String expectedСoursesAnalitikaDannyh) {
        final var currentActiveCoursesAnalitikaDannyhPage = activeCoursesAnalitikaDannyhPage.getCurrentActiveCoursesAnalitikaDannyhPage();
        assertEquals(expectedСoursesAnalitikaDannyh, currentActiveCoursesAnalitikaDannyhPage);
    }

    @Then("assert that user got message CoursesAnalitikaDannyhPage{string}")
    public void assert_that_user_got_message_CoursesAnalitikaDannyhPage(String errorMessage) {
        final var СoursesAnalitikaDannyhPageNotFoundMessage = chooseCoursesAnalitikaDannyhPage.getCoursesAnalitikaDannyhPageNotFoundMessage();
        assertEquals(errorMessage, СoursesAnalitikaDannyhPageNotFoundMessage);
    }

    //////////////////////////////////////////////////////////////////////////////
    @Given("url of CoursesPageP {string}")
    public void url_of_courses_page_p(String url) {
        chooseCoursesProgrammirovaniePage.go();
    }

    @Then("chose CoursesPageP {string}")
    public void chose_courses_page_p(String Courses) {
        chooseCoursesPage.searchCoursesPage(Courses);
    }

    @Then("chose CoursesProgrammirovaniePage {string}")
    public void chose_courses_programmirovanie_page(String CoursesProgrammirovanie) {
        chooseCoursesProgrammirovaniePage.searchCoursesProgrammirovaniePage(CoursesProgrammirovanie);
    }

    @Then("assert that chosen CoursesProgrammirovaniePage is {string}")
    public void assert_that_chosen_courses_Programmirovanie_page_is(String expectedСoursesProgrammirovanie) {
        final var currentActiveCoursesProgrammirovaniePage = activeCoursesProgrammirovaniePage.getCurrentActiveCoursesProgrammirovaniePage();
        assertEquals(expectedСoursesProgrammirovanie, currentActiveCoursesProgrammirovaniePage);
    }

    @Then("assert that user got message CoursesProgrammirovaniePage{string}")
    public void assert_that_user_got_message_CoursesProgrammirovaniePage(String errorMessage) {
        final var СoursesProgrammirovaniePageNotFoundMessage = chooseCoursesProgrammirovaniePage.getCoursesProgrammirovaniePageNotFoundMessage();
        assertEquals(errorMessage, СoursesProgrammirovaniePageNotFoundMessage);
    }

    ////////////////////////////////////////////////////////////////////////
    @Given("url of CoursesPageW {string}")
    public void url_of_courses_page_w(String url) {
        chooseCoursesWebrazrabotkaPage.go();
    }

    @Then("chose CoursesPageW {string}")
    public void chose_courses_page_W(String Courses) {
        chooseCoursesPage.searchCoursesPage(Courses);
    }

    @Then("chose CoursesWebrazrabotkaPage {string}")
    public void chose_courses_Webrazrabotka_page(String CoursesWebrazrabotka) {
        chooseCoursesWebrazrabotkaPage.searchCoursesWebrazrabotkaPage(CoursesWebrazrabotka);
    }

    @Then("assert that chosen CoursesWebrazrabotkaPage is {string}")
    public void assert_that_chosen_courses_Webrazrabotka_page_is(String expectedСoursesWebrazrabotka) {
        final var currentActiveCoursesWebrazrabotkaPage = activeCoursesWebrazrabotkaPage.getCurrentActiveCoursesProgrammirovaniePage();
        assertEquals(expectedСoursesWebrazrabotka, currentActiveCoursesWebrazrabotkaPage);
    }

    @Then("assert that user got message CoursesWebrazrabotkaPage{string}")
    public void assert_that_user_got_message_CoursesWebrazrabotkaPage(String errorMessage) {
        final var СoursesWebrazrabotkaPageNotFoundMessage = chooseCoursesWebrazrabotkaPage.getCoursesWebrazrabotkaPageNotFoundMessage();
        assertEquals(errorMessage, СoursesWebrazrabotkaPageNotFoundMessage);
    }
    ///////////////////////////////////////////////////////////////////////////////

    @Given("url of CoursesPageB {string}")
    public void url_of_courses_page_B(String url) {
        chooseCoursesBackendRazrabotkaPage.go();
    }

    @Then("chose CoursesPageB {string}")
    public void chose_courses_page_B(String Courses) {
        chooseCoursesPage.searchCoursesPage(Courses);
    }

    @Then("chose CoursesBackendRazrabotkaPage {string}")
    public void chose_courses_BackendRazrabotka_page(String CoursesBackendRazrabotka) {
        chooseCoursesBackendRazrabotkaPage.searchCoursesBackendRazrabotkaPage(CoursesBackendRazrabotka);
    }

    @Then("assert that chosen CoursesBackendRazrabotkaPage is {string}")
    public void assert_that_chosen_courses_BackendRazrabotka_page_is(String expectedСoursesBackendRazrabotka) {
        final var currentActiveCoursesBackendRazrabotkaPage = activeCoursesBackendRazrabotkaPage.getCurrentActiveCoursesBackendRazrabotkaPage();
        assertEquals(expectedСoursesBackendRazrabotka, currentActiveCoursesBackendRazrabotkaPage);
    }

    @Then("assert that user got message CoursesBackendRazrabotkaPage{string}")
    public void assert_that_user_got_message_CoursesBackendRazrabotkaPage(String errorMessage) {
        final var СoursesBackendRazrabotkaPageNotFoundMessage = chooseCoursesBackendRazrabotkaPage.getCoursesBackendRazrabotkaPageNotFoundMessage();
        assertEquals(errorMessage, СoursesBackendRazrabotkaPageNotFoundMessage);
    }

    ////////////////////////////////////////////////////////////////////////////
    @Given("url of CoursesPageT {string}")
    public void url_of_courses_page_T(String url) {
        chooseCoursesTestirovaniePage.go();
    }

    @Then("chose CoursesPageT {string}")
    public void chose_courses_page_T(String Courses) {
        chooseCoursesPage.searchCoursesPage(Courses);
    }

    @Then("chose CoursesTestirovaniePage {string}")
    public void chose_courses_Testirovanie_page(String CoursesTestirovanie) {
        chooseCoursesTestirovaniePage.searchCoursesTestirovaniePage(CoursesTestirovanie);
    }

    @Then("assert that chosen CoursesTestirovaniePage is {string}")
    public void assert_that_chosen_courses_Testirovanie_page_is(String expectedСoursesTestirovanie) {
        final var currentActiveCoursesTestirovaniePage = activeCoursesTestirovaniePage.getCurrentActiveCoursesTestirovaniePage();
        assertEquals(expectedСoursesTestirovanie, currentActiveCoursesTestirovaniePage);
    }

    @Then("assert that user got message CoursesTestirovaniePage{string}")
    public void assert_that_user_got_message_CoursesTestirovaniePage(String errorMessage) {
        final var СoursesTestirovaniePageNotFoundMessage = chooseCoursesTestirovaniePage.getCoursesTestirovaniePageNotFoundMessage();
        assertEquals(errorMessage, СoursesTestirovaniePageNotFoundMessage);
    }

    ///////////////////////////////////////////////////////////////////////////
    @Given("url of CoursesPageM {string}")
    public void url_of_courses_page_M(String url) {
        chooseCoursesRazrabotkaMobilnyhPrilozheniyPage.go();
    }

    @Then("chose CoursesPageM {string}")
    public void chose_courses_page_M(String Courses) {
        chooseCoursesPage.searchCoursesPage(Courses);
    }

    @Then("chose CoursesRazrabotkaMobilnyhPrilozheniyPage {string}")
    public void chose_courses_RazrabotkaMobilnyhPrilozheniy_page(String CoursesRazrabotkaMobilnyhPrilozheniy) {
        chooseCoursesRazrabotkaMobilnyhPrilozheniyPage.searchCoursesRazrabotkaMobilnyhPrilozheniyPage(CoursesRazrabotkaMobilnyhPrilozheniy);
    }

    @Then("assert that chosen CoursesRazrabotkaMobilnyhPrilozheniyPage is {string}")
    public void assert_that_chosen_courses_RazrabotkaMobilnyhPrilozheniy_page_is(String expectedСoursesRazrabotkaMobilnyhPrilozheniy) {
        final var currentActiveCoursesRazrabotkaMobilnyhPrilozheniyPage = activeCoursesRazrabotkaMobilnyhPrilozheniyPage.getCurrentActiveCoursesRazrabotkaMobilnyhPrilozheniyPage();
        assertEquals(expectedСoursesRazrabotkaMobilnyhPrilozheniy, currentActiveCoursesRazrabotkaMobilnyhPrilozheniyPage);
    }

    @Then("assert that user got message CoursesRazrabotkaMobilnyhPrilozheniyPage{string}")
    public void assert_that_user_got_message_CoursesRazrabotkaMobilnyhPrilozheniyPage(String errorMessage) {
        final var СoursesRazrabotkaMobilnyhPrilozheniyPageNotFoundMessage = chooseCoursesRazrabotkaMobilnyhPrilozheniyPage.getCoursesRazrabotkaMobilnyhPrilozheniyPageNotFoundMessage();
        assertEquals(errorMessage, СoursesRazrabotkaMobilnyhPrilozheniyPageNotFoundMessage);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    @Given("url of CoursesPageK {string}")
    public void url_of_courses_page_K(String url) {
        chooseCoursesKiberbezopasnostPage.go();
    }

    @Then("chose CoursesPageK {string}")
    public void chose_courses_page_K(String Courses) {
        chooseCoursesPage.searchCoursesPage(Courses);
    }

    @Then("chose CoursesKiberbezopasnostPage {string}")
    public void chose_courses_Kiberbezopasnost_page(String CoursesKiberbezopasnost) {
        chooseCoursesKiberbezopasnostPage.searchCoursesKiberbezopasnostPage(CoursesKiberbezopasnost);
    }

    @Then("assert that chosen CourseskiberbezopasnostPage is {string}")
    public void assert_that_chosen_courseskiberbezopasnost_page_is(String expectedСoursesKiberbezopasnost) {
        final var currentActiveCoursesKiberbezopasnostPage = activeCoursesKiberbezopasnostPage.getCurrentActiveCoursesKiberbezopasnostPage();
        assertEquals(expectedСoursesKiberbezopasnost, currentActiveCoursesKiberbezopasnostPage);
    }

    @Then("assert that user got message CoursesKiberbezopasnostPage{string}")
    public void assert_that_user_got_message_CoursesKiberbezopasnostPage(String errorMessage) {
        final var СoursesKiberbezopasnostPageNotFoundMessage = chooseCoursesKiberbezopasnostPage.getCoursesKiberbezopasnostPageNotFoundMessage();
        assertEquals(errorMessage, СoursesKiberbezopasnostPageNotFoundMessage);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////
    @Given("url of CoursesPageI {string}")
    public void url_of_courses_page_I(String url) {
        chooseCoursesInfrastructurePage.go();
    }

    @Then("chose CoursesPageI {string}")
    public void chose_courses_page_I(String Courses) {
        chooseCoursesPage.searchCoursesPage(Courses);
    }

    @Then("chose CoursesInfrastructurePage {string}")
    public void chose_courses_Infrastructure_page(String CoursesInfrastructure) {
        chooseCoursesInfrastructurePage.searchCoursesInfrastructurePage(CoursesInfrastructure);
    }

    @Then("assert that chosen CoursesInfrastructurePage is {string}")
    public void assert_that_chosen_coursesInfrastructure_page_is(String expectedСoursesInfrastructure) {
        final var currentActiveCoursesInfrastructurePage = activeCoursesInfrastructurePage.getCurrentActiveCoursesInfrastructurePage();
        assertEquals(expectedСoursesInfrastructure, currentActiveCoursesInfrastructurePage);
    }

    @Then("assert that user got message CoursesInfrastructurePage{string}")
    public void assert_that_user_got_message_CoursesInfrastructurePage(String errorMessage) {
        final var СoursesInfrastructurePageNotFoundMessage = chooseCoursesInfrastructurePage.getCoursesInfrastructurePageNotFoundMessage();
        assertEquals(errorMessage, СoursesInfrastructurePageNotFoundMessage);
    }

    ////////////////////////////////////////////////////////////////////////
    @Given("url of CoursesPageMa {string}")
    public void url_of_courses_page_Ma(String url) {
        chooseCoursesMarketingPage.go();
    }

    @Then("chose CoursesPageMa {string}")
    public void chose_courses_page_Ma(String Courses) {
        chooseCoursesPage.searchCoursesPage(Courses);
    }

    @Then("chose CoursesMarketingPage {string}")
    public void chose_courses_Marketing_page(String CoursesMarketing) {
        chooseCoursesMarketingPage.searchCoursesMarketingPage(CoursesMarketing);
    }

    @Then("assert that chosen CoursesMarketingPage is {string}")
    public void assert_that_chosen_coursesMarketing_page_is(String expectedСoursesMarketing) {
        final var currentActiveCoursesMarketingPage = activeCoursesMarketingPage.getCurrentActiveCoursesMarketingPage();
        assertEquals(expectedСoursesMarketing, currentActiveCoursesMarketingPage);
    }

    @Then("assert that user got message CoursesMarketingPage{string}")
    public void assert_that_user_got_message_CoursesMarketingPage(String errorMessage) {
        final var СoursesMarketingPageNotFoundMessage = chooseCoursesMarketingPage.getCoursesMarketingPageNotFoundMessage();
        assertEquals(errorMessage, СoursesMarketingPageNotFoundMessage);
    }

    //////////////////////////////////////////////////////////////////////
    @Given("url of CoursesPageR {string}")
    public void url_of_courses_page_R(String url) {
        chooseCoursesRazrabotkaIgrPage.go();
    }

    @Then("chose CoursesPageR {string}")
    public void chose_courses_page_R(String Courses) {
        chooseCoursesPage.searchCoursesPage(Courses);
    }

    @Then("chose CoursesRazrabotkaIgrPage {string}")
    public void chose_courses_RazrabotkaIgr_page(String CoursesRazrabotkaIgr) {
        chooseCoursesRazrabotkaIgrPage.searchCoursesRazrabotkaIgrPage(CoursesRazrabotkaIgr);
    }

    @Then("assert that chosen CoursesRazrabotkaIgrPage is {string}")
    public void assert_that_chosen_coursesRazrabotkaIgr_page_is(String expectedСoursesRazrabotkaIgr) {
        final var currentActiveCoursesRazrabotkaIgrPage = activeCoursesRazrabotkaIgrPage.getCurrentActiveCoursesRazrabotkaIgrPage();
        assertEquals(expectedСoursesRazrabotkaIgr, currentActiveCoursesRazrabotkaIgrPage);
    }

    @Then("assert that user got message CoursesRazrabotkaIgrPage{string}")
    public void assert_that_user_got_message_CoursesRazrabotkaIgrPage(String errorMessage) {
        final var СoursesRazrabotkaIgrPageNotFoundMessage = chooseCoursesRazrabotkaIgrPage.getCoursesRazrabotkaIgrPageNotFoundMessage();
        assertEquals(errorMessage, СoursesRazrabotkaIgrPageNotFoundMessage);
    }

    ///////////////////////////////////////////////////////////////////////////
    @Given("url of CoursesPageDs {string}")
    public void url_of_courses_page_Ds(String url) {
        chooseCoursesDesignPage.go();
    }

    @Then("chose CoursesPageDs {string}")
    public void chose_courses_page_Ds(String Courses) {
        chooseCoursesPage.searchCoursesPage(Courses);
    }

    @Then("chose CoursesDesignPage {string}")
    public void chose_courses_Design_page(String CoursesDesign) {
        chooseCoursesDesignPage.searchCoursesDesignPage(CoursesDesign);
    }

    @Then("assert that chosen CoursesDesignPage is {string}")
    public void assert_that_chosen_coursesDesign_page_is(String expectedСoursesDesign) {
        final var currentActiveCoursesDesignPage = activeCoursesDesignPage.getCurrentActiveCoursesDesignPage();
        assertEquals(expectedСoursesDesign, currentActiveCoursesDesignPage);
    }

    @Then("assert that user got message CoursesDesignPage{string}")
    public void assert_that_user_got_message_CoursesDesignPage(String errorMessage) {
        final var СoursesDesignPageNotFoundMessage = chooseCoursesDesignPage.getCoursesDesignPageNotFoundMessage();
        assertEquals(errorMessage, СoursesDesignPageNotFoundMessage);
    }

    ////////////////////////////////////////////////////////////////////
    @Given("url of CoursesPageU {string}")
    public void url_of_courses_page_U(String url) {
        chooseCoursesUpravleniePage.go();
    }

    @Then("chose CoursesPageU {string}")
    public void chose_courses_page_U(String Courses) {
        chooseCoursesPage.searchCoursesPage(Courses);
    }

    @Then("chose CoursesUpravleniePage {string}")
    public void chose_courses_Upravlenie_page(String CoursesUpravlenie) {
        chooseCoursesUpravleniePage.searchCoursesUpravleniePage(CoursesUpravlenie);
    }

    @Then("assert that chosen CoursesUpravleniePage is {string}")
    public void assert_that_chosen_coursesUpravlenie_page_is(String expectedСoursesUpravlenie) {
        final var currentActiveCoursesUpravleniePage = activeCoursesUpravleniePage.getCurrentActiveCoursesUpravleniePage();
        assertEquals(expectedСoursesUpravlenie, currentActiveCoursesUpravleniePage);
    }

    @Then("assert that user got message CoursesUpravleniePage{string}")
    public void assert_that_user_got_message_CoursesUpravleniePage(String errorMessage) {
        final var СoursesUpravleniePageNotFoundMessage = chooseCoursesUpravleniePage.getCoursesUpravleniePageNotFoundMessage();
        assertEquals(errorMessage, СoursesUpravleniePageNotFoundMessage);

    }

    /////////////////////////////////////////////////////////////////////////
    @Given("url of PartnersPage {string}")
    public void url_of_Partners_page_(String url) {
        choosePartnersPage.go();
    }

    @Then("chose PartnersPage {string}")
    public void chose_Partners_page(String Partners) {
        choosePartnersPage.searchPartnersPage(Partners);
    }

    @Then("assert that chosen PartnersPage is {string}")
    public void assert_that_chosen_Partners_page_is(String expectedPartnersPage) {
        final var currentActivePartnersPage = activePartnersPage.getCurrentActivePartnersPage();
        assertEquals(expectedPartnersPage, currentActivePartnersPage);
    }

    @Then("assert that user got message PartnersPage{string}")
    public void assert_that_user_got_message_PartnersPage(String errorMessage) {
        final var PartnersPageNotFoundMessage = choosePartnersPage.getPartnersPageNotFoundMessage();
        assertEquals(errorMessage, PartnersPageNotFoundMessage);
    }
    ///////////////////////////////////////////////////////////////////////////////
    @Given("url of CorporatePage {string}")
    public void url_of_Corporate_page_(String url) {
        chooseCorporatePage.go();
    }

    @Then("chose CorporatePage {string}")
    public void chose_Corporate_page(String Corporate) {
        chooseCorporatePage.searchCorporatePage(Corporate);
    }

    @Then("assert that chosen CorporatePage is {string}")
    public void assert_that_chosen_Corporate_page_is(String expectedCorporatePage) {
        final var currentActiveCorporatePage = activeCorporatePage.getCurrentActiveCorporatePage();
        assertEquals(expectedCorporatePage, currentActiveCorporatePage);
    }

    @Then("assert that user got message CorporatePage{string}")
    public void assert_that_user_got_message_CorporatePage(String errorMessage) {
        final var CorporatePageNotFoundMessage = chooseCorporatePage.getCorporatePageNotFoundMessage();
        assertEquals(errorMessage, CorporatePageNotFoundMessage);
    }
}