public class Main {
    public static void main(String[] args){
        //создаем ракету, которая прилетела с земли на луну
        Rocket rocket = new Rocket("Ракета с земли", Material.METAL);
        Rocket.RocketEngine rocketEngine = rocket.new RocketEngine(1999);
        rocket.setEngine(rocketEngine);
        rocketEngine.turnOn();
        try {
            rocket.fly("Луна");
        }
        catch (FlyingObjectNotReadyException e){
            System.out.println(e.getMessage());
            System.out.println("Проверка готовности: ");
            System.out.println("Ракета сломана? " + rocket.getBroken());
            System.out.println("Двигатель запущен? " + rocketEngine.getOn());
        }
        //создаем улицу, сцену и наполняем ее стульями
        Street street = new Street("Улица перед студией");
        Scene scene = new Scene("Главная сцена");
        Auditorium auditorium = new Auditorium("Зрительный зал");
        Chair chair1 = new Chair("Первый стул",Material.METAL);
        Chair chair2 = new Chair("Второй стул",Material.METAL);
        Chair chair3 = new Chair("Третий стул",Material.METAL);
        scene.setFurniture(chair1);
        scene.setFurniture(chair2);
        scene.setFurniture(chair3);
        System.out.println();
        //создаем действующие лица
        Respondent neznaika = new Respondent("Незнайка");
        neznaika.setPlace(scene);
        neznaika.sitDown(chair1);
        Respondent miga = new Respondent("Мига");
        miga.setPlace(scene);
        miga.sitDown(chair2);
        Respondent kozlik = new Respondent("Козлик");
        kozlik.setPlace(scene);
        kozlik.sitDown(chair3);
        System.out.println();
        //создаем тех, кто будет задавать вопросы
        Journalist journalist = new Journalist("Журналюга", Status.CALM,"Luna Today");
        journalist.setPlace(auditorium);
        Scientist scientist = new Scientist("Безумный ученый", Status.SAD, Science.PHYSICS);
        scientist.setPlace(auditorium);
        //диалог
        scientist.ask_about_rocket(rocket);
        neznaika.answer_about_rocket(rocket);
        journalist.ask("Как прошел полет?");
        miga.answer("Хорошо, но было страшно");
        journalist.ask_about_dream();
        neznaika.answer_about_dream("О земле и доме.");
        journalist.ask_about_Earth();
        neznaika.answer_about_Earth("Люди добрые", "Выглядит красиво", "Планета очень нравится");
    }
}
