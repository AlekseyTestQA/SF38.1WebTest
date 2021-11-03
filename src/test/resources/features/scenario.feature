#Gherkin
Feature: Check skillfactory.ru
	#Позитивный сценарий: выбираем адрес стартовой страницы skillfactory.ru и получаем доступность главной страницы
    Scenario: chose StartPage adres
        Given url of StartPage 'https://skillfactory.ru/'

        And assert that chosen adres is 'Выберите свое будущее:'

    #Позитивный сценарий: выбираем выпадающий список "Курсы" страницы skillfactory.ru и получаем Перечень Курсов
    Scenario: chose CoursesPage curses
        Given url of CoursesPage 'https://skillfactory.ru/'
        Then  chose courses 'ВСЕ КУРСЫ'
        And assert that chosen courses is 'ВСЕ КУРСЫ'

    #Позитивный сценарий: кликам по иконке чат помощника страницы skillfactory.ru и получаем диалоговое окно помощника
    Scenario: chose chatAssistant
        Given url of AssPage 'https://skillfactory.ru/'
        Then  chose chatAssistant 'Задайте вопрос по нашим образовательным программам. Мы отвечаем в течение 10 минут.'
        And assert that chosen chatAssistant is 'Задайте вопрос по нашим образовательным программам. Мы отвечаем в течение 10 минут.'

    #Позитивный сценарий: выбираем ссылку Бесплатно страницы skillfactory.ru и получаем доступность страницы "Бесплатно"
    Scenario: chose FreePage
        Given url of FreePage 'https://skillfactory.ru/'
        Then  chose FreePage 'Бесплатные мероприятия и программы'
        And assert that chosen FreePage is 'Бесплатные мероприятия и программы'

    #Позитивный сценарий: выбираем главную страницу skillfactory.ru проверяем номер телефона skillfactory получаем номер телефона skillfactory
    Scenario: chose PhoneNumber
        Given url of PhoneNumber 'https://skillfactory.ru/'

        And assert that chosen PhoneNumber is '+7 495 291-09-12'

    #Позитивный сценарий: выбираем курс "Data Science" в выпадающем меню "Курсы"  страницы skillfactory.ru и получаем доступность страницы курса "Data Science"
    Scenario: chose CoursesDatascience
        Given url of CoursesPageD 'https://skillfactory.ru/'
        Then  chose CoursesPageD 'ВСЕ КУРСЫ'
        Then  chose CoursesDatasciencePage 'Курсы по Data Science'
        And assert that chosen CoursesDatasciencePage is 'Курсы по Data Science'

#Позитивный сценарий: выбираем курс "Data Science" в выпадающем меню "Курсы"  страницы skillfactory.ru и получаем доступность страницы курса "Курсы по аналитике данных"
    Scenario: chose CoursesAnalitikaDannyh
        Given url of CoursesPageA 'https://skillfactory.ru/'
        Then  chose CoursesPageA 'ВСЕ КУРСЫ'
        Then  chose CoursesAnalitikaDannyhPage 'Курсы по аналитике данных'
        And assert that chosen CoursesAnalitikaDannyhPage is 'Курсы по аналитике данных'

#Позитивный сценарий: выбираем курс "Программирование" в выпадающем меню "Курсы"  страницы skillfactory.ru и получаем доступность страницы курса "Курсы по программированию"
    Scenario: chose CoursesProgrammirovanie
        Given url of CoursesPageP 'https://skillfactory.ru/'
        Then  chose CoursesPageP 'ВСЕ КУРСЫ'
        Then  chose CoursesProgrammirovaniePage 'Курсы по программированию'
        And assert that chosen CoursesProgrammirovaniePage is 'Курсы по программированию'

#Позитивный сценарий: выбираем курс "Веб-разработка" в выпадающем меню "Курсы"  страницы skillfactory.ru и получаем доступность страницы курса "Курсы по веб-разработке"
    Scenario: chose CoursesWebrazrabotka
        Given url of CoursesPageW 'https://skillfactory.ru/'
        Then  chose CoursesPageW 'ВСЕ КУРСЫ'
        Then  chose CoursesWebrazrabotkaPage 'Курсы по веб-разработке'
        And assert that chosen CoursesWebrazrabotkaPage is 'Курсы по веб-разработке'

#Позитивный сценарий: выбираем курс "Backend-разработка" в выпадающем меню "Курсы"  страницы skillfactory.ru и получаем доступность страницы курса "Курсы по Backend-разработке"
    Scenario: chose CoursesBackendRazrabotka
        Given url of CoursesPageB 'https://skillfactory.ru/'
        Then  chose CoursesPageB 'ВСЕ КУРСЫ'
        Then  chose CoursesBackendRazrabotkaPage 'Курсы по Backend-разработке'
        And assert that chosen CoursesBackendRazrabotkaPage is 'Курсы по Backend-разработке'

#Позитивный сценарий: выбираем курс "Тестирование" в выпадающем меню "Курсы"  страницы skillfactory.ru и получаем доступность страницы курса "Курсы по тестированию"
    Scenario: chose CoursesTestirovanie
        Given url of CoursesPageT 'https://skillfactory.ru/'
        Then  chose CoursesPageT 'ВСЕ КУРСЫ'
        Then  chose CoursesTestirovaniePage 'Курсы по тестированию'
        And assert that chosen CoursesTestirovaniePage is 'Курсы по тестированию'

#Позитивный сценарий: выбираем курс "Разработка приложений" в выпадающем меню "Курсы"  страницы skillfactory.ru/catalogue и получаем доступность страницы курса "Курсы по разработке мобильных приложений"
    Scenario: chose CoursesRazrabotkaMobilnyhPrilozheniy
        Given url of CoursesPageM 'https://skillfactory.ru/catalogue'
        Then  chose CoursesPageM 'ВСЕ КУРСЫ'
        Then  chose CoursesRazrabotkaMobilnyhPrilozheniyPage 'Курсы по разработке мобильных приложений'
        And assert that chosen CoursesRazrabotkaMobilnyhPrilozheniyPage is 'Курсы по разработке мобильных приложений'

#Позитивный сценарий: выбираем курс "Кибербезопасность" в выпадающем меню "Курсы"  страницы skillfactory.ru/ и получаем доступность страницы курса "Курсы по кибербезопасности"
    Scenario: chose CoursesKiberbezopasnost
        Given url of CoursesPageK 'https://skillfactory.ru/'
        Then  chose CoursesPageK 'ВСЕ КУРСЫ'
        Then  chose CoursesKiberbezopasnostPage 'Курсы по кибербезопасности'
        And assert that chosen CourseskiberbezopasnostPage is 'Курсы по кибербезопасности'

#Позитивный сценарий: выбираем курс "Инфраструктура" в выпадающем меню "Курсы"  страницы skillfactory.ru/ и получаем доступность страницы курса "Курсы по инфраструктуре"
    Scenario: chose CoursesInfrastructure
        Given url of CoursesPageI 'https://skillfactory.ru/'
        Then  chose CoursesPageI 'ВСЕ КУРСЫ'
        Then  chose CoursesInfrastructurePage 'Курсы по инфраструктуре'
        And assert that chosen CoursesInfrastructurePage is 'Курсы по инфраструктуре'

#Позитивный сценарий: выбираем курс "Маркетинг" в выпадающем меню "Курсы"  страницы skillfactory.ru/ и получаем доступность страницы курса "Курсы по маркетингу"
    Scenario: chose CoursesMarketing
        Given url of CoursesPageMa 'https://skillfactory.ru/'
        Then  chose CoursesPageMa 'ВСЕ КУРСЫ'
        Then  chose CoursesMarketingPage 'Курсы по маркетингу'
        And assert that chosen CoursesMarketingPage is 'Курсы по маркетингу'

#Позитивный сценарий: выбираем курс "Разработка игр" в выпадающем меню "Курсы"  страницы skillfactory.ru/ и получаем доступность страницы курса "Курсы по разработке игр"
    Scenario: chose CoursesRazrabotkaIgr
        Given url of CoursesPageR 'https://skillfactory.ru/'
        Then  chose CoursesPageR 'ВСЕ КУРСЫ'
        Then  chose CoursesRazrabotkaIgrPage 'Курсы по разработке игр'
        And assert that chosen CoursesRazrabotkaIgrPage is 'Курсы по разработке игр'

#Позитивный сценарий: выбираем курс "Дизайн" в выпадающем меню "Курсы"  страницы skillfactory.ru/ и получаем доступность страницы курса "Курсы по дизайну"
    Scenario: chose CoursesDesign
        Given url of CoursesPageDs 'https://skillfactory.ru/'
        Then  chose CoursesPageDs 'ВСЕ КУРСЫ'
        Then  chose CoursesDesignPage 'Курсы по дизайну'
        And assert that chosen CoursesDesignPage is 'Курсы по дизайну'

#Позитивный сценарий: выбираем курс "Управление" в выпадающем меню "Курсы"  страницы skillfactory.ru/ и получаем доступность страницы курса "Курсы по управлению"
    Scenario: chose CoursesUpravlenie
        Given url of CoursesPageU 'https://skillfactory.ru/'
        Then  chose CoursesPageU 'ВСЕ КУРСЫ'
        Then  chose CoursesUpravleniePage 'Курсы по управлению'
        And assert that chosen CoursesUpravleniePage is 'Курсы по управлению'

#Позитивный сценарий: выбираем страницу "Партнерам" в выпадающем меню "Курсы"  страницы skillfactory.ru/ и получаем доступность страницы  "Партнерам"
    Scenario: chose PartnersPage
        Given url of PartnersPage 'https://skillfactory.ru/'
        Then  chose PartnersPage 'Почему вам выгодна наша программа?'
        And assert that chosen PartnersPage is 'Почему вам выгодна наша программа?'

#Позитивный сценарий: выбираем страницу "Компаниям" на главной странице skillfactory.ru/ и получаем доступность страницы  "Компаниям"
    Scenario: chose CorporatePage
        Given url of CorporatePage 'https://skillfactory.ru/'
        Then  chose CorporatePage 'Корпоративное обучение в SkillFactory'
        And assert that chosen CorporatePage is 'Корпоративное обучение в SkillFactory'
